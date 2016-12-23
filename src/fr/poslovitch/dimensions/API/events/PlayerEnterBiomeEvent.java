package fr.poslovitch.dimensions.API.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import fr.poslovitch.dimensions.API.Dimension;
import fr.poslovitch.dimensions.biome.DBiome;

/**
 * This event is fired when a Player enters a DBiome in a Dimension
 * @author Poslovitch
 * @version 1.0
 */
public class PlayerEnterBiomeEvent extends Event{

	private static final HandlerList handlers = new HandlerList();
	private final Player player;
	private final Dimension dimension;
	private final DBiome biome;

	/**
	 * @param player
	 * @param dimension
	 * @param biome
	 */
	public PlayerEnterBiomeEvent(Player player, Dimension dimension, DBiome biome){
		this.player = player;
		this.dimension = dimension;
		this.biome = biome;
	}

	public Player getPlayer(){return this.player;}
	public Dimension getDimension(){return this.dimension;}
	public DBiome getBiome(){return this.biome;}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
