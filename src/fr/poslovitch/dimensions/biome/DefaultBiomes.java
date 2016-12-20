package fr.poslovitch.dimensions.biome;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.material.MaterialData;

import fr.poslovitch.dimensions.enums.Climate;
import fr.poslovitch.dimensions.generator.BiomeGenerationRules;
import fr.poslovitch.dimensions.generator.BiomeGenerationRules.Erosion;
import fr.poslovitch.dimensions.generator.BiomeGenerationRules.Vegetation;
import fr.poslovitch.dimensions.generator.TerrainType;

/**
 * This class, which works like a enum, contains built-in Dimensions' Biomes.
 * @author Poslovitch
 * @version 1.0
 */
public class DefaultBiomes {

	public static final DBiome ALPINE = new DBiome(BiomeOwner.DIMENSIONS, "ALPINE", Biome.ICE_MOUNTAINS, Climate.ICY,
			32, Arrays.asList(TerrainType.MOUNTAIN),
			new BiomeGenerationRules(true, false, false, false, false, false, false, false, new MaterialData(Material.GRASS), 2, new ArrayList<>(), 0, new ArrayList<>(), 0, Arrays.asList(new MaterialData(Material.LONG_GRASS)), Vegetation.NONE, Erosion.SMOOTH, coalVeinSize, coalVeinTries, coalMinHeight, coalMaxHeight, ironVeinSize, ironVeinTries, ironMinHeight, ironMaxHeight, lapisVeinSize, lapisVeinTries, lapisMinHeight, lapisMaxHeight, goldVeinSize, goldVeinTries, goldMinHeight, goldMaxHeight, redstoneVeinSize, redstoneVeinTries, redstoneMinHeight, redstoneMaxHeight, diamondVeinSize, diamondVeinTries, diamondMinHeight, diamondMaxHeight, emeraldVeinSize, emeraldVeinTries, emeraldMinHeight, emeraldMaxHeight),
			true);
	public static final DBiome BAMBOO_FOREST;
	public static final DBiome BAMBOO_GROVE;
	public static final DBiome BOREAL_FOREST;
	public static final DBiome BOREAL_PLATEAU;
	public static final DBiome COLD_DESERT = new DBiome(BiomeOwner.DIMENSIONS, "COLD_DESERT", Biome.ICE_FLATS, Climate.COLD,
			32, Arrays.asList(TerrainType.MEADOW, TerrainType.PLAINS, TerrainType.DESERT), 
			new BiomeGenerationRules(caves, ravines, mineshafts, villages, temples, dungeons, waterLakes, lavaLakes, ground, averageGroundLayer, treeTypes, averageTrees, structures, averageStructures, vegetation, vegetationDistribution, erosion, coalVeinSize, coalVeinTries, coalMinHeight, coalMaxHeight, ironVeinSize, ironVeinTries, ironMinHeight, ironMaxHeight, lapisVeinSize, lapisVeinTries, lapisMinHeight, lapisMaxHeight, goldVeinSize, goldVeinTries, goldMinHeight, goldMaxHeight, redstoneVeinSize, redstoneVeinTries, redstoneMinHeight, redstoneMaxHeight, diamondVeinSize, diamondVeinTries, diamondMinHeight, diamondMaxHeight, emeraldVeinSize, emeraldVeinTries, emeraldMinHeight, emeraldMaxHeight),
			true);
	public static final DBiome CONIFEROUS_FOREST;
	public static final DBiome DEAD_FOREST;
	public static final DBiome DEAD_SWAMP;
	public static final DBiome DUNES;
	public static final DBiome FEN;
	public static final DBiome FLOWER_FIELD;
	public static final DBiome FLOWER_ISLAND;
	public static final DBiome GLACIER;
	public static final DBiome GRASSLAND;
	public static final DBiome GROVE;
	public static final DBiome HEATHLAND;
	public static final DBiome HIGHLAND;
	public static final DBiome LAKE;
	public static final DBiome LUSH_DESERT;
	public static final DBiome LUSH_SWAMP;
	public static final DBiome MANGROVE;
	public static final DBiome MEADOW;
	public static final DBiome MOOR;
	public static final DBiome OASIS;
	public static final DBiome OMINOUS_WOODS;
	public static final DBiome ORCHARD;
	public static final DBiome OUTBACK;
	public static final DBiome OVERGROWN_CLIFFS;
	public static final DBiome PALM_BEACH;
	public static final DBiome PLATEAU;
	public static final DBiome POLAR_DESERT;
	public static final DBiome PRAIRIE;
	public static final DBiome QUAGMIRE;
	public static final DBiome RAINFOREST;
	public static final DBiome ROCKY_HILLS;
	public static final DBiome RED_DESERT;
	public static final DBiome RED_ROCK_MOUNTAINS;
	public static final DBiome SACRED_SPRINGS;
	public static final DBiome SAHARA_DESERT;
	public static final DBiome SEASONAL_FOREST;
	public static final DBiome SHIELD;
	public static final DBiome SHRUBLAND;
	public static final DBiome SILVER_PINE_FOREST;
	public static final DBiome SNOWY_CONIFEROUS_FOREST;
	public static final DBiome SNOWY_FOREST;
	public static final DBiome STEPPE;
	public static final DBiome TEMPERATE_RAINFOREST;
	public static final DBiome TROPICAL_ISLAND;
	public static final DBiome TROPICAL_RAINFOREST;
	public static final DBiome TROPICAL_HILLS;
	public static final DBiome TUNDRA;
	public static final DBiome VOLCANIC_ISLAND;
	public static final DBiome VOLCANO;
	public static final DBiome WASTELAND = new DBiome(BiomeOwner.DIMENSIONS, "WASTELAND", Biome.DESERT, Climate.WASTELAND, 20, Arrays.asList(TerrainType.MEADOW), null, false);
	public static final DBiome WETLAND;
	public static final DBiome WOODLAND;
	public static final DBiome XERIC_SHRUBLAND;
}
