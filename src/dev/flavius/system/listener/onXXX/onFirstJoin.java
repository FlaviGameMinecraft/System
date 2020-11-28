package dev.flavius.system.listener.onXXX;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import dev.flavius.system.Utils.strings.symbole;
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

public class onFirstJoin implements Listener{
	
	@EventHandler
    public void OnFirstJoin(PlayerJoinEvent e) {
		
    	if(!e.getPlayer().hasPlayedBefore()) {
    		
    		Location loc = new Location (Bukkit.getWorld("world"), 0, 69, 0);
    		loc.setYaw((float) -90);
    		e.getPlayer().getLocation().setPitch((float) 2);
    		e.getPlayer().teleport(loc);
    		e.getPlayer().getLocation().setPitch((float) 2); 
    		  
    		e.setJoinMessage(null);
    		
    		e.getPlayer().setGameMode(Bukkit.getServer().getDefaultGameMode());
    		
    		//StartItems:
    		
    			e.getPlayer().getInventory();
    		
    			//Rüstung:
    				e.getPlayer().getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET, 1));
    				e.getPlayer().getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE, 1));
    				e.getPlayer().getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS, 1));
    				e.getPlayer().getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS, 1));
    		
    			//Items:
    				
    				
    			e.getPlayer().updateInventory();
    			
    		Bukkit.broadcastMessage(symbole.DoppelPfeil1);
    		Bukkit.broadcastMessage(texts.Prefix + "§aNeuer Spieler§8! §7Willkommen §b" + e.getPlayer().getName());
    		Bukkit.broadcastMessage(symbole.DoppelPfeil1);
    		
    	}
    	
	}
	
}
