package dev.flavius.system.listener.onXXX;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import dev.flavius.system.Utils.strings.texts;

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

public class onUnkownCommand implements Listener {
	
	@EventHandler
	public static void onCommand(PlayerCommandPreprocessEvent e) {
		
		String msg = e.getMessage();
		
		String[] args = msg.split(" ");
		
		if(Bukkit.getServer().getHelpMap().getHelpTopic(args[0]) == null) {
			
			e.setCancelled(true);
			
			e.getPlayer().sendMessage(texts.Prefix + "§7Der Command §b" + args[0] + " §7Existiert nicht!");
			
		}
		
	}

}
