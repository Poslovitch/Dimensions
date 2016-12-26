package fr.poslovitch.dimensions.enums;

/**
 * Each Biome has its own temperature and humidity due to its Climate, which allows Dimensions to generate accurately the biome.
 * @author Poslovitch
 * @version 1.0
 */
public enum Climate {
	
	WASTELAND(50, 0),
	DESERT(40, 0),
	HOT(35, 25),
	TROPICAL(30, 80),
	MEDITERRANEAN(30, 30),
	DRY_TEMPERATE(25, 30),
	WARM_TEMPERATE(20, 40),
	WET_TEMPERATE(10, 50),
	COLD(5, 30),
	BOREAL(0, 25),
	TUNDRA(-5, 20),
	ICY(-10, 30);
	
	private int temperature, humidity;
	
	private Climate(int temperature, int humidity){
		this.temperature = temperature;
		this.humidity = humidity;
	}
	
	public int getTemperature()	{	return temperature;	}
	public int getHumidity()	{	return humidity;	}
	
}
