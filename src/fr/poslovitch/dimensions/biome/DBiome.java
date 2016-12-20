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
	
	BiomeOwner owner;
	String id;
	Biome biome;
	Climate climate;
	BiomeGenerationRules generationRules;
	BiomeSpawnRules spawnRules;
	
	public DBiome(BiomeOwner owner, String id, Biome biome, Climate climate, BiomeGenerationRules generationRules, BiomeSpawnRules spawnRules){
		
	}
}
