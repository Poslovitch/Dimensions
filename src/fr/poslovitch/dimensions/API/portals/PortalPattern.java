package fr.poslovitch.dimensions.API.portals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

/**
 * 
 * @author Poslovitch & PYRRH4
 * @version 1.0
 */
public class PortalPattern {
	
	// Pattern
	List<String> pattern = new ArrayList<String>();
	// Materials
	HashMap<Character, MaterialData> materials = new HashMap<Character, MaterialData>();
	// Activator
	char activator;
	MaterialData activatorType;
	ItemStack activatorItem;
	
	public PortalPattern(char activator, MaterialData activatorType){
		this.activator = activator;
		this.activatorType = activatorType;
	}
	
	public void setPattern(String... pattern){
		this.pattern.clear();
		for(String line : pattern) this.pattern.add(line);
	}
	
	public void setMatching(char ch, MaterialData match){
		this.materials.put(ch, match);
	}
	
	public void setActivatorItem(ItemStack activator){
		this.activatorItem = activator;
	}
	
	public boolean needItemToActivate(){return (activatorItem != null);}
	public ItemStack getActivatorItem(){return this.activatorItem;}
	public List<String> getPattern(){return this.pattern;}
	public HashMap<Character, MaterialData> getMatching(){return this.materials;}
	public char getActivatorChar(){return this.activator;}
	public MaterialData getActivatorType(){return this.activatorType;}
}
