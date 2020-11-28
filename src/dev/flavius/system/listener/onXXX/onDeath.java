package dev.flavius.system.listener.onXXX;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

/**
 *
 * Copyright 2020 © Flavius All rights reserved.
 * 
 * tiktok.com/@AddventureTime
 * 
 * Project Name: System
 * 
 * Referened Libary: spigot-1.8.8-R0.1-SNAPSHOT-latest.jar
 * 
 * Main: dev.flavius.system.System
 *
 **/

public class onDeath implements Listener {
	
	@EventHandler
	public void setDeathMessage(PlayerDeathEvent e) {
		
		e.setDeathMessage(null);
		
	}

}
