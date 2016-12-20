package fr.poslovitch.dimensions.generator;

import java.util.List;

import org.bukkit.material.MaterialData;

import fr.poslovitch.dimensions.enums.DStructure;
import fr.poslovitch.dimensions.enums.DTree;

/**
 * This object handles every option to generate a biome.
 * @author Poslovitch
 * @version 1.0
 */
public class BiomeGenerationRules {
	
	boolean caves, ravines;
	boolean mineshafts, villages, temples, dungeons;
	boolean waterLakes, lavaLakes;
	MaterialData ground;
	int averageGroundLayer;
	List<DTree> treeTypes;
	int averageTrees;
	List<DStructure> structures;
	int averageStructures;
	List<MaterialData> vegetation;
	Vegetation vegetationDistribution;
	Erosion erosion;
	
	int coalVeinSize, coalVeinTries, coalMinHeight, coalMaxHeight;
	int ironVeinSize, ironVeinTries, ironMinHeight, ironMaxHeight;
	int lapisVeinSize, lapisVeinTries, lapisMinHeight, lapisMaxHeight;
	int goldVeinSize, goldVeinTries, goldMinHeight, goldMaxHeight;
	int redstoneVeinSize, redstoneVeinTries, redstoneMinHeight, redstoneMaxHeight;
	int diamondVeinSize, diamondVeinTries, diamondMinHeight, diamondMaxHeight;
	int emeraldVeinSize, emeraldVeinTries, emeraldMinHeight, emeraldMaxHeight;
	
	public BiomeGenerationRules(boolean caves, boolean ravines, boolean mineshafts, boolean villages, boolean temples, boolean dungeons,
			boolean waterLakes, boolean lavaLakes, MaterialData ground, int averageGroundLayer, List<DTree> treeTypes, int averageTrees,
			List<DStructure> structures, int averageStructures, List<MaterialData> vegetation, Vegetation vegetationDistribution, Erosion erosion, int coalVeinSize, int coalVeinTries,
			int coalMinHeight, int coalMaxHeight, int ironVeinSize, int ironVeinTries, int ironMinHeight, int ironMaxHeight, int lapisVeinSize,
			int lapisVeinTries, int lapisMinHeight, int lapisMaxHeight, int goldVeinSize, int goldVeinTries, int goldMinHeight, int goldMaxHeight,
			int redstoneVeinSize, int redstoneVeinTries, int redstoneMinHeight, int redstoneMaxHeight, int diamondVeinSize, int diamondVeinTries,
			int diamondMinHeight, int diamondMaxHeight, int emeraldVeinSize, int emeraldVeinTries, int emeraldMinHeight, int emeraldMaxHeight){
		
		this.caves = caves;
		this.ravines = ravines;
		this.mineshafts = mineshafts;
		this.villages = villages;
		this.temples = temples;
		this.dungeons = dungeons;
		this.waterLakes = waterLakes;
		this.lavaLakes = lavaLakes;
		this.ground = ground;
		this.averageGroundLayer = averageGroundLayer;
		this.treeTypes = treeTypes;
		this.averageTrees = averageTrees;
		this.structures = structures;
		this.averageStructures = averageStructures;
		this.vegetation = vegetation;
		this.vegetationDistribution = vegetationDistribution;
		this.erosion = erosion;
		this.coalVeinSize = coalVeinSize;
		this.coalVeinTries = coalVeinTries;
		this.coalMinHeight = coalMinHeight;
		this.coalMaxHeight = coalMaxHeight;
		this.ironVeinSize = ironVeinSize;
		this.ironVeinTries = ironVeinTries;
		this.ironMinHeight = ironMinHeight;
		this.ironMaxHeight = ironMaxHeight;
		this.lapisVeinSize = lapisVeinSize;
		this.lapisVeinTries = lapisVeinTries;
		this.lapisMinHeight = lapisMinHeight;
		this.lapisMaxHeight = lapisMaxHeight;
		this.goldVeinSize = goldVeinSize;
		this.goldVeinTries = goldVeinTries;
		this.goldMinHeight = goldMinHeight;
		this.goldMaxHeight = goldMaxHeight;
		this.redstoneVeinSize = redstoneVeinSize;
		this.redstoneVeinTries = redstoneVeinTries;
		this.redstoneMinHeight = redstoneMinHeight;
		this.redstoneMaxHeight = redstoneMaxHeight;
		this.diamondVeinSize = diamondVeinSize;
		this.diamondVeinTries = diamondVeinTries;
		this.diamondMinHeight = diamondMinHeight;
		this.diamondMaxHeight = diamondMaxHeight;
		this.emeraldVeinSize = emeraldVeinSize;
		this.emeraldVeinTries = emeraldVeinTries;
		this.emeraldMinHeight = emeraldMinHeight;
		this.emeraldMaxHeight = emeraldMaxHeight;
	}
	
	public enum Erosion{
		NONE, LIGHT, SMOOTH, HARD;
	}
	
	public enum Vegetation{
		NONE, DISSEMINATED, NORMAL, ABUNDANT;
	}
	
	public enum Relief{
		SMOOTH, NORMAL, ROUGH;
	}
}
