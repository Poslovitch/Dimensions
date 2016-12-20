package fr.poslovitch.dimensions.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import fr.poslovitch.dimensions.enums.DStructure;
import fr.poslovitch.dimensions.enums.DTree;

/**
 * This object handles every option to generate a biome.
 * @author Poslovitch
 * @version 1.0
 */
public class BiomeGenerationRules {
	
	private int averageSizeInChunks;
	private List<TerrainType> terrainTypes;
	private boolean caves, ravines;
	private boolean mineshafts, villages, temples, dungeons;
	private boolean waterLakes, lavaLakes;
	private MaterialData ground;
	private int averageGroundLayer;
	private List<DTree> treeTypes;
	private int averageTrees;
	private List<DStructure> structures;
	private int averageStructures;
	private List<MaterialData> vegetation;
	private Vegetation vegetationDistribution;
	private Erosion erosion;
	private Relief relief;
	
	private int coalVeinSize, coalVeinTries, coalMinHeight, coalMaxHeight;
	private int ironVeinSize, ironVeinTries, ironMinHeight, ironMaxHeight;
	private int lapisVeinSize, lapisVeinTries, lapisMinHeight, lapisMaxHeight;
	private int goldVeinSize, goldVeinTries, goldMinHeight, goldMaxHeight;
	private int redstoneVeinSize, redstoneVeinTries, redstoneMinHeight, redstoneMaxHeight;
	private int diamondVeinSize, diamondVeinTries, diamondMinHeight, diamondMaxHeight;
	private int emeraldVeinSize, emeraldVeinTries, emeraldMinHeight, emeraldMaxHeight;
	
	/**
	 * Instantiate a BiomeGenerationRules object, who stores all informations about the DBiome's generation.
	 * <p>
	 * All values will be set to default. Modify what you want using the setters methods.
	 * @version 1.0
	 */
	public BiomeGenerationRules(){
		this.averageSizeInChunks = 32;
		this.terrainTypes = Arrays.asList(TerrainType.PLAINS);
		this.caves = true;
		this.ravines = true;
		this.mineshafts = true;
		this.villages = true;
		this.temples = true;
		this.dungeons = true;
		this.waterLakes = true;
		this.lavaLakes = true;
		this.ground = new MaterialData(Material.GRASS);
		this.averageGroundLayer = 3;
		this.treeTypes = new ArrayList<>();
		this.averageTrees = 0;
		this.structures = new ArrayList<>();
		this.averageStructures = 0;
		this.vegetation = new ArrayList<>();
		this.vegetationDistribution = Vegetation.NORMAL;
		this.erosion = Erosion.NONE;
		this.relief = Relief.NORMAL;
		this.coalVeinSize = 17;
		this.coalVeinTries = 20;
		this.coalMinHeight = 0;
		this.coalMaxHeight = 128;
		this.ironVeinSize = 9;
		this.ironVeinTries = 20;
		this.ironMinHeight = 0;
		this.ironMaxHeight = 64;
		this.lapisVeinSize = 7;
		this.lapisVeinTries = 1;
		this.lapisMinHeight = 0;
		this.lapisMaxHeight = 32;
		this.goldVeinSize = 9;
		this.goldVeinTries = 2;
		this.goldMinHeight = 0;
		this.goldMaxHeight = 32;
		this.redstoneVeinSize = 8;
		this.redstoneVeinTries = 8;
		this.redstoneMinHeight = 0;
		this.redstoneMaxHeight = 16;
		this.diamondVeinSize = 8;
		this.diamondVeinTries = 1;
		this.diamondMinHeight = 0;
		this.diamondMaxHeight = 16;
		this.emeraldVeinSize = 1;
		this.emeraldVeinTries = 1;
		this.emeraldMinHeight = 0;
		this.emeraldMaxHeight = 16;
	}
	
	/**
	 * Set the biome's average size in chunks (default is <strong>32</strong>)
	 * @param size : the size in chunks
	 */
	public void setAverageSizeInChunks(int size){this.averageSizeInChunks = size;}
	
	/**
	 * @return the biome's average size in chunks
	 */
	public int getAverageSizeInChunks(){return this.averageSizeInChunks;}
	
	/**
	 * Set the biome's terrain types (default is <strong>only PLAINS</strong>)
	 * @param types : the terrain types list
	 */
	public void setTerrainTypes(List<TerrainType> types){this.terrainTypes = types;}
	
	/**
	 * @return the biome's terrain types list
	 */
	public List<TerrainType> getTerrainTypes(){return this.terrainTypes;}
	
	public enum Erosion{
		NONE, LIGHT, SMOOTH, HARD;
	}
	
	public enum Vegetation{
		NONE, DISSEMINATED, NORMAL, ABUNDANT;
	}
	
	public enum Relief{
		LOW, NORMAL, HIGH;
	}
}
