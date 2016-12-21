package fr.poslovitch.dimensions.API;

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
	
	public Dimension(String name, DimensionGenerator generator, Portal portal){
		this.name = name;
		this.generator = generator;
		this.portal = portal;
	}
	
	public String getName(){return this.name;}
	public DimensionGenerator getGenerator(){return this.generator;}
	public Portal getPortal(){return this.portal;}
}
