
package dev.flavius.system.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import dev.flavius.system.Utils.strings.texts;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
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

public class dc_command implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {	
		
		Player p = (Player)sender;
		
		if(args.length == 0) {
			
			if(p.hasPermission("system.command.discord") || (p.hasPermission("system.pack.default") || (p.hasPermission("system.*")))) {

				TextComponent message = new TextComponent(texts.Prefix + "Klicke Hier um unserem ");

				message.setColor(ChatColor.GRAY);

				ComponentBuilder cb = new ComponentBuilder("§8» §7Klicke Hier §8«").bold(false).color(ChatColor.BLUE);
				TextComponent discord = new TextComponent("§9Discord Server §7zu Joinen!");

				discord.setColor(ChatColor.BLUE);
				discord.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, cb.create()));
				discord.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.discord.gg/BxdnKQw"));

				message.addExtra(discord);
				p.spigot().sendMessage(message);
					
				}else 
					p.sendMessage(texts.Prefix + texts.NoPerms + "system.command.discord");
				
		}else {
			
			p.sendMessage(texts.Prefix + texts.Usage + "dc");
			
		}
		return false;
	}
}
