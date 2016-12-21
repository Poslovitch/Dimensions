package fr.poslovitch.dimensions.biome.biomes;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.material.MaterialData;

import fr.poslovitch.dimensions.biome.BiomeGenerationRules;
import fr.poslovitch.dimensions.biome.DBiome;
import fr.poslovitch.dimensions.enums.Climate;
import fr.poslovitch.dimensions.generator.TerrainSettings;
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
		
		HashMap<TerrainType, TerrainSettings> terrain = new HashMap<>();
		terrain.put(TerrainType.MOUNTAIN, new TerrainSettings().setDefaults().setAverageHeight(198).setHeightVariation(12, 12).setOctaves(1, 1, 2, 2, 3, 3));
		bgr.setTerrain(terrain);
		
		bgr.setGroundMaterial(new MaterialData(Material.SNOW_BLOCK));
		bgr.setAverageGroundLayers(4);
		
		this.setBiomeGenerationRules(bgr);
	}
}
