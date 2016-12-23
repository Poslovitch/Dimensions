package fr.poslovitch.dimensions.API.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import fr.poslovitch.dimensions.API.Dimension;

/**
 * This event is fired when a Player enters a Dimension
 * @author Poslovitch
 * @version 1.0
 */
public class PlayerEnterDimensionEvent extends Event{

	private static final HandlerList handlers = new HandlerList();
	private final Player player;
	private final Dimension dimension;

	public PlayerEnterDimensionEvent(Player player, Dimension dimension){
		this.player = player;
		this.dimension = dimension;
	}

	public Player getPlayer(){return this.player;}
	public Dimension getDimension(){return this.dimension;}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
