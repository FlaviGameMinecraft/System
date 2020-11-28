package dev.flavius.system.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import dev.flavius.system.Utils.strings.symbole;
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

public class tt_command implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
			if(command.getName().equalsIgnoreCase("tiktok")) {
				
				Player p = (Player)sender;
				
				if(p.hasPermission("system.command.tiktok") || p.hasPermission("system.pack.default") || p.hasPermission("system.*")) {
					
					if(args.length == 0) {
					
					p.sendMessage(texts.Prefix + "§aUnsere TikTok Kanäle");
					p.sendMessage(texts.Prefix + "§r  §r" + symbole.KleinesKreuz + " §aServer§8:");
					p.sendMessage(texts.Prefix + "§r    §r" + symbole.DoppelPfeil1 + " §aminecart");
					p.sendMessage(texts.Prefix + "§r  §r" + symbole.KleinesKreuz + " §4Inhaber§8:");
					p.sendMessage(texts.Prefix + "§r    §r" + symbole.DoppelPfeil1 + " §4YouAmazing");
					p.sendMessage(texts.Prefix + "§r    §r" + symbole.DoppelPfeil1 + " §4TaktischerNick");
					p.sendMessage(texts.Prefix + "§r  §r" + symbole.KleinesKreuz + " §4Leitung§8:");
					p.sendMessage(texts.Prefix + "§r    §r" + symbole.DoppelPfeil1 + " §4LennyYT");
				  //p.sendMessage(texts.Prefix + "§r  §r" + symbole.KleinesKreuz + " §4Admin§8:");
				  //p.sendMessage(texts.Prefix + "§r  §r" + symbole.KleinesKreuz + " §aBuilder§8:");
			      //p.sendMessage(texts.Prefix + "§r  §r" + symbole.KleinesKreuz + " §3Moderator§8:");
				  //p.sendMessage(texts.Prefix + "§r  §r" + symbole.KleinesKreuz + " §9Helfer§8:");
					p.sendMessage(texts.Prefix + "§r  §r" + symbole.KleinesKreuz + " §bAzubi§8:");
					p.sendMessage(texts.Prefix + "§r    §r" + symbole.DoppelPfeil1 + " §bottikarotti");
					p.sendMessage(texts.Prefix + "");
					p.sendMessage(texts.Prefix + "§cBenutze§8: §b/tt <Teammitglied>");
					p.sendMessage(texts.Prefix + "");
					
					}else if(args.length == 1) {
						
						if(args[0].equalsIgnoreCase("YouAmazing")) {
							
							//message//
							TextComponent message = new TextComponent(texts.Prefix + "§7YouAmazing's TikTok Kanal§8: ");

							message.setColor(ChatColor.GRAY);

							ComponentBuilder cb = new ComponentBuilder("§8» §b@YouAmazing §8«").bold(false).color(ChatColor.BLUE);
							TextComponent tiktok = new TextComponent("§b@AddventureTime");

							tiktok.setColor(ChatColor.BLUE);
							tiktok.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, cb.create()));
							tiktok.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.tiktok.com/@AddventureTime"));

							message.addExtra(tiktok);
							
							//send//
							p.sendMessage(symbole.DoppelPfeil1);
							p.spigot().sendMessage(message);
							p.sendMessage(symbole.DoppelPfeil1);
							
						}else if(args[0].equalsIgnoreCase("TaktischerNick")) {
							
							//message//
							TextComponent message = new TextComponent(texts.Prefix + "§7TaktischerNick's TikTok Kanal§8: ");

							message.setColor(ChatColor.GRAY);

							ComponentBuilder cb = new ComponentBuilder("§8» §7Klicke Hier §8«").bold(false).color(ChatColor.BLUE);
							TextComponent tiktok = new TextComponent("§b@TaktischerNick");

							tiktok.setColor(ChatColor.BLUE);
							tiktok.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, cb.create()));
							tiktok.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.tiktok.com/@TaktischerNick"));

							message.addExtra(tiktok);
							
							//send//
							p.sendMessage(symbole.DoppelPfeil1);
							p.spigot().sendMessage(message);
							p.sendMessage(symbole.DoppelPfeil1);
							
						}else if(args[0].equalsIgnoreCase("LennyYT")) {
							
							//message//
							TextComponent message = new TextComponent(texts.Prefix + "§7LennyYT's TikTok Kanal§8: ");

							message.setColor(ChatColor.GRAY);

							ComponentBuilder cb = new ComponentBuilder("§8» §7Klicke Hier §8«").bold(false).color(ChatColor.BLUE);
							TextComponent tiktok = new TextComponent("§b@leaks.by.lenny");

							tiktok.setColor(ChatColor.BLUE);
							tiktok.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, cb.create()));
							tiktok.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.tiktok.com/@leaks.by.lenny"));

							message.addExtra(tiktok);
							
							//send//
							p.sendMessage(symbole.DoppelPfeil1);
							p.spigot().sendMessage(message);
							p.sendMessage(symbole.DoppelPfeil1);
							
						}else if(args[0].equalsIgnoreCase("ottikarotti")) {
							
							//message//
							TextComponent message = new TextComponent(texts.Prefix + "§7ottikarotti's TikTok Kanal§8: ");

							message.setColor(ChatColor.GRAY);

							ComponentBuilder cb = new ComponentBuilder("§8» §7Klicke Hier §8«").bold(false).color(ChatColor.BLUE);
							TextComponent tiktok = new TextComponent("§b@ottikarotti");

							tiktok.setColor(ChatColor.BLUE);
							tiktok.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, cb.create()));
							tiktok.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.tiktok.com/@ottikarotti.mc"));

							message.addExtra(tiktok);
							
							//send//
							p.sendMessage(symbole.DoppelPfeil1);
							p.spigot().sendMessage(message);
							p.sendMessage(symbole.DoppelPfeil1);
							
						}else if(args[0].equalsIgnoreCase("minecart")) {
							
							//message//
							TextComponent message = new TextComponent(texts.Prefix + "§7MineCart's TikTok Kanal§8: ");

							message.setColor(ChatColor.GRAY);

							ComponentBuilder cb = new ComponentBuilder("§8» §7Klicke Hier §8«").bold(false).color(ChatColor.BLUE);
							TextComponent tiktok = new TextComponent("§b@minecart.playmc");

							tiktok.setColor(ChatColor.BLUE);
							tiktok.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, cb.create()));
							tiktok.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.tiktok.com/@minecart.playmc"));

							message.addExtra(tiktok);
							
							//send//
							p.sendMessage(symbole.DoppelPfeil1);
							p.spigot().sendMessage(message);
							p.sendMessage(symbole.DoppelPfeil1);
							
						}else {
							
							p.sendMessage(texts.Prefix + "§cFehler! Das angegebene Teammitglied existiert nicht!");
							p.sendMessage(texts.Prefix + "§7Benutze §b/tiktok §7um die Liste der Teammitglieder zu sehen.");
							
						}
						
					}
					
				}else {
					
					p.sendMessage(texts.Prefix + texts.NoPerms + "system.command.tiktok");
					
				}
				
			}
			
			
		return false;
	}

}
