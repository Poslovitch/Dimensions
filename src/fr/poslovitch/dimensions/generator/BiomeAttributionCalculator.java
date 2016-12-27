package fr.poslovitch.dimensions.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;

import org.bukkit.Chunk;
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
	private List<BiomeProbability> probabilities = new ArrayList<BiomeProbability>();

	public BiomeAttributionCalculator(World world, List<BiomeProbability> probabilities, long seed){
		this.world = world;
		this.probabilities = probabilities;
		this.seed = seed;
	}

	/**
	 * Assign a biome to the specified chunk.
	 * <p>
	 * Called when a ChunkGenerateEvent is fired.
	 * @param chunk
	 */
	public void assignChunk(Chunk chunk){
		// Check if world is the same
		if(chunk.getWorld() != world) return;

		// Attribution des biomes
		/// On parcourt tous les chunks dans un rayon de 10 chunks
		
		boolean nearbyAssigned = false;
		for (Chunk c : getChunksAround(chunk, 10)){
			if(attribution.containsKey(c)){ // A nearby chunk is already assigned. Don't choose randomly the specified chunk's biome.
				nearbyAssigned = true;
			}
		}
		
		// Any chunk is already assigned nearby. Choose randomly.
		if(!nearbyAssigned){
			attribution.put(chunk, selectBiome());
		}
		
		//Faire une loop jusqu'à ce que tous les chunks dans un rayon de 10*10 soient assignés.
	}

	public boolean isChunkAssigned(Chunk c){return attribution.containsKey(c);}

	public HashMap<Chunk, DBiome> getAttribution(){
		return (HashMap<Chunk, DBiome>) Collections.unmodifiableMap(attribution);
	}

	public World getWorld(){return this.world;}
	public long getSeed(){return this.seed;}
	public List<BiomeProbability> getProbabilities(){return this.probabilities;}

	/**
	 * "En gros, elle sert à vérifier les chunks autour" - PYRRH4, 26/12/2016 00:36
	 * @author PYRRH4
	 */
	private ArrayList<Chunk> getChunksAround(Chunk chunk, int radius){
		ArrayList<Chunk> chunks = new ArrayList<Chunk>();
		World world = chunk.getWorld();
		int initX = chunk.getX();
		int initZ = chunk.getZ();

		for (int x = -radius; x <= radius; x++) {
			for (int z = -radius; z <= radius; z++) {
				Chunk ch = world.getChunkAt(initX + x, initZ + z);
				if (!chunk.equals(ch)) chunks.add(ch);
			}
		}

		return chunks;
	}

	// This method chooses between a list of biomes by their probability.//TODO refaire
	private DBiome selectBiome(ArrayList<DBiome> biomes){
		DBiome biome = null;
		while(biome == null){
			int rand = (int)(Math.random() * 100 + 1); // Random 1 - 100
			for(Entry<DBiome, Integer> entry : probabilities.entrySet()){
				if(entry.getValue() < rand) biome = entry.getKey(); 
			}
		}
		return biome;
	}
	
	// This method chooses between all Dimension's biomes by their probability.
	private DBiome selectBiome(){
		int total = 0;
		for(BiomeProbability bp : probabilities){
			total += bp.getProbability();
		}
		int index = new Random().nextInt(total);
		int sum=0, i=0;
		
		while(sum < index){
			sum += probabilities.get(i++).getProbability();
		}
		
		return probabilities.get(Math.max(0, i-1)).getBiome();
	}
	
	public class BiomeProbability{
		private DBiome biome;
		private int probability;
		
		BiomeProbability(DBiome biome, Integer probability){
			this.biome = biome;
			this.probability = probability;
		}
		
		public DBiome getBiome(){return this.biome;}
		public int getProbability(){return this.probability;}
	}
}
