package fr.poslovitch.dimensions.API.portals;

/**
 * 
 * @author Poslovitch & PYRRH4
 * @version 1.0
 */
public class PortalBuild extends Portal{

	PortalPattern pattern;
	
	public PortalBuild(PortalType type, PortalPattern pattern) {
		super(type);
		this.pattern = pattern;
	}

	public PortalPattern getPattern(){return this.pattern;}
}