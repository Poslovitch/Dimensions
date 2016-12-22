package fr.poslovitch.dimensions.API.portals;

import org.bukkit.inventory.ItemStack;

/**
 * 
 * @author Poslovitch & PYRRH4
 * @version 1.0
 */
public class PortalBuild extends Portal{

	PortalPattern pattern;
	boolean requireIgnition;
	ItemStack activatorItem = null;
	
	public PortalBuild(PortalType type, PortalPattern pattern, boolean requireIgnition) {
		super(type);
		this.pattern = pattern;
		this.requireIgnition = requireIgnition;
	}
	
	public PortalBuild(PortalType type, PortalPattern pattern, boolean requireIgnition, ItemStack neededItemToActivate) {
		super(type);
		this.pattern = pattern;
		this.requireIgnition = requireIgnition;
		this.activatorItem = neededItemToActivate;
	}
	
	public PortalPattern getPattern(){return this.pattern;}
	public boolean requireIgnition(){return this.requireIgnition;}
	public boolean needItemToActivate(){return (activatorItem != null);}
	public ItemStack getActivatorItem(){return this.activatorItem;}
}