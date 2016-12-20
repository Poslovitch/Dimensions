package fr.poslovitch.dimensions.biome;

import org.bukkit.block.Biome;

import fr.poslovitch.dimensions.enums.Climate;

/**
 * 
 * @author Poslovitch
 * @version 1.0
 */
public class DBiome{
	
	String id;
	Biome biome;
	Climate climate;
	BiomeGenerationRules generationRules;
	BiomeSpawnRules spawnRules;
	boolean poisonousWater, allowRivers;
	
	public DBiome(String id, Biome biome, Climate climate, boolean poisonousWater, boolean allowRivers){
		this.id = id;
		this.biome = biome;
		this.climate = climate;
		this.generationRules = new BiomeGenerationRules();
		this.spawnRules = new BiomeSpawnRules();
		this.poisonousWater = poisonousWater;
		this.allowRivers = allowRivers;
	}
	
	public DBiome(String id, Biome biome, Climate climate, BiomeGenerationRules generationRules, BiomeSpawnRules spawnRules, boolean poisonousWater, boolean allowRivers){
		this.id = id;
		this.biome = biome;
		this.climate = climate;
		this.generationRules = generationRules;
		this.spawnRules = spawnRules;
		this.poisonousWater = poisonousWater;
		this.allowRivers = allowRivers;
	}
	
	public void setID(String id){this.id = id;}
	public String getID(){return this.id;}
	
	public void setBiome(Biome biome){this.biome = biome;}
	public Biome getBiome(){return this.biome;}
	
	public void setClimate(Climate climate){this.climate = climate;}
	public Climate getClimate(){return this.climate;}
	
	public void setBiomeGenerationRules(BiomeGenerationRules generationRules){this.generationRules = generationRules;}
	public BiomeGenerationRules getBiomeGenerationRules(){return this.generationRules;}
	
	public void setBiomeSpawnRules(BiomeSpawnRules spawnRules){this.spawnRules = spawnRules;}
	public BiomeSpawnRules getBiomeSpawnRules(){return this.spawnRules;}
	
	public void setWaterPoisonous(boolean poisonousWater){this.poisonousWater = poisonousWater;}
	public boolean isWaterPoisonous(){return this.poisonousWater;}
	
	public void setAllowRivers(boolean allowRivers){this.allowRivers = allowRivers;}
	public boolean allowRivers(){return this.allowRivers;}
}
