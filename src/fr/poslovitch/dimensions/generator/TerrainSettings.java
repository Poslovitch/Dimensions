package fr.poslovitch.dimensions.generator;

/**
 * 
 * @author Poslovitch
 * @version 1.0
 */
public class TerrainSettings {

	public TerrainSettings(){}

	public double averageHeight = 0.0D;
	public double variationBelow = 0.0D;
	public double variationAbove = 0.0D;
	public double sidewaysNoiseAmount = 0.0D;
	public double[] octaveWeights = new double[] {0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D};        
	public double minHeight = 0.0D;
	public double maxHeight = 255.0D;

	public TerrainSettings setDefaults(){
		this.averageHeight = 64.0D;
		this.variationBelow = 10.0D;
		this.variationAbove = 20.0D;
		this.minHeight = 0.0D;
		this.maxHeight = 255.0D;
		this.sidewaysNoiseAmount = 0.4D;
		this.octaveWeights = new double[] {1 / 24.0D, 2 / 24.0D, 4 / 24.0D, 8 / 24.0D, 6 / 24.0D, 3 / 24.0D};
		return this;
	}

	public TerrainSettings setAverageHeight(double average){
		this.averageHeight = average;
		return this;
	}

	public TerrainSettings setSidewaysNoise(double noise){
		this.sidewaysNoiseAmount = noise; //TODO MathHelper.clamp 0.0 - 1.0
		return this;
	}

	public TerrainSettings setHeightVariation(double variation) {
		return this.setHeightVariation(variation, variation);
	}

	public TerrainSettings setHeightVariation(double varBelow, double varAbove){
		this.variationBelow = varBelow;
		this.variationAbove = varAbove;
		return this;
	}

	public TerrainSettings setMinHeight(double minHeight){
		this.minHeight = minHeight; //TODO MathHelper.clamp 0.0 - 255.0
		return this;
	}

	public TerrainSettings setMaxHeight(double maxHeight){
		this.maxHeight = maxHeight; //TODO MathHelper.clamp 0.0 - 255.0
		return this;
	}

	public TerrainSettings setOctaves(double w0, double w1, double w2, double w3, double w4, double w5){
		// standard weights for the octaves are 1,2,4,8,6,3
		double norm = 1 / (1 * w0 + 2 * w1 + 4 * w2 + 8 * w3 + 6 * w4 + 3 * w5);
		this.octaveWeights[0] = w0 * 1 * norm;
		this.octaveWeights[1] = w1 * 2 * norm;
		this.octaveWeights[2] = w2 * 4 * norm;
		this.octaveWeights[3] = w3 * 8 * norm;
		this.octaveWeights[4] = w4 * 6 * norm;
		this.octaveWeights[5] = w5 * 3 * norm;
		return this;
	}
}
