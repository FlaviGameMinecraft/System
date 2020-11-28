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

public class help_command implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(command.getName().equalsIgnoreCase("help")) {
			
			Player p = (Player)sender;
			
			if(p.hasPermission("system.command.help") || p.hasPermission("system.pack.default") || p.hasPermission("system.*")) {
				
					//discordMessage:
					TextComponent discordMessage = new TextComponent("§9Discord");

					discordMessage.setColor(ChatColor.GRAY);

					ComponentBuilder cb1 = new ComponentBuilder("§8» §7Klicke Hier §8«").bold(false).color(ChatColor.BLUE);
					TextComponent discord = new TextComponent("");

					discord.setColor(ChatColor.BLUE);
					discord.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, cb1.create()));
					discord.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.discord.gg/BxdnKQw"));

					discordMessage.addExtra(discord);
					
					//clickeventCMD:
					
					TextComponent clickeventSupportCmd = new TextComponent("§b/report <Player> <Nachricht>");

					clickeventSupportCmd.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/report <Player> <Nachricht>"));
					
					//message:
					p.sendMessage("§f§m--------------§8[§r §aMineCart §8]§f§m--------------");
					p.sendMessage("§6Willkommen im Help-Menü §b" + p.getName() + "§8!");
					p.sendMessage("§7Falls du einen Spieler melden möchtest Benutze§8:");
					p.spigot().sendMessage(clickeventSupportCmd);
					p.sendMessage("§7Oder wende dich an unserem Support-Channel im§8:");
					p.spigot().sendMessage(discordMessage);
					p.sendMessage("§f§m--------------§8[§r §aMineCart §8]§f§m--------------");
					
			}else {
				
				p.sendMessage(texts.Prefix + texts.NoPerms + "system.command.help");
				
			}
			
		}
		
		return false;
	}

}
