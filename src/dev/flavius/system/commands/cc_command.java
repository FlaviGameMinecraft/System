package dev.flavius.system.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
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

public class cc_command implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender.hasPermission("system.command.clearchat") || (sender.hasPermission("system.pack.admin") || (sender.hasPermission("system.*")))) {
			
			if(args.length == 0) {
				
				Bukkit.getOnlinePlayers().forEach(target -> {
					
					if(target.hasPermission("system.bypass.clearchat") || target.hasPermission("system.pack.admin") || target.hasPermission("system.*")) {
						
						target.sendMessage(texts.Prefix + "§aBypass-Rechte vorhanden§8.");
						target.sendMessage(texts.Prefix + "§e§lDer Chat verlauf wurde von §b§l" + sender.getName() + "§r §e§lgeleert");
						
					}else {
						for(int i = 0; i<75; i++) {
							target.sendMessage(texts.Prefix + "§e§lʕ•ᴥ•ʔ" + "   §d§l<3");
							target.sendMessage(texts.Prefix + "§a§lฅ^•ﻌ•^ฅ" + "   §c§l<3");
							target.sendMessage(texts.Prefix + "§9§lʕ •́؈•̀ ₎" + "   §d§l<3");
							target.sendMessage(texts.Prefix + "§d§l▼・ᴥ・▼" + "   §b§l<3");
							target.sendMessage(texts.Prefix + "§c§l♡´･ᴗ･`♡" + "   §e§l<3");
							target.sendMessage(texts.Prefix + "§9§l༼ つ ◕◡◕ ༽つ" + "   §a§l<3");
							target.sendMessage(texts.Prefix + "§b§l(⊃｡•́‿•̀｡)⊃" + "   §b§l<3");
							target.sendMessage(texts.Prefix + "§a§l( ͡° ͜ʖ ͡°)" + "   §9§l<3");
						}
						target.sendMessage(texts.Prefix + "§e§lDer Chat verlauf wurde von §b§l" + sender.getName() + "§r §e§lgeleert");
						
					}
					
				});
			}else {
				sender.sendMessage(texts.Prefix + texts.Usage + "cc");
				
			}
			
		}else {
			sender.sendMessage(texts.Prefix + texts.NoPerms + "system.command.clearchat");
			
		}
		
		return false;
	}

}
