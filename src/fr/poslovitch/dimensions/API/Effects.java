package fr.poslovitch.dimensions.API;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.potion.PotionEffect;

public class Effects {

	private List<PotionEffect> permanent, day, night, skyExposure, sunExposure, moonExposure, water;
	
	public Effects(){
		this.permanent = new ArrayList<PotionEffect>();
		this.day = new ArrayList<PotionEffect>();
		this.night = new ArrayList<PotionEffect>();
		this.skyExposure = new ArrayList<PotionEffect>();
		this.sunExposure = new ArrayList<PotionEffect>();
		this.moonExposure = new ArrayList<PotionEffect>();
		this.water = new ArrayList<PotionEffect>();
	}
	
	public void setPermanentEffects(List<PotionEffect> effects){this.permanent = effects;}
	public List<PotionEffect> getPermanentEffects(){return this.permanent;}
	
	public void setDayEffects(List<PotionEffect> effects){this.day = effects;}
	public List<PotionEffect> getDayEffects(){return this.day;}
	
	public void setNightEffects(List<PotionEffect> effects){this.night = effects;}
	public List<PotionEffect> getNightEffects(){return this.night;}
	
	public void setSkyExposureEffects(List<PotionEffect> effects){this.skyExposure = effects;}
	public List<PotionEffect> getSkyExposureEffects(){return this.skyExposure;}
	
	public void setSunExposureEffects(List<PotionEffect> effects){this.sunExposure = effects;}
	public List<PotionEffect> getSunExposureEffects(){return this.sunExposure;}
	
	public void setMoonExposureEffects(List<PotionEffect> effects){this.moonExposure = effects;}
	public List<PotionEffect> getMoonExposureEffects(){return this.moonExposure;}
	
	public void setWaterEffects(List<PotionEffect> effects){this.water = effects;}
	public List<PotionEffect> getWaterEffects(){return this.water;}
}
