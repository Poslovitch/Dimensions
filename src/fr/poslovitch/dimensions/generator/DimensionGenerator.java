package fr.poslovitch.dimensions.generator;

import java.util.HashMap;
import java.util.Random;

import fr.poslovitch.dimensions.biome.DBiome;

/**
 * 
 * @author Poslovitch
 * @version 1.0
 */
public class DimensionGenerator {

	public static enum DimensionType{
		OVERWORLD_VANILLA;

		private DimensionType() {}
	}

	public static enum BiomeSize{
		SMALL(0.5),  MEDIUM(0.75), NORMAL(1.0), BIG(1.5),  LARGE(2.0), HUGE(3.0);

		private final double value;

		private BiomeSize(double value){
			this.value = value;
		}

		public double getValue(){
			return this.value;
		}
	}
	
	private long seed;
	private int seaLevel;
	private boolean useLavaOceans;
	private boolean generateOres;
	private boolean generateStrongholds, generateWaterMonuments;
	private DimensionType dimensionType;
	private BiomeSize biomeSize;
	private HashMap<DBiome, Integer> biomes;
	private BiomeAttributionCalculator bac;
	
	public DimensionGenerator(long seed, int seaLevel, DimensionType type, BiomeSize size){
		this.seed = seed;
		this.seaLevel = seaLevel;
		this.dimensionType = type;
		this.biomeSize = size;
		
		this.useLavaOceans = false;
		this.generateOres = true;
		this.generateStrongholds = false;
		this.generateWaterMonuments = false;
		this.biomes = new HashMap<DBiome, Integer>();
		this.bac = null;
	}
	
	public long getSeed(){return this.seed;}
	public int getSeaLevel(){return this.seaLevel;}
	public boolean useLavaOceans(){return this.useLavaOceans;}
	public boolean generateOres(){return this.generateOres;}
	public boolean generateStrongholds(){return this.generateStrongholds;}
	public boolean generateWaterMonuments(){return this.generateWaterMonuments;}
	public DimensionType getDimensionType(){return this.dimensionType;}
	public BiomeSize getBiomeSize(){return this.biomeSize;}
	public HashMap<DBiome, Integer> getBiomesProbabilities(){return this.biomes;}
	public BiomeAttributionCalculator getBiomeAttributionCalculator(){return this.bac;}
	
	public void setUseLavaOceans(boolean use){this.useLavaOceans = use;}
	public void setGenerateOres(boolean generate){this.generateOres = generate;}
	public void setGenerateStrongholds(boolean generate){this.generateStrongholds = generate;}
	public void setGenerateWaterMonuments(boolean generate){this.generateWaterMonuments = generate;}
	public void setBiomes(HashMap<DBiome, Integer> biomes){this.biomes = biomes;}
	public void setBiomeAttribuationCalculator(BiomeAttributionCalculator bac){this.bac = bac;}
}
