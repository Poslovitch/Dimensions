package fr.poslovitch.dimensions.API;

import fr.poslovitch.dimensions.API.portals.Portal;
import fr.poslovitch.dimensions.generator.DimensionGenerator;

/**
 * 
 * @author Poslovitch
 * @version 1.0
 */
public class Dimension {

	String name;
	DimensionGenerator generator;
	Portal portal;
	//TODO time (eternal day/night, day/night durations...)
	Effects effects;
	
	public Dimension(String name, DimensionGenerator generator, Portal portal, Effects effects){
		this.name = name;
		this.generator = generator;
		this.portal = portal;
		this.effects = effects;
	}
	
	public String getName(){return this.name;}
	public DimensionGenerator getGenerator(){return this.generator;}
	public Portal getPortal(){return this.portal;}
	public Effects getDimensionEffects(){return this.effects;}
}
