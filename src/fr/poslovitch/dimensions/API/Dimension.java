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
	int dayDuration, nightDuration;
	Effects effects;
	
	// day/night duration in seconds. -1 for eternal.
	public Dimension(String name, DimensionGenerator generator, Portal portal, Effects effects, int dayDuration, int nightDuration){
		this.name = name;
		this.generator = generator;
		this.portal = portal;
		this.effects = effects;
		this.dayDuration = dayDuration;
		this.nightDuration = nightDuration;
	}
	
	public String getName(){return this.name;}
	public DimensionGenerator getGenerator(){return this.generator;}
	public Portal getPortal(){return this.portal;}
	public Effects getDimensionEffects(){return this.effects;}
	public int getDayDuration(){return this.dayDuration;}
	public int getNightDuration(){return this.nightDuration;}
}
