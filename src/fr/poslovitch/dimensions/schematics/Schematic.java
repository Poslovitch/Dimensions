package fr.poslovitch.dimensions.schematics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

import fr.poslovitch.org.jnbt.ByteArrayTag;
import fr.poslovitch.org.jnbt.CompoundTag;
import fr.poslovitch.org.jnbt.NBTInputStream;
import fr.poslovitch.org.jnbt.ShortTag;
import fr.poslovitch.org.jnbt.StringTag;
import fr.poslovitch.org.jnbt.Tag;

/**
 * 
 * @author Poslovitch
 * @version 1.0
 */
public class Schematic {
	private byte[] blocks;
	private byte[] data;
	private short width;
	private short length;
	private short height;

	public Schematic(byte[] blocks, byte[] data, short width, short length, short height){
		this.blocks = blocks;
		this.data = data;
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public byte[] getBlocks(){return this.blocks;}
	public byte[] getData(){return this.data;}
	public short getWidth(){return this.width;}
	public short getLength(){return this.length;}
	public short getHeight(){return this.height;}

	public final List<Location> paste(Location loc){
		return paste(loc.getWorld(), loc.getX(), loc.getY(), loc.getZ());
	}

	@SuppressWarnings("deprecation")
	public final List<Location> paste(World locWorld, double locX, double locY, double locZ){
		List<Location> locations = new ArrayList<Location>();
		int[] root = getRoot();

		double xOrigin = locX - root[0];
		double zOrigin = locZ - root[1];
		for (int x = 0; x < this.width; x++) {
			for (int y = 0; y < this.height; y++) {
				for (int z = 0; z < this.length; z++){
					int index = y * this.width * this.length + z * this.width + x;
					int b = this.blocks[index] & 0xFF;
					Material material = Material.getMaterial(b);
					if (material != Material.AIR){
						Location location = new Location(locWorld, xOrigin + x, locY + y, zOrigin + z);
						Block block = location.getBlock();
						block.setType(material);
						block.setData(this.data[index]);

						locations.add(location);
					}
				}
			}
		}
		return locations;
	}

	public static Schematic loadSchematic(File file) throws IOException{
		FileInputStream stream = new FileInputStream(file);
		NBTInputStream nbtStream = new NBTInputStream(stream);

		CompoundTag schematicTag = (CompoundTag)nbtStream.readTag();
		nbtStream.close();
		if (!schematicTag.getName().equals("Schematic")) {
			throw new IllegalArgumentException("Tag \"Schematic\" does not exist or is not first");
		}
		Map<String, Tag> schematic = schematicTag.getValue();
		if (!schematic.containsKey("Blocks")) {
			throw new IllegalArgumentException("Schematic file is missing a \"Blocks\" tag");
		}
		short width = ((ShortTag)getChildTag(schematic, "Width", ShortTag.class)).getValue().shortValue();
		short length = ((ShortTag)getChildTag(schematic, "Length", ShortTag.class)).getValue().shortValue();
		short height = ((ShortTag)getChildTag(schematic, "Height", ShortTag.class)).getValue().shortValue();

		String materials = ((StringTag)getChildTag(schematic, "Materials", StringTag.class)).getValue();
		if (!materials.equals("Alpha")) {
			throw new IllegalArgumentException("Schematic file is not an Alpha schematic");
		}
		byte[] blocks = ((ByteArrayTag)getChildTag(schematic, "Blocks", ByteArrayTag.class)).getValue();
		byte[] blockData = ((ByteArrayTag)getChildTag(schematic, "Data", ByteArrayTag.class)).getValue();
		return new Schematic(blocks, blockData, width, length, height);
	}

	private static <T extends Tag> Tag getChildTag(Map<String, Tag> items, String key, Class<T> expected)
			throws IllegalArgumentException{
		if (!items.containsKey(key)){
			throw new IllegalArgumentException("Schematic file is missing a \"" + key + "\" tag");
		}
		Tag tag = (Tag)items.get(key);
		if (!expected.isInstance(tag)){
			throw new IllegalArgumentException(key + " tag is not of tag type " + expected.getName());
		}
		return (Tag)expected.cast(tag); //Problem with return (originally returns T instead of Tag)
	}

	@SuppressWarnings("deprecation")
	private final int[] getRoot(){
		for (int x = 0; x < this.width; x++) {
			for (int z = 0; z < this.length; z++){
				int index = 0 * this.width * this.length + z * this.width + x;
				int b = this.blocks[index] & 0xFF;
				Material material = Material.getMaterial(b);
				if (material != Material.AIR) {
					return new int[] { x, z };
				}
			}
		}
		return new int[] { this.width / 2, this.length / 2 };
	}
}
