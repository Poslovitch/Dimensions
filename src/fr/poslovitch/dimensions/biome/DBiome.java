package fr.poslovitch.dimensions.biome;

import java.io.Serializable;

import org.bukkit.block.Biome;

import fr.poslovitch.dimensions.enums.Climate;
import fr.poslovitch.dimensions.generator.BiomeGenerationRules;

/**
 * 
 * @author Poslovitch
 * @version 1.0
 */
public class DBiome implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7869026552140599283L;
	
	String id;
	Biome biome;
	Climate climate;
	BiomeGenerationRules generationRules;
	BiomeSpawnRules spawnRules;
	boolean poisonousWater;
	
	public DBiome(String id, Biome biome, Climate climate, BiomeGenerationRules generationRules, BiomeSpawnRules spawnRules, boolean poisonousWater){
		
	}
	
	public String toString(){
		return "DBiome{id= " + id + ", biome= " + biome + ", climate= " + climate + ", bgr= " + generationRules + ", bsr= " + spawnRules + ", poisonWater= " + poisonousWater + "}";
	}
}
