package fr.poslovitch.dimensions.biome;

import org.bukkit.block.Biome;

import fr.poslovitch.dimensions.enums.Climate;
import fr.poslovitch.dimensions.generator.BiomeGenerationRules;

/**
 * 
 * @author Poslovitch
 * @version 1.0
 */
public class DBiome {
	
	String id;
	Biome biome;
	Climate climate;
	BiomeGenerationRules generationRules;
	BiomeSpawnRules spawnRules;
	boolean poisonousWater;
	
	public DBiome(String id, Biome biome, Climate climate, BiomeGenerationRules generationRules, BiomeSpawnRules spawnRules, boolean poisonousWater){
		
	}
}
