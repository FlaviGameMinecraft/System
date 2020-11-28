package dev.flavius.system.listener.onXXX;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
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

public class onQuit implements Listener {
	
	@EventHandler
    public void onJoinEvent(PlayerQuitEvent e) { //
		
		@SuppressWarnings("unused")
		Player p = e.getPlayer();
		
    	if(e.getPlayer().hasPermission("system.message.silent.quit") || (e.getPlayer().hasPermission("system.message.silent.*") || (e.getPlayer().hasPermission("system.*")))) {

    		if(!e.getPlayer().hasPermission("system.bypass.gamemodeReset") || (!e.getPlayer().hasPermission("system.pack.admin") || (!e.getPlayer().hasPermission("system.*")))) {
    			
    			e.getPlayer().setGameMode(Bukkit.getServer().getDefaultGameMode());
    			
    		}
    		
    		e.setQuitMessage(null);
    		
    		Bukkit.getConsoleSender().sendMessage(texts.Prefix + "§7[§c-§7] §a" + e.getPlayer().getName() + " §7Hat den Server Verlassen");
    		Bukkit.getConsoleSender().sendMessage(texts.Prefix + "§a" + e.getPlayer().getName() + " §7Hat Silent §cQuit §7Rechte. Setze §cQuit §7Message auf §cFalse§7...");
    		
    	}else {
    		
        	if(!e.getPlayer().hasPermission("system.bypass.gamemodeReset") || (!e.getPlayer().hasPermission("system.pack.admin") || (!e.getPlayer().hasPermission("system.*")))) {
        			
        		e.getPlayer().setGameMode(Bukkit.getServer().getDefaultGameMode());
        			
        	}
    		
    		e.setQuitMessage(JoinQuitToggle_command.outputQ.replaceAll("", null).replaceAll(" ", null).replaceAll(null, null));
    		Bukkit.getConsoleSender().sendMessage(texts.Prefix + "§7[§c-§7] §a" + e.getPlayer().getName() + " §7Hat den Server Verlassen");
    		Bukkit.getConsoleSender().sendMessage(texts.Prefix + "§a" + e.getPlayer().getName() + " §7Hat Keine Silent §cQuit §7Rechte. Setze §cQuit §7Message auf §aTrue§7...");
    		
    	}
    	
	}
	
}
