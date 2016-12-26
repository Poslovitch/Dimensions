package fr.poslovitch.dimensions.biome;

import org.bukkit.block.Biome;

import fr.poslovitch.dimensions.API.Effects;
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
	boolean allowRivers;
	Effects biomeEffects;
	
	public DBiome(String id, Biome biome, Climate climate, boolean allowRivers){
		this.id = id;
		this.biome = biome;
		this.climate = climate;
		this.generationRules = new BiomeGenerationRules();
		this.spawnRules = new BiomeSpawnRules();
		this.allowRivers = allowRivers;
		this.biomeEffects = new Effects();
	}
	
	public DBiome(String id, Biome biome, Climate climate, BiomeGenerationRules generationRules, BiomeSpawnRules spawnRules, Effects biomeEffects, boolean allowRivers){
		this.id = id;
		this.biome = biome;
		this.climate = climate;
		this.generationRules = generationRules;
		this.spawnRules = spawnRules;
		this.allowRivers = allowRivers;
		this.biomeEffects = biomeEffects;
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
	
	public void setAllowRivers(boolean allowRivers){this.allowRivers = allowRivers;}
	public boolean allowRivers(){return this.allowRivers;}
	
	public void setBiomeEffects(Effects effects){this.biomeEffects = effects;}
	public Effects getBiomeEffects(){return this.biomeEffects;}
}
