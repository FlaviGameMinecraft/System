package dev.flavius.system.commands;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

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

public class report_command implements CommandExecutor {
  public static Plugin main;
  
  public report_command(Plugin main) {
    report_command.main = main;
  }
  
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    Player p = (Player)sender;
    if (p.hasPermission("system.command.report") || (p.hasPermission("system.pack.admin") || (p.hasPermission("system.*")))) {
      if (args.length == 0) {
        p.sendMessage(texts.Prefix + texts.Usage + "report <Spieler> <Grund>");
        p.playSound(p.getLocation(), Sound.NOTE_BASS, 10.0F, 10.0F);
      } else if (args.length == 1) {
    	p.sendMessage(texts.Prefix + texts.Usage + "report <Spieler> <Grund>");
        p.playSound(p.getLocation(), Sound.NOTE_BASS, 10.0F, 10.0F);
      } else if (args.length == 2) {
        Player target = Bukkit.getPlayer(args[0]);
        if(args[0].equalsIgnoreCase(sender.getName())) {
        	sender.sendMessage(texts.Prefix + "§4Fehler! §cDu darfst dich nicht selbst Reporten!");
        }else if(args[0].equalsIgnoreCase("YouAmazing")) {
        		sender.sendMessage(texts.Prefix + "§4Fehler! §cDu darfst YouAmazing nicht Reporten!");
        	}else if(args[0].equalsIgnoreCase("TaktischerNick")) {
        		sender.sendMessage(texts.Prefix + "§4Fehler! §cDu darfst TaktischerNick nicht Reporten!");
        }else {
        	if (target != null) {
                for (Player Stuff : Bukkit.getOnlinePlayers()) {
                  if (Stuff.hasPermission("system.see.report") || (Stuff.hasPermission("system.pack.admin") || (Stuff.hasPermission("system.*")))) {
                    Stuff.sendMessage("§7§m---------------§r §8[ §cReport §8] §7§m---------------§r");
                    Stuff.sendMessage(symbole.DoppelPfeil1 + " §7Ein §cReport §7wurde eingereicht");
                    Stuff.sendMessage("");
                    Stuff.sendMessage(symbole.DoppelPfeil1 + " §7Name vom Reportetem Spieler: §c" + target.getName());
                    Stuff.sendMessage(symbole.DoppelPfeil1 + " §7Name vom Reporter: §a" + p.getName());
                    Stuff.sendMessage(symbole.DoppelPfeil1 + " §7Grund: §c" + args[1]);
                    Stuff.sendMessage("§7§m---------------§r §8[ §cReport §8] §7§m---------------§r");
                    Stuff.playSound(Stuff.getLocation(), Sound.SUCCESSFUL_HIT, 10.0F, 10.0F);
                  } 
                } 
                p.sendMessage(texts.Prefix + "§7Du hast den Spieler §c" + target.getName() + " §7für §c" + args[1] + " §7gemeldet!");
                p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 10.0F, 10.0F);
              } 
        }
      } else {
    	  sender.sendMessage(texts.Prefix + "§4Fehler! §cDer Spieler §b" + args[1] + " §cKonnte nicht gefunden werden!");
      	}  
      return false;
    }else {
    	
    	p.sendMessage(texts.Prefix + texts.NoPerms + "system.command.report");
    	
    }
	return false;
  }
}
