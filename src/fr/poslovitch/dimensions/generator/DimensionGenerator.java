package fr.poslovitch.dimensions.generator;

import java.util.HashMap;

import fr.poslovitch.dimensions.biome.DBiome;

public class DimensionGenerator {

	public static enum DimensionType{
		OVERWORLD_VANILLA;

		private DimensionType() {}
	}

	public static enum TemperatureVariationScheme{
		LATITUDE,  SMALL_ZONES,  MEDIUM_ZONES,  LARGE_ZONES,  RANDOM;

		private TemperatureVariationScheme() {}
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
	
	long seed;
	int seaLevel;
	boolean useLavaOceans;
	boolean generateOres;
	boolean generateStrongholds, generateWaterMonuments;
	DimensionType dimensionType;
	TemperatureVariationScheme tempScheme;
	BiomeSize biomeSize;
	HashMap<DBiome, Integer> biomes;
	
	public DimensionGenerator(){
	}
}
