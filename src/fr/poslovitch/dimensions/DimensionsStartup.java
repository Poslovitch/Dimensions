package fr.poslovitch.dimensions;

import org.bukkit.plugin.java.JavaPlugin;

import fr.poslovitch.dimensions.generator.ErosionCalculator;

/**
 * 
 * @author Poslovitch
 * @version 1.0
 */
public class DimensionsStartup extends JavaPlugin{
	
	@Override
	public void onEnable(){
		// Load Erosion Map
		new ErosionCalculator();
	}
}
