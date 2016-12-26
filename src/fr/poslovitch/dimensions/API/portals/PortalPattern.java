package fr.poslovitch.dimensions.API.portals;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.material.MaterialData;

/**
 * 
 * @author Poslovitch & PYRRH4
 * @version 1.0
 */
public class PortalPattern {
	
	// Pattern
	private ArrayList<String> pattern = new ArrayList<String>();
	// Materials
	private HashMap<Character, MaterialData> materials = new HashMap<Character, MaterialData>();
	// Activator
	private char activator;
	private MaterialData activatorType;
	
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
	
	public ArrayList<String> getPattern(){return this.pattern;}
	public HashMap<Character, MaterialData> getMatching(){return this.materials;}
	public char getActivatorChar(){return this.activator;}
	public MaterialData getActivatorType(){return this.activatorType;}
}
