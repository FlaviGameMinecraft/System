package dev.flavius.system.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import dev.flavius.system.Utils.strings.symbole;
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

public class reload_command implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender.hasPermission("system.server.admin.reload") || sender.hasPermission("system.*")) {
			
		  //Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "bukkit:reload");
			sender.sendMessage(texts.Prefix + "§4Fehler! §cDieser command wurde von §4Inhaber §8" + symbole.KleinesKreuz + " §4YouAmazing §7[§eTeam§7] §cin Wartungen gesetzt!");
			
		}else {
			
			sender.sendMessage(texts.Prefix + "§cDu benötigst §4Leitung §coder höher um diesen Befehl auszuführen dürfen!");
			
		}
		
		return false;
	}

}
