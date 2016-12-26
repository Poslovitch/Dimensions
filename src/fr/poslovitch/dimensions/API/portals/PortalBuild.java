package fr.poslovitch.dimensions.API.portals;

import org.bukkit.inventory.ItemStack;

/**
 * 
 * @author Poslovitch & PYRRH4
 * @version 1.0
 */
public class PortalBuild extends Portal{

	PortalPattern pattern;
	boolean requireIgnition, consumeItem;
	ItemStack activatorItem;
	
	public PortalBuild(PortalType type, PortalPattern pattern, boolean requireIgnition) {
		super(type);
		this.pattern = pattern;
		this.requireIgnition = requireIgnition;
		this.activatorItem = null;
		this.consumeItem = false;
	}
	
	public PortalBuild(PortalType type, PortalPattern pattern, boolean requireIgnition, ItemStack neededItemToActivate, boolean consumeItem) {
		super(type);
		this.pattern = pattern;
		this.requireIgnition = requireIgnition;
		this.activatorItem = neededItemToActivate;
		this.consumeItem = consumeItem;
	}
	
	public PortalPattern getPattern(){return this.pattern;}
	public boolean requireIgnition(){return this.requireIgnition;}
	public boolean needItemToActivate(){return (activatorItem != null);}
	public boolean consumeItem(){return this.consumeItem;}
	public ItemStack getActivatorItem(){return this.activatorItem;}
}