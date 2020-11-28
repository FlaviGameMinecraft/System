package dev.flavius.system.listener;

import org.bukkit.entity.Player;
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

public class commandBlocker implements Listener{
	
	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("/shop") || e.getMessage().equalsIgnoreCase("/bossshoppro:shop")|| e.getMessage().equalsIgnoreCase("/bossshoppro:bossshop") || e.getMessage().equalsIgnoreCase("/bossshoppro:bs") || e.getMessage().equalsIgnoreCase("/bossshop") || e.getMessage().equalsIgnoreCase("/ver") || e.getMessage().equalsIgnoreCase("/version") || e.getMessage().equalsIgnoreCase("/about") || e.getMessage().equalsIgnoreCase("/icanhasbukkit") || e.getMessage().equalsIgnoreCase("/bukkit:?") || e.getMessage().equalsIgnoreCase("/bukkit:about") || e.getMessage().equalsIgnoreCase("/bukkit:help") || e.getMessage().equalsIgnoreCase("/bukkit:ver") || e.getMessage().equalsIgnoreCase("/bukkit:version") || e.getMessage().equalsIgnoreCase("/bukkit:help") || e.getMessage().equalsIgnoreCase("/bukkit:me") || e.getMessage().equalsIgnoreCase("/bukkit:icanhasbukkit") || e.getMessage().startsWith("/shop") || e.getMessage().startsWith("/bossshoppro:shop")|| e.getMessage().startsWith("/bossshoppro:bossshop") || e.getMessage().startsWith("/bossshoppro:bs") || e.getMessage().startsWith("/bossshop") || e.getMessage().startsWith("/ver") || e.getMessage().startsWith("/version") || e.getMessage().startsWith("/about") || e.getMessage().startsWith("/icanhasbukkit") || e.getMessage().startsWith("/bukkit:?") || e.getMessage().startsWith("/bukkit:about") || e.getMessage().startsWith("/bukkit:help") || e.getMessage().startsWith("/bukkit:ver") || e.getMessage().startsWith("/bukkit:version") || e.getMessage().startsWith("/bukkit:help") || e.getMessage().startsWith("/bukkit:me") || e.getMessage().startsWith("/bukkit:icanhasbukkit") || e.getMessage().startsWith("/staffchat:report") || e.getMessage().startsWith("/report") || e.getMessage().equalsIgnoreCase("/staffchat:report") || e.getMessage().startsWith("/adventskalender") || e.getMessage().startsWith("/system:adventskalender") || e.getMessage().equalsIgnoreCase("/adventskalender") || e.getMessage().equalsIgnoreCase("/system:adventskalender")) {
			
			if(p.hasPermission("system.bypass.commandBlocker") || p.hasPermission("system.*")) {
				
				e.setCancelled(false);
				
			}else {
				
				p.sendMessage(texts.Prefix + "§7Der Command wurde Blockiert!");
				e.setCancelled(true);
				return;
				
			}
			
			if(e.getMessage().equalsIgnoreCase("/pl") || e.getMessage().equalsIgnoreCase("/plugins") || e.getMessage().equalsIgnoreCase("/bukkit:plugins") || e.getMessage().equalsIgnoreCase("/bukkit:pl") || e.getMessage().startsWith("/pl") || e.getMessage().startsWith("/plugins") || e.getMessage().startsWith("/bukkit:plugins") || e.getMessage().startsWith("/bukkit:pl")) {
			
				if(p.hasPermission("system.bypass.commandBlocker") || p.hasPermission("system.*")) {
					
					e.setCancelled(false);
					
				}else {
					
					p.sendMessage("§fPlugins (5): §aPlotSquared§f, §aSystem§f, §aPlaceholderAPI§f, §aLuckPerms§f, §aVault");
					e.setCancelled(true);
					return;
					
				}
				
			}
		
		}
		
	}
	
}
