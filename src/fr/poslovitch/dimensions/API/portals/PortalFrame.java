package fr.poslovitch.dimensions.API.portals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.material.MaterialData;

/**
 * 
 * @author Poslovitch & PYRRH4
 * @version 1.0
 */
public class PortalFrame {
	
	// Pattern
	List<String> frame = new ArrayList<String>();
	// Materials
	HashMap<Character, MaterialData> materials = new HashMap<Character, MaterialData>();
	// Activator
	char activator;
	MaterialData activatorType;
	
	public PortalFrame(char activator, MaterialData activatorType){
		this.activator = activator;
		this.activatorType = activatorType;
	}
	
	public void addLines(String... pattern){
		for(String line : pattern) this.frame.add(line);
	}
	
	public void setMatching(char ch, MaterialData match){
		this.materials.put(ch, match);
	}
}
