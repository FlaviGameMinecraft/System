package dev.flavius.system.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
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

public class defaultGamemode_command implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(command.getName().equalsIgnoreCase("defaultgamemode")) {
			
			if(sender.hasPermission("system.server.admin.defaultGamemode") || sender.hasPermission("system.*")) {
				
				if(args.length == 0) {
					
					sender.sendMessage(texts.Prefix + texts.Usage + "defaultgamemode <Modus>");
					return false;
					
				}else if(args.length == 1) {
					
					if(args[0].equalsIgnoreCase("überleben") || args[0].equalsIgnoreCase("survial") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("0")) {
						
						Bukkit.getServer().setDefaultGameMode(GameMode.SURVIVAL);
						
						//softdepend: Multiverse-Core :
						Bukkit.getServer().getConsoleSender().sendMessage(texts.Prefix + "§7Setze den Standart Spielmodus zu §bÜberlebens Modus...");
						
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode survival Nether");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode survival IKEA-MND-FAMEUR");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode survival plots_the_end");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode survival spawns");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode survival plots");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode survival world");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode survival world_the_end");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode survival world_nether");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode survival farmwelt");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode survival end");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode survival plots_nether");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode survival adminshop");
						
						Bukkit.getServer().getConsoleSender().sendMessage(texts.Prefix + "§aDer Standart Spielmodus wurde erfolgreich zu §bÜbelebens Modus §agesetzt");
						//
						
						sender.sendMessage(texts.Prefix + "§aDer Standart Spielmodus wurde erfolgreich zum §bÜberlebens Modus §aaktualisiert");
						
					}else if(args[0].equalsIgnoreCase("kreativ") || args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("1")) {
						
						Bukkit.getServer().setDefaultGameMode(GameMode.CREATIVE);
						
						//softdepend: Multiverse-Core :
						Bukkit.getServer().getConsoleSender().sendMessage(texts.Prefix + "§7Setze den Standart Spielmodus zu §bKreativ Modus...");
						
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode creative Nether");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode creative IKEA-MND-FAMEUR");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode creative plots_the_end");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode creative spawns");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode creative plots");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode creative world");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode creative world_the_end");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode creative world_nether");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode creative farmwelt");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode creative end");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode creative plots_nether");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode creative adminshop");
						
						Bukkit.getServer().getConsoleSender().sendMessage(texts.Prefix + "§aDer Standart Spielmodus wurde erfolgreich zu §bKreativ Modus §agesetzt");
						//
						
						sender.sendMessage(texts.Prefix + "§aDer Standart Spielmodus wurde erfolgreich zum §bKreativ Modus §aaktualisiert");
						
					}else if(args[0].equalsIgnoreCase("abenteuer") || args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("2")) {
						
						Bukkit.getServer().setDefaultGameMode(GameMode.ADVENTURE); 
						
						//softdepend: Multiverse-Core :
						Bukkit.getServer().getConsoleSender().sendMessage(texts.Prefix + "§7Setze den Standart Spielmodus zu §bAbenteuer Modus...");
						
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode adventure Nether");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode adventure IKEA-MND-FAMEUR");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode adventure plots_the_end");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode adventure spawns");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode adventure plots");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode adventure world");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode adventure world_the_end");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode adventure world_nether");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode adventure farmwelt");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode adventure end");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode adventure plots_nether");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode adventure adminshop");
						
						Bukkit.getServer().getConsoleSender().sendMessage(texts.Prefix + "§aDer Standart Spielmodus wurde erfolgreich zu §bAbenteuer Modus §agesetzt");
						//
						
						sender.sendMessage(texts.Prefix + "§aDer Standart Spielmodus wurde erfolgreich zum §bAbenteuer Modus §aaktualisiert");
						
					}else if(args[0].equalsIgnoreCase("zuschauer") || args[0].equalsIgnoreCase("spectator") || args[0].equalsIgnoreCase("spec") || args[0].equalsIgnoreCase("3")) {
						
						Bukkit.getServer().setDefaultGameMode(GameMode.SPECTATOR);
						
						//softdepend: Multiverse-Core :
						Bukkit.getServer().getConsoleSender().sendMessage(texts.Prefix + "§7Setze den Standart Spielmodus zu §bZuschauer Modus...");
						
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode spectator Nether");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode spectator IKEA-MND-FAMEUR");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode spectator plots_the_end");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode spectator spawns");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode spectator plots");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode spectator world");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode spectator world_the_end");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode spectator world_nether");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode spectator farmwelt");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode spectator end");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode spectator plots_nether");
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "multiverse-core:mvm set mode spectator adminshop");
						
						Bukkit.getServer().getConsoleSender().sendMessage(texts.Prefix + "§aDer Standart Spielmodus wurde erfolgreich zu §bZuschauer Modus §agesetzt");
						//
						
						sender.sendMessage(texts.Prefix + "§aDer Standart Spielmodus wurde erfolgreich zum §bZuschauer Modus §aaktualisiert");
						
					}else if(!args[0].equalsIgnoreCase("überleben") || !args[0].equalsIgnoreCase("survial") || !args[0].equalsIgnoreCase("s") || !args[0].equalsIgnoreCase("0") || !args[0].equalsIgnoreCase("kreativ") || !args[0].equalsIgnoreCase("creative") || !args[0].equalsIgnoreCase("c") || !args[0].equalsIgnoreCase("1") || !args[0].equalsIgnoreCase("abenteuer") || !args[0].equalsIgnoreCase("adventure") || !args[0].equalsIgnoreCase("a") || !args[0].equalsIgnoreCase("2") || !args[0].equalsIgnoreCase("zuschauer") || !args[0].equalsIgnoreCase("spectator") || !args[0].equalsIgnoreCase("spec") || !args[0].equalsIgnoreCase("3")) {
						
						sender.sendMessage(texts.Prefix + texts.Usage + "defaultgamemode <Modus>");
						return false;
						
					}
					
				}else {
					
					sender.sendMessage(texts.Prefix + texts.Usage + "defaultgamemode <Modus>");
					return false;
					
				}
				return false;
				
			}else {
				
				sender.sendMessage(texts.Prefix + "§cDu benötigst §4Leitung §coder höher um diesen Befehl auszuführen dürfen!");
				
			}
			
		}
		
		return false;
	}

}
