package fr.poslovitch.dimensions.API;

import fr.poslovitch.dimensions.API.portals.Portal;
import fr.poslovitch.dimensions.generator.DimensionGenerator;

/**
 * 
 * @author Poslovitch
 * @version 1.0
 */
public class Dimension {

	private String name;
	private DimensionGenerator generator;
	private Portal portal;
	private int dayDuration, nightDuration, eternalTime;
	private boolean eternal;
	private Effects effects;
	
	public Dimension(String name, DimensionGenerator generator, Portal portal, Effects effects){
		this.name = name;
		this.generator = generator;
		this.portal = portal;
		this.effects = effects;
		this.dayDuration = 1200;
		this.nightDuration = 1200;
		this.eternal = false;
		this.eternalTime = 0;
	}
	
	public String getName(){return this.name;}
	public DimensionGenerator getGenerator(){return this.generator;}
	public Portal getPortal(){return this.portal;}
	public Effects getDimensionEffects(){return this.effects;}
	public int getDayDuration(){return this.dayDuration;}
	public int getNightDuration(){return this.nightDuration;}
	public boolean isTimeEternal(){return this.eternal;}
	public int getEternalTime(){return this.eternalTime;}
	
	public void setEternalTime(int time){
		this.eternal = true;
		this.eternalTime = time;
	}
	
	public void setDayDuration(int time){
		this.dayDuration = time;
		this.eternal = false;
	}
	
	public void setNightDuration(int time){
		this.nightDuration = time;
		this.eternal = false;
	}
}
