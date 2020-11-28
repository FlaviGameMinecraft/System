package dev.flavius.system.listener.onXXX;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import dev.flavius.system.Utils.strings.texts;
import dev.flavius.system.commands.JoinQuitToggle_command;

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

public class onJoin implements Listener {

	@EventHandler
    public void onJoinEvent(PlayerJoinEvent e) { //onFirstJoin: dev.flavius.system.listener.onXXX.onFirstJoin
		
    	if(e.getPlayer().hasPermission("system.message.silent.join") || (e.getPlayer().hasPermission("system.message.silent.*") || (e.getPlayer().hasPermission("system.*")))) {

    		if(!e.getPlayer().hasPermission("system.bypass.gamemodeReset") || (!e.getPlayer().hasPermission("system.pack.admin") || (!e.getPlayer().hasPermission("system.*")))) {
    			
    			e.getPlayer().setGameMode(Bukkit.getServer().getDefaultGameMode());
    			
    		}
    		
    		e.setJoinMessage(null);
    		
    		Bukkit.getConsoleSender().sendMessage(texts.Prefix + "§7[§a+§7] §a" + e.getPlayer().getName() + " §7Hat den Server Betreten");
    		Bukkit.getConsoleSender().sendMessage(texts.Prefix + "§a" + e.getPlayer().getName() + " §7Hat Silent §aJoin §7Rechte. Setze §aJoin §7Message auf §cFalse§7...");
    		
    	}else {
    		
        	if(!e.getPlayer().hasPermission("system.bypass.gamemodeReset") || (!e.getPlayer().hasPermission("system.pack.admin") || (!e.getPlayer().hasPermission("system.*")))) {
        			
        		e.getPlayer().setGameMode(Bukkit.getServer().getDefaultGameMode());
        			
        	}
    		
    		e.setJoinMessage(JoinQuitToggle_command.outputJ);
    		
    		Bukkit.getConsoleSender().sendMessage(texts.Prefix + "§7[§a+§7] §a" + e.getPlayer().getName() + " §7Hat den Server Betreten");
    		Bukkit.getConsoleSender().sendMessage(texts.Prefix + "§a" + e.getPlayer().getName() + " §7Hat Keine Silent §aJoin §7Rechte. Setze §aJoin §7Message auf §aTrue§7...");
    		
    	}
    	
	}
	
}
