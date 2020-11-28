package dev.flavius.system.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
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

public class clear_command implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		Player p = (Player) sender;
		
		if(command.getName().equalsIgnoreCase("clear")) {
			
				if(sender.hasPermission("system.command.clear") || (sender.hasPermission("system.pack.admin") || (sender.hasPermission("system.*")))) {
					
					if(args.length == 0) {
						
						sender.sendMessage(texts.Prefix + texts.Usage + "clear <Spieler>");
						return false;
						
					}else if(args.length == 1) {
						
						if(sender instanceof Player) {
						
						p.getInventory().clear();
						
						p.getEquipment().clear();
						
						p.sendMessage(texts.Prefix + "§7Dein Inventar wurde erfolgreich geleert");
						
						}else {
							
							sender.sendMessage(texts.Prefix + texts.NotAPlayer);
							
						}
						
					}else if(args.length == 2) {
						
						Player t = Bukkit.getPlayer(args[1]);
						
						try {
						
							if(args[1].equalsIgnoreCase(sender.getName())) {
								
								if(sender instanceof Player) {
							
								p.getInventory().clear();
							
								p.getEquipment().clear();
							
								p.sendMessage(texts.Prefix + "§7Dein Inventar wurde erfolgreich geleert");
								
								}else {
									
									sender.sendMessage(texts.Prefix + texts.NotAPlayer);
									
								}
							
							}else if(args[1].equalsIgnoreCase("*")) {
							
								for (Player all : Bukkit.getOnlinePlayers()) {
								
									all.getInventory().clear();
								
									all.getEquipment().clear();
								
									all.sendMessage(texts.Prefix + "§7Dein Inventar wurde von bc" + sender.getName() + "§7 geleert");
									
									sender.sendMessage(texts.Prefix + "§7Das Inventar von §b" + t.getName() + " §7wurde erfolgreich geleert");
								
								}
							
							}else if(!args[1].equalsIgnoreCase(sender.getName()) || !args[1].equalsIgnoreCase("*")) {
								
								if(sender instanceof Player) {
							
								p.getInventory().clear();
							
								p.getEquipment().clear();
							
								p.sendMessage(texts.Prefix + "§7Dein Inventar wurde von bc" + sender.getName() + "§7 geleert");
								
								sender.sendMessage(texts.Prefix + "§7Das Inventar von §b" + t.getName() + " §7wurde erfolgreich geleert");
							
								}else {
									
									sender.sendMessage(texts.Prefix + texts.NotAPlayer);
									
								}
								
							}
							
						}catch (NullPointerException npe) {
							
							sender.sendMessage(texts.Prefix + "§4Fehler! §cDer Spieler §b" + args[1] + " §cKonnte nicht gefunden werden!");
							
							
						}
						
					}else {
						
						sender.sendMessage(texts.Prefix + texts.Usage + "clear <Spieler>");
						return false;
						
					}
					
				}
				
		}
		
		return false;
	}

}
