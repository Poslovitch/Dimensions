package fr.poslovitch.dimensions.generator;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

/**
 * 
 * @author Poslovitch
 * @version 1.0
 */
public class ErosionCalculator {

	private static HashMap<MaterialData, MaterialData> erosionMap = new HashMap<>();
	
	@SuppressWarnings("deprecation")
	public ErosionCalculator(){
		// GRASS --> COARSE DIRT
		erosionMap.put(new MaterialData(Material.GRASS), new MaterialData(Material.DIRT, (byte) 1));
		
		// COARSE DIRT --> SAND
		erosionMap.put(new MaterialData(Material.DIRT, (byte) 1), new MaterialData(Material.SAND));
		
		// STONE --> ANDESITE
		erosionMap.put(new MaterialData(Material.STONE), new MaterialData(Material.STONE, (byte) 5));
		
		// ANDESITE --> COBBLESTONE
		erosionMap.put(new MaterialData(Material.STONE, (byte) 5), new MaterialData(Material.COBBLESTONE));
		
		// COBBLESTONE --> GRAVEL
		erosionMap.put(new MaterialData(Material.COBBLESTONE), new MaterialData(Material.GRAVEL));
		
		// GRAVEL --> CLAY
		erosionMap.put(new MaterialData(Material.GRAVEL), new MaterialData(Material.CLAY));

		// CLAY --> SAND
		erosionMap.put(new MaterialData(Material.CLAY), new MaterialData(Material.SAND));

		// SAND --> AIR
		erosionMap.put(new MaterialData(Material.SAND), new MaterialData(Material.AIR));
	}
	
	/**
	 * Returns the result of the specified MaterialData due to erosion.
	 * @param origin - the original MaterialData which will be eroded.
	 * @return the eroded MaterialData or null if the specified MaterialData cannot be eroded.
	 * @version 1.0
	 */
	public static MaterialData getErosion(MaterialData origin){
		return (erosionMap.containsKey(origin)) ? erosionMap.get(origin) : null;
	}
}
