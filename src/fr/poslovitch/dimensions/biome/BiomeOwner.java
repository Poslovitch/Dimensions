package fr.poslovitch.dimensions.biome;

/**
 * This enum allow Dimensions to know who generated a biome - itself, a 3rd party plugin using Dimensions' API or other (Minecraft).
 * @author Poslovitch
 * @version 1.0
 */
public enum BiomeOwner {
	DIMENSIONS, API, OTHER;
	
	private BiomeOwner(){}
}
