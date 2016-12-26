package fr.poslovitch.dimensions.generator;

import java.util.Collections;
import java.util.HashMap;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;

import fr.poslovitch.dimensions.biome.DBiome;

/**
 * 
 * @author PYRRH4 & Poslovitch
 * @version 1.0
 */
public class BiomeAttributionCalculator {

	private World world; //World security
	private long seed;
	private HashMap<Chunk, DBiome> attribution = new HashMap<Chunk, DBiome>();
	private HashMap<DBiome, Integer> probabilities = new HashMap<DBiome, Integer>();

	public BiomeAttributionCalculator(World world, HashMap<DBiome, Integer> probabilities, long seed){
		this.world = world;
		this.probabilities = probabilities;
		this.seed = seed;
	}

	public void assignFromLoc(Location l){
		Chunk chunk = l.getChunk();

		if(attribution.containsKey(chunk)) return;

		//If already nearby chunks (
	}



	public boolean isChunkAssigned(Location l){return isChunkAssigned(l.getChunk());}
	public boolean isChunkAssigned(Chunk c){return attribution.containsKey(c);}

	public HashMap<Chunk, DBiome> getAttribution(){
		return (HashMap<Chunk, DBiome>) Collections.unmodifiableMap(attribution);
	}

	public World getWorld(){return this.world;}
	public long getSeed(){return this.seed;}
	public HashMap<DBiome, Integer> getProbabilities(){return this.probabilities;}
}
