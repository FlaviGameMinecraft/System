package dev.flavius.system.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
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

public class ping_command implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender.hasPermission("system.command.ping") || (sender.hasPermission("system.pack.default") || (sender.hasPermission("system.*")))) {
			
			int ping = ((CraftPlayer)sender).getHandle().ping;
			
			if(args.length == 0) {
				if(sender instanceof Player) {
					
					if(command.getName().contentEquals("ping"))
							sender.sendMessage(texts.Prefix + "§7Dein Ping beträgt§8: §b" + ping + "§bms ");
					
				}else
					sender.sendMessage(texts.Prefix + texts.NotAPlayer);
				
			}else
				sender.sendMessage(texts.Prefix + texts.Usage + "ping");
		}else {
			sender.sendMessage(texts.Prefix + texts.NoPerms + "system.command.ping");
			
		}
		return false;
		
	}
}
