package fr.poslovitch.dimensions.enums;

import fr.poslovitch.dimensions.schematics.Schematic;

/**
 * 
 * @author Poslovitch
 * @version 1.0
 */
public class DTree {
	
	private Schematic schematic;
	private StructureGeneration generation;
	private boolean randomRotation, vinesOnTree;
	
	public DTree(Schematic schematic, StructureGeneration generation, boolean randomRotation, boolean vinesOnTree){
		this.schematic = schematic;
		this.generation = generation;
		this.randomRotation = randomRotation;
		this.vinesOnTree = vinesOnTree;
	}
}
