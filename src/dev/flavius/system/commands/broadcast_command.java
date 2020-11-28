package dev.flavius.system.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import dev.flavius.system.Utils.strings.texts;
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

public class broadcast_command implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender.hasPermission("system.command.broadcast") || (sender.hasPermission("system.pack.admin") || (sender.hasPermission("system.*")))) {
			
			if(args.length >= 1) {
				String msg = "";
				for(int i = 0; i< args.length; i++) {
					msg = msg + args[i] + " ";
				}
				Bukkit.broadcastMessage(symbole.DoppelPfeil1);
				Bukkit.broadcastMessage(texts.Prefix + "§7" + ChatColor.translateAlternateColorCodes('&', msg));
				Bukkit.broadcastMessage(symbole.DoppelPfeil1);
				
				Bukkit.getOnlinePlayers().forEach(playersOnline -> playersOnline.playSound(playersOnline.getLocation(), Sound.LEVEL_UP, 1, 2));
			}else
				sender.sendMessage(texts.Prefix + texts.Usage + "broadcast <Nachricht>");
			
		}else {
			sender.sendMessage(texts.Prefix + texts.NoPerms + "system.command.broadcast");
			
		}
		return false;
		
	}
}
