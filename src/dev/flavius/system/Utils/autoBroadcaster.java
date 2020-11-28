package dev.flavius.system.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import dev.flavius.system.Utils.strings.texts;
import dev.flavius.system.System;
import dev.flavius.system.Utils.strings.symbole;

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

public class autoBroadcaster {
	
	private final long MESSAGE_DELAY = 300*20;
	private final String ROOT = "BroadcastMessages";
	
	private System plugin;
	private FileConfiguration autoMessages;
	
	public autoBroadcaster(System plugin) {
		this.plugin = plugin;
		autoMessages = plugin.getConfig();
		
		createDefaults();
	}
	
	public void startBrodcast() {
		Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
			@Override
			public void run() {
				Bukkit.broadcastMessage(symbole.DoppelPfeil1);
				Bukkit.broadcastMessage(texts.Prefix + "§7" + ChatColor.translateAlternateColorCodes('&', msg()));
				Bukkit.broadcastMessage(symbole.DoppelPfeil1);
				
				Bukkit.getOnlinePlayers().forEach(playersOnline -> playersOnline.playSound(playersOnline.getLocation(), Sound.LEVEL_UP, 1, 2));
				
			}
			
			
		}, 0, MESSAGE_DELAY);
		
	}
	
	private void createDefaults( ) {
		if(autoMessages.contains(ROOT)) return;
		List<String> defaults = new ArrayList<>();
		for(int i = 0;  i < 3; i++)
			defaults.add("&7Test 1" + i);
		autoMessages.set(ROOT, defaults);
		plugin.saveConfig();
		
	}
	
	private String msg() {
		List<String> messages = autoMessages.getStringList(ROOT);
		int random = new Random().nextInt(messages.size());
		return messages.get(random);
		
	}

}
