package dev.flavius.system.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

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

public class aboutPlugin implements Listener{
	
	public static String tiktokKanal = "  §8» §atiktok.com/@addventuretime";
	
	@EventHandler
	  public void onChat(AsyncPlayerChatEvent e) {
	    if (e.getMessage().equalsIgnoreCase("#AddventureTime") || e.getMessage().equalsIgnoreCase("#System") || e.getMessage().equalsIgnoreCase("#about")) {
	    	
	      e.setCancelled(true);
	      
	      e.getPlayer().sendMessage(texts.Prefix + "§bSystem developed by Flavius");
	      e.getPlayer().sendMessage(texts.Prefix + aboutPlugin.tiktokKanal);
	      
	    }
	    
	} 

}
