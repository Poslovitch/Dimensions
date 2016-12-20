package fr.poslovitch.dimensions.biome;

import java.util.List;

import org.bukkit.block.Biome;

import fr.poslovitch.dimensions.enums.Climate;
import fr.poslovitch.dimensions.generator.BiomeGenerationRules;
import fr.poslovitch.dimensions.generator.TerrainType;

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
	int averageSizeInChunks;
	List<TerrainType> terrainTypes;
	BiomeGenerationRules rules;
	boolean canEntitySpawn;
	
	public DBiome(BiomeOwner owner, String id, Biome biome, Climate climate, int averageSizeInChunks, List<TerrainType> terrainTypes, BiomeGenerationRules rules, boolean canEntitySpawn){
		
	}
}
