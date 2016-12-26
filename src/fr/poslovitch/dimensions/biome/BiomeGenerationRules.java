package fr.poslovitch.dimensions.biome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import fr.poslovitch.dimensions.enums.DStructure;
import fr.poslovitch.dimensions.enums.DTree;
import fr.poslovitch.dimensions.generator.TerrainSettings;
import fr.poslovitch.dimensions.generator.TerrainType;

/**
 * This object handles every option to generate a biome.
 * @author Poslovitch
 * @version 1.0
 */
public class BiomeGenerationRules{
	
	private int averageSizeInChunks;
	private HashMap<TerrainType, TerrainSettings> terrain;
	private boolean caves, ravines, fossils;
	private boolean mineshafts, villages, temples, dungeons;
	private boolean waterLakes, lavaLakes;
	private MaterialData ground;
	private int averageGroundLayer;
	private HashMap<DTree, Integer> trees;
	private int averageTrees;
	private HashMap<DStructure, Integer> structures;
	private int averageStructures;
	private HashMap<MaterialData, Integer> vegetation;
	private Vegetation vegetationDistribution;
	private boolean vegetationOnCliffs;
	private Erosion erosion;
	List<DBiome> beach;
	
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
		this.terrain = new HashMap<>();
		this.caves = true;
		this.ravines = true;
		this.fossils = true;
		this.mineshafts = true;
		this.villages = true;
		this.temples = true;
		this.dungeons = true;
		this.waterLakes = true;
		this.lavaLakes = true;
		this.ground = new MaterialData(Material.GRASS);
		this.averageGroundLayer = 3;
		this.trees = new HashMap<>();
		this.averageTrees = 0;
		this.structures = new HashMap<>();
		this.averageStructures = 0;
		this.vegetation = new HashMap<>();
		this.vegetationDistribution = Vegetation.NORMAL;
		this.vegetationOnCliffs = false;
		this.erosion = Erosion.NONE;
		this.beach = new ArrayList<>();
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
	 * Set the biome's terrain (default is <strong>empty</strong>)
	 * @param types : the terrain map
	 */
	public void setTerrain(HashMap<TerrainType, TerrainSettings> terrain){this.terrain = terrain;}
	
	/**
	 * @return the biome's terrain map
	 */
	public HashMap<TerrainType, TerrainSettings> getTerrain(){return this.terrain;}
	
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
	 * Set if fossils should be generated in this biome (default is <strong>true</strong>)
	 * @param fossils : true or false
	 */
	public void setGenerateFossils(boolean fossils){this.fossils = fossils;}
	
	/**
	 * @return if fossils should be generated in the biome
	 */
	public boolean generateFossils(){return this.fossils;}
	
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
	
	/**
	 * Set the ground block material (default is <strong>GRASS</strong>)
	 * @param ground 
	 */
	public void setGroundMaterial(MaterialData ground){this.ground = ground;}
	
	/**
	 * @return the ground material
	 */
	public MaterialData getGroundMaterial(){return this.ground;}
	
	/**
	 * Set how many layers there is (default is <strong>3</strong>)
	 * @param layers
	 */
	public void setAverageGroundLayers(int layers){this.averageGroundLayer = layers;}
	
	/**
	 * @return average ground layers
	 */
	public int getAverageGroundLayers(){return this.averageGroundLayer;}
	
	/**
	 * Set all trees that should spawn in the biome and their probabilities (default is <strong>empty</strong>)
	 * @param trees
	 */
	public void setTrees(HashMap<DTree, Integer> trees){this.trees = trees;}
	
	/**
	 * @return the tree types & probabilities map
	 */
	public HashMap<DTree, Integer> getTrees(){return this.trees;}
	
	/**
	 * Set how many trees there should be in the biome on average
	 * @param average
	 */
	public void setTreesOnAverage(int average){this.averageTrees = average;}
	
	/**
	 * @return how many trees there should be in the biome on average
	 */
	public int getTreesOnAverage(){return this.averageTrees;}
	
	// TODO Javadoc
	public void setStructures(HashMap<DStructure, Integer> structures){this.structures = structures;}
	
	public HashMap<DStructure, Integer> getStructures(){return this.structures;}
	
	public void setStructuresOnAverage(int average){this.averageStructures = average;}
	
	public int getStructuresOnAverage(){return this.averageStructures;}
	
	public void setVegetation(HashMap<MaterialData, Integer> vegetation){this.vegetation = vegetation;}
	
	public HashMap<MaterialData, Integer> getVegetation(){return this.vegetation;}
	
	public void setVegetationDistribution(Vegetation distribution){this.vegetationDistribution = distribution;}
	
	public Vegetation getVegetationDistribution(){return this.vegetationDistribution;}

	public void setGenerateLeavesOnCliffs(boolean leavesOnCliffs){this.vegetationOnCliffs = leavesOnCliffs;}
	
	public boolean generateLeavesOnCliffs(){return this.vegetationOnCliffs;}
	
	public void setErosion(Erosion erosion){this.erosion = erosion;}
	
	public Erosion getErosion(){return this.erosion;}
	
	public void setBeachBiomes(List<DBiome> biomes){this.beach = biomes;}
	
	public List<DBiome> getBeachBiomes(){return this.beach;}
	
	public void setCoalSettings(int veinSize, int veinTries, int minHeight, int maxHeight){
		this.coalVeinSize = veinSize;
		this.coalVeinTries = veinTries;
		this.coalMinHeight = minHeight;
		this.coalMaxHeight = maxHeight;
	}
	
	public void setCoalVeinSize(int veinSize){this.coalVeinSize = veinSize;}
	public void setCoalVeinTries(int veinTries){this.coalVeinTries = veinTries;}
	public void setCoalMinHeight(int minHeight){this.coalMinHeight = minHeight;}
	public void setCoalMaxHeight(int maxHeight){this.coalMaxHeight = maxHeight;}
	
	public int getCoalVeinSize(){return this.coalVeinSize;}
	public int getCoalVeinTries(){return this.coalVeinTries;}
	public int getCoalMinHeight(){return this.coalMinHeight;}
	public int getCoalMaxHeight(){return this.coalMaxHeight;}
	
	public void setIronSettings(int veinSize, int veinTries, int minHeight, int maxHeight){
		this.ironVeinSize = veinSize;
		this.ironVeinTries = veinTries;
		this.ironMinHeight = minHeight;
		this.ironMaxHeight = maxHeight;
	}
	
	public void setIronVeinSize(int veinSize){this.ironVeinSize = veinSize;}
	public void setIronVeinTries(int veinTries){this.ironVeinTries = veinTries;}
	public void setIronMinHeight(int minHeight){this.ironMinHeight = minHeight;}
	public void setIronMaxHeight(int maxHeight){this.ironMaxHeight = maxHeight;}
	
	public int getIronVeinSize(){return this.ironVeinSize;}
	public int getIronVeinTries(){return this.ironVeinTries;}
	public int getIronMinHeight(){return this.ironMinHeight;}
	public int getIronMaxHeight(){return this.ironMaxHeight;}
	
	public void setLapisSettings(int veinSize, int veinTries, int minHeight, int maxHeight){
		this.lapisVeinSize = veinSize;
		this.lapisVeinTries = veinTries;
		this.lapisMinHeight = minHeight;
		this.lapisMaxHeight = maxHeight;
	}
	
	public void setLapisVeinSize(int veinSize){this.lapisVeinSize = veinSize;}
	public void setLapisVeinTries(int veinTries){this.lapisVeinTries = veinTries;}
	public void setLapisMinHeight(int minHeight){this.lapisMinHeight = minHeight;}
	public void setLapisMaxHeight(int maxHeight){this.lapisMaxHeight = maxHeight;}
	
	public int getLapisVeinSize(){return this.lapisVeinSize;}
	public int getLapisVeinTries(){return this.lapisVeinTries;}
	public int getLapisMinHeight(){return this.lapisMinHeight;}
	public int getLapisMaxHeight(){return this.lapisMaxHeight;}
	
	public void setGoldSettings(int veinSize, int veinTries, int minHeight, int maxHeight){
		this.goldVeinSize = veinSize;
		this.goldVeinTries = veinTries;
		this.goldMinHeight = minHeight;
		this.goldMaxHeight = maxHeight;
	}
	
	public void setGoldVeinSize(int veinSize){this.goldVeinSize = veinSize;}
	public void setGoldVeinTries(int veinTries){this.goldVeinTries = veinTries;}
	public void setGoldMinHeight(int minHeight){this.goldMinHeight = minHeight;}
	public void setGoldMaxHeight(int maxHeight){this.goldMaxHeight = maxHeight;}
	
	public int getGoldVeinSize(){return this.goldVeinSize;}
	public int getGoldVeinTries(){return this.goldVeinTries;}
	public int getGoldMinHeight(){return this.goldMinHeight;}
	public int getGoldMaxHeight(){return this.goldMaxHeight;}
	
	public void setRedstoneSettings(int veinSize, int veinTries, int minHeight, int maxHeight){
		this.redstoneVeinSize = veinSize;
		this.redstoneVeinTries = veinTries;
		this.redstoneMinHeight = minHeight;
		this.redstoneMaxHeight = maxHeight;
	}
	
	public void setRedstoneVeinSize(int veinSize){this.redstoneVeinSize = veinSize;}
	public void setRedstoneVeinTries(int veinTries){this.redstoneVeinTries = veinTries;}
	public void setRedstoneMinHeight(int minHeight){this.redstoneMinHeight = minHeight;}
	public void setRedstoneMaxHeight(int maxHeight){this.redstoneMaxHeight = maxHeight;}
	
	public int getRedstoneVeinSize(){return this.redstoneVeinSize;}
	public int getRedstoneVeinTries(){return this.redstoneVeinTries;}
	public int getRedstoneMinHeight(){return this.redstoneMinHeight;}
	public int getRedstoneMaxHeight(){return this.redstoneMaxHeight;}
	
	public void setDiamondSettings(int veinSize, int veinTries, int minHeight, int maxHeight){
		this.diamondVeinSize = veinSize;
		this.diamondVeinTries = veinTries;
		this.diamondMinHeight = minHeight;
		this.diamondMaxHeight = maxHeight;
	}
	
	public void setDiamondVeinSize(int veinSize){this.diamondVeinSize = veinSize;}
	public void setDiamondVeinTries(int veinTries){this.diamondVeinTries = veinTries;}
	public void setDiamondMinHeight(int minHeight){this.diamondMinHeight = minHeight;}
	public void setDiamondMaxHeight(int maxHeight){this.diamondMaxHeight = maxHeight;}
	
	public int getDiamondVeinSize(){return this.diamondVeinSize;}
	public int getDiamondVeinTries(){return this.diamondVeinTries;}
	public int getDiamondMinHeight(){return this.diamondMinHeight;}
	public int getDiamondMaxHeight(){return this.diamondMaxHeight;}
	
	public void setEmeraldSettings(int veinSize, int veinTries, int minHeight, int maxHeight){
		this.emeraldVeinSize = veinSize;
		this.emeraldVeinTries = veinTries;
		this.emeraldMinHeight = minHeight;
		this.emeraldMaxHeight = maxHeight;
	}
	
	public void setEmeraldVeinSize(int veinSize){this.emeraldVeinSize = veinSize;}
	public void setEmeraldVeinTries(int veinTries){this.emeraldVeinTries = veinTries;}
	public void setEmeraldMinHeight(int minHeight){this.emeraldMinHeight = minHeight;}
	public void setEmeraldMaxHeight(int maxHeight){this.emeraldMaxHeight = maxHeight;}
	
	public int getEmeraldVeinSize(){return this.emeraldVeinSize;}
	public int getEmeraldVeinTries(){return this.emeraldVeinTries;}
	public int getEmeraldMinHeight(){return this.emeraldMinHeight;}
	public int getEmeraldMaxHeight(){return this.emeraldMaxHeight;}
	
	public enum Erosion{
		NONE, LIGHT, SMOOTH, HARD;
	}
	
	public enum Vegetation{
		NONE, DISSEMINATED, NORMAL, ABUNDANT;
	}
}
