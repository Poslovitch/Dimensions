package fr.poslovitch.dimensions.API.portals;

import org.bukkit.inventory.ItemStack;

/**
 * 
 * @author Poslovitch
 * @version 1.0
 */
public class PortalItem extends Portal{

	private ItemStack item;
	
	public PortalItem(ItemStack item) {
		super(PortalType.ITEM);
		this.item = item;
	}
	
	public ItemStack getItem(){return this.item;}
}
