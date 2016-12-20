package fr.poslovitch.dimensions.biome.biomes;

import java.util.Arrays;

import org.bukkit.block.Biome;

import fr.poslovitch.dimensions.biome.BiomeGenerationRules;
import fr.poslovitch.dimensions.biome.DBiome;
import fr.poslovitch.dimensions.enums.Climate;
import fr.poslovitch.dimensions.generator.TerrainType;

/**
 * The Alps - high and snowy mountains.
 * @author Poslovitch
 * @version 1.0
 */
public class DBiomeAlps extends DBiome{

	public DBiomeAlps(){
		super("ALPS", Biome.ICE_MOUNTAINS, Climate.ICY, false, false);
		
		BiomeGenerationRules bgr = new BiomeGenerationRules();
		bgr.setTerrainTypes(Arrays.asList(TerrainType.MOUNTAIN));
		
		this.setBiomeGenerationRules(bgr);
	}
}
