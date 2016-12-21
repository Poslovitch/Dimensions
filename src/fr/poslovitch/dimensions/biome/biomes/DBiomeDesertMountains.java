package fr.poslovitch.dimensions.biome.biomes;

import org.bukkit.block.Biome;

import fr.poslovitch.dimensions.biome.BiomeGenerationRules;
import fr.poslovitch.dimensions.biome.DBiome;
import fr.poslovitch.dimensions.enums.Climate;

/**
 * Desert Mountains - Lifeless desert highlands
 * @author Poslovitch
 * @version 1.0
 */
public class DBiomeDesertMountains extends DBiome{

	public DBiomeDesertMountains(){
		super("DESERT_MOUNTAINS", Biome.DESERT_HILLS, Climate.DESERT, false, false);
		
		BiomeGenerationRules bgr = new BiomeGenerationRules();
		
		this.setBiomeGenerationRules(bgr);
	}
}
