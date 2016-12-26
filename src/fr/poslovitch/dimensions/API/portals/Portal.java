package fr.poslovitch.dimensions.API.portals;

/**
 * 
 * @author Poslovitch
 * @version 1.0
 */
public class Portal {

	public enum PortalType{
		WALL_PORTAL, GROUND_PORTAL, ITEM;
	}
	
	private PortalType type;
	
	public Portal(PortalType type){
		this.type = type;
	}
	
	public PortalType getType(){return this.type;}
}
