package dev.flavius.system.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import dev.flavius.system.Utils.strings.texts;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;

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

public class system_command implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		Player p = (Player)sender;
		
		if(command.getName().equalsIgnoreCase("system")) {
			
			if(p.hasPermission("system.command.system") || p.hasPermission("system.pack.admin") || p.hasPermission("system.*")) {
				
				if(args.length == 0) {
					
					TextComponent clickeventAboutCMD = new TextComponent("§b/system about");
					
					clickeventAboutCMD.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/system about"));
					
					p.sendMessage(texts.Prefix + "§2Running §bSystem v3.7§2.");
					p.spigot().sendMessage(clickeventAboutCMD);
					p.sendMessage("");
					
				}
				
			}else {
				
				p.sendMessage(texts.Prefix + "§2Running §bSystem v3.7§2.");
				
			}
			
		}
		
		return false;
	}

}
