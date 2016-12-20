package fr.poslovitch.dimensions.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import fr.poslovitch.dimensions.enums.DStructure;
import fr.poslovitch.dimensions.enums.DTree;

/**
 * This object handles every option to generate a biome.
 * @author Poslovitch
 * @version 1.0
 */
public class BiomeGenerationRules {
	
	private int averageSizeInChunks;
	private List<TerrainType> terrainTypes;
	private boolean caves, ravines;
	private boolean mineshafts, villages, temples, dungeons;
	private boolean waterLakes, lavaLakes;
	private MaterialData ground;
	private int averageGroundLayer;
	private List<DTree> treeTypes;
	private int averageTrees;
	private List<DStructure> structures;
	private int averageStructures;
	private List<MaterialData> vegetation;
	private Vegetation vegetationDistribution;
	private Erosion erosion;
	private Relief relief;
	
	private int coalVeinSize, coalVeinTries, coalMinHeight, coalMaxHeight;
	private int ironVeinSize, ironVeinTries, ironMinHeight, ironMaxHeight;
	private int lapisVeinSize, lapisVeinTries, lapisMinHeight, lapisMaxHeight;
	private int goldVeinSize, goldVeinTries, goldMinHeight, goldMaxHeight;
	private int redstoneVeinSize, redstoneVeinTries, redstoneMinHeight, redstoneMaxHeight;
	private int diamondVeinSize, diamondVeinTries, diamondMinHeight, diamondMaxHeight;
	private int emeraldVeinSize, emeraldVeinTries, emeraldMinHeight, emeraldMaxHeight;
	
	/**
	 * Instantiate a BiomeGenerationRules object, who stores all informations about the DBiome's generation.
	 * <p>
	 * All values will be set to default. Modify what you want using the setters methods.
	 * @version 1.0
	 */
	public BiomeGenerationRules(){
		this.averageSizeInChunks = 32;
		this.terrainTypes = Arrays.asList(TerrainType.PLAINS);
		this.caves = true;
		this.ravines = true;
		this.mineshafts = true;
		this.villages = true;
		this.temples = true;
		this.dungeons = true;
		this.waterLakes = true;
		this.lavaLakes = true;
		this.ground = new MaterialData(Material.GRASS);
		this.averageGroundLayer = 3;
		this.treeTypes = new ArrayList<>();
		this.averageTrees = 0;
		this.structures = new ArrayList<>();
		this.averageStructures = 0;
		this.vegetation = new ArrayList<>();
		this.vegetationDistribution = Vegetation.NORMAL;
		this.erosion = Erosion.NONE;
		this.relief = Relief.NORMAL;
		this.coalVeinSize = 17;
		this.coalVeinTries = 20;
		this.coalMinHeight = 0;
		this.coalMaxHeight = 128;
		this.ironVeinSize = 9;
		this.ironVeinTries = 20;
		this.ironMinHeight = 0;
		this.ironMaxHeight = 64;
		this.lapisVeinSize = 7;
		this.lapisVeinTries = 1;
		this.lapisMinHeight = 0;
		this.lapisMaxHeight = 32;
		this.goldVeinSize = 9;
		this.goldVeinTries = 2;
		this.goldMinHeight = 0;
		this.goldMaxHeight = 32;
		this.redstoneVeinSize = 8;
		this.redstoneVeinTries = 8;
		this.redstoneMinHeight = 0;
		this.redstoneMaxHeight = 16;
		this.diamondVeinSize = 8;
		this.diamondVeinTries = 1;
		this.diamondMinHeight = 0;
		this.diamondMaxHeight = 16;
		this.emeraldVeinSize = 1;
		this.emeraldVeinTries = 1;
		this.emeraldMinHeight = 0;
		this.emeraldMaxHeight = 16;
	}
	
	/**
	 * Set the biome's average size in chunks (default is <strong>32</strong>)
	 * @param size : the size in chunks
	 */
	public void setAverageSizeInChunks(int size){this.averageSizeInChunks = size;}
	
	/**
	 * @return the biome's average size in chunks
	 */
	public int getAverageSizeInChunks(){return this.averageSizeInChunks;}
	
	/**
	 * Set the biome's terrain types (default is <strong>only PLAINS</strong>)
	 * @param types : the terrain types list
	 */
	public void setTerrainTypes(List<TerrainType> types){this.terrainTypes = types;}
	
	/**
	 * @return the biome's terrain types list
	 */
	public List<TerrainType> getTerrainTypes(){return this.terrainTypes;}
	
	/**
	 * Set if caves should be generated in this biome (default is <strong>true</strong>)
	 * @param caves : true or false
	 */
	public void setGenerateCaves(boolean caves){this.caves = caves;}
	
	/**
	 * @return if caves should be generated in the biome
	 */
	public boolean generateCaves(){return this.caves;}
	
	/**
	 * Set if ravines should be generated in this biome (default is <strong>true</strong>)
	 * @param ravines : true or false
	 */
	public void setGenerateRavines(boolean ravines){this.ravines = ravines;}
	
	/**
	 * @return if ravines should be generated in the biome
	 */
	public boolean generateRavines(){return this.ravines;}
	
	/**
	 * Set if mineshafts should be generated in this biome (default is <strong>true</strong>)
	 * @param mineshafts : true or false
	 */
	public void setGenerateMineshafts(boolean mineshafts){this.mineshafts = mineshafts;}
	
	/**
	 * @return if mineshafts should be generated in the biome
	 */
	public boolean generateMineshafts(){return this.mineshafts;}
	
	/**
	 * Set if villages should be generated in this biome (default is <strong>true</strong>)
	 * @param villages : true or false
	 */
	public void setGenerateVillages(boolean villages){this.villages = villages;}
	
	/**
	 * @return if villages should be generated in the biome
	 */
	public boolean generateVillages(){return this.villages;}
	
	/**
	 * Set if dungeons should be generated in this biome (default is <strong>true</strong>)
	 * @param dungeons : true or false
	 */
	public void setGenerateDungeons(boolean dungeons){this.dungeons = dungeons;}
	
	/**
	 * @return if dungeons should be generated in the biome
	 */
	public boolean generateDungeons(){return this.dungeons;}
	
	/**
	 * Set if temples should be generated in this biome (default is <strong>true</strong>)
	 * @param temples : true or false
	 */
	public void setGenerateTemples(boolean temples){this.temples = temples;}
	
	/**
	 * @return if temples should be generated in the biome
	 */
	public boolean generateTemples(){return this.temples;}
	
	/**
	 * Set if waterLakes should be generated in this biome (default is <strong>true</strong>)
	 * @param waterLakes : true or false
	 */
	public void setGenerateWaterLakes(boolean waterLakes){this.waterLakes = waterLakes;}
	
	/**
	 * @return if waterLakes should be generated in the biome
	 */
	public boolean generateWaterLakes(){return this.waterLakes;}
	
	/**
	 * Set if lavaLakes should be generated in this biome (default is <strong>true</strong>)
	 * @param lavaLakes : true or false
	 */
	public void setGenerateLavaLakes(boolean lavaLakes){this.lavaLakes = lavaLakes;}
	
	/**
	 * @return if lavaLakes should be generated in the biome
	 */
	public boolean generateLavaLakes(){return this.lavaLakes;}
	
	public enum Erosion{
		NONE, LIGHT, SMOOTH, HARD;
	}
	
	public enum Vegetation{
		NONE, DISSEMINATED, NORMAL, ABUNDANT;
	}
	
	public enum Relief{
		LOW, NORMAL, HIGH;
	}
}
