package fr.poslovitch.dimensions.generator;

public class DimensionGenerator {

	public static enum LandType{
		VANILLA,  CONTINENTS;

		private LandType() {}
	}

	public static enum TemperatureVariationScheme{
		LATITUDE,  SMALL_ZONES,  MEDIUM_ZONES,  LARGE_ZONES,  RANDOM;

		private TemperatureVariationScheme() {}
	}

	public static enum BiomeSize{
		TINY(2),  SMALL(3),  MEDIUM(4),  LARGE(5),  HUGE(6);

		private final int value;

		private BiomeSize(int value){
			this.value = value;
		}

		public int getValue(){
			return this.value;
		}
	}

	long seed;
	int seaLevel;
	boolean useLavaOceans;
	boolean generateOres;
	LandType landType;
	TemperatureVariationScheme tempScheme;
	BiomeSize biomeSize;
}
