package dev.flavius.system;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import dev.flavius.system.Utils.adventskalender_Utils;
import dev.flavius.system.Utils.autoBroadcaster;
import dev.flavius.system.Utils.getRandomMS;
import dev.flavius.system.Utils.strings.texts;
import dev.flavius.system.commands.JoinQuitToggle_command;
import dev.flavius.system.commands.broadcast_command;
import dev.flavius.system.commands.clear_command;
import dev.flavius.system.commands.clearchat_command;
import dev.flavius.system.commands.defaultGamemode_command;
import dev.flavius.system.commands.discord_command;
import dev.flavius.system.commands.gamemode_command;
import dev.flavius.system.commands.gm_command;
import dev.flavius.system.commands.help_command;
import dev.flavius.system.commands.ping_command;
import dev.flavius.system.commands.reload_command;
import dev.flavius.system.commands.report_command;
import dev.flavius.system.commands.restart_command;
import dev.flavius.system.commands.system_command;
import dev.flavius.system.commands.tiktok_command;
import dev.flavius.system.commands.tt_command;
import dev.flavius.system.events.adventskalender_CreateInventory;
import dev.flavius.system.listener.aboutPlugin;
import dev.flavius.system.listener.adventskalenderListener;
import dev.flavius.system.listener.commandBlocker;
import dev.flavius.system.listener.onXXX.onDeath;
import dev.flavius.system.listener.onXXX.onFirstJoin;
import dev.flavius.system.listener.onXXX.onJoin;
import dev.flavius.system.listener.onXXX.onQuit;
import dev.flavius.system.listener.onXXX.onUnkownCommand;

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

public class System extends JavaPlugin {
	
	public static Plugin plugin;
	
	private static System instance;
	
	public adventskalender_Utils adventskalender_Utils = new adventskalender_Utils();
	
	public void onEnable() {
		sleep(1087);
		Bukkit.getConsoleSender().sendMessage(texts.cPrefix + "§aSystem Startet...");
		sleep(3000);
		Bukkit.getConsoleSender().sendMessage(texts.cPrefix + "§aRegistriere Commands...");
		sleep(2456);
		Bukkit.getConsoleSender().sendMessage(texts.cPrefix + "§aRegistriere Listeners...");
		sleep(2368);
		Bukkit.getConsoleSender().sendMessage(texts.cPrefix + "§aRegistriere Utils...");
		register();
		sleep(1087);
		onAdventsKalenderConfig();
		sleep(2567);
		Bukkit.getConsoleSender().sendMessage(texts.cPrefix + "§aErstelle Config...");
		sleep(2534);
		Bukkit.getConsoleSender().sendMessage(texts.cPrefix + "§aKonfiguriere Config...");
		sleep(1087);
		sleep(2343);
		Bukkit.getConsoleSender().sendMessage("§m----------§r [ §aSystem §r ] §m----------§r");
		Bukkit.getConsoleSender().sendMessage(" ");
		Bukkit.getConsoleSender().sendMessage("§aSystem by §bFlavius");
		Bukkit.getConsoleSender().sendMessage(aboutPlugin.tiktokKanal);
		Bukkit.getConsoleSender().sendMessage(" ");
		Bukkit.getConsoleSender().sendMessage("§aSystem erfolgreich geladen in §b" + getRandomMS.output);
		Bukkit.getConsoleSender().sendMessage(" ");
		Bukkit.getConsoleSender().sendMessage("§m----------§r [ §aSystem §r ] §m----------§r");
		sleep(4343);
		
	}
	public void onDisable() {
		sleep(1087);
		Bukkit.getConsoleSender().sendMessage(texts.cPrefix + "§aSystem Wird Heruntergefahren...");
		sleep(3000);
		Bukkit.getConsoleSender().sendMessage(texts.cPrefix + "§aStoppe Commands...");
		sleep(2456);
		Bukkit.getConsoleSender().sendMessage(texts.cPrefix + "§aStoppe Listeners...");
		sleep(2368);
		Bukkit.getConsoleSender().sendMessage(texts.cPrefix + "§aStoppe Utils...");
		sleep(3567);
		Bukkit.getConsoleSender().sendMessage(texts.cPrefix + "§aSpeicher Config...");
		sleep(2534);
		Bukkit.getConsoleSender().sendMessage(texts.cPrefix + "§aStoppe Config...");
		sleep(1087);
		sleep(2343);
		Bukkit.getConsoleSender().sendMessage("§m----------§r [ §aSystem §r ] §m----------§r");
		Bukkit.getConsoleSender().sendMessage(" ");
		Bukkit.getConsoleSender().sendMessage("§aSystem by §bFlavius");
		Bukkit.getConsoleSender().sendMessage(aboutPlugin.tiktokKanal);
		Bukkit.getConsoleSender().sendMessage(" ");
		Bukkit.getConsoleSender().sendMessage("§aSystem erfolgreich entladen in §b" + getRandomMS.output);
		Bukkit.getConsoleSender().sendMessage(" ");
		Bukkit.getConsoleSender().sendMessage("§m----------§r [ §aSystem §r ] §m----------§r");
		sleep(4343);
	    
	}
	public void register() {
		
		// Commands register //
			getCommand("system").setExecutor(new system_command());
			getCommand("bc").setExecutor(new broadcast_command());
			getCommand("broadcast").setExecutor(new broadcast_command());
			getCommand("cc").setExecutor(new clearchat_command()); 
			getCommand("clearchat").setExecutor(new clearchat_command()); 
			getCommand("dc").setExecutor(new discord_command());
			getCommand("discord").setExecutor(new discord_command());
			getCommand("ping").setExecutor(new ping_command());
			getCommand("help").setExecutor(new help_command());
			getCommand("adventskalender").setExecutor(new adventskalender_CreateInventory());
			getCommand("report").setExecutor(new report_command(this));
			getCommand("tiktok").setExecutor(new tiktok_command());
			getCommand("tt").setExecutor(new tt_command());
			getCommand("gamemode").setExecutor(new gamemode_command());
			getCommand("gm").setExecutor(new gm_command());
			getCommand("reload").setExecutor(new reload_command());
			getCommand("rl").setExecutor(new reload_command());
			getCommand("restart").setExecutor(new restart_command());
			getCommand("defaultgamemode").setExecutor(new defaultGamemode_command());
			getCommand("clear").setExecutor(new clear_command());
			getCommand("joinquittoggle").setExecutor(new JoinQuitToggle_command());
			
		// Listener register //
			PluginManager pm = Bukkit.getPluginManager();
			pm.registerEvents(new onFirstJoin(), this);
			pm.registerEvents(new onJoin(), this);
			pm.registerEvents(new onQuit(), this);
			pm.registerEvents(new onDeath(), this);
			pm.registerEvents(new aboutPlugin(), this);
			pm.registerEvents(new onFirstJoin(), this);
			pm.registerEvents(new commandBlocker(), this);
			pm.registerEvents(new adventskalenderListener(), this);
			pm.registerEvents(new onUnkownCommand(), this);
			pm.registerEvents(new JoinQuitToggle_command(), this);
			
		// Utils register//
			new autoBroadcaster(this).startBrodcast();
		
	}
	public static System getInstance() {
		return instance;
		 
	}
	private void onAdventsKalenderConfig() {
	    instance = this;
	    File file = new File("plugins//System//AdventsKalender//kalender.yml");
	    YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	    if (!file.exists()) {
	      for (int i = 1; i < 25; i++) {
	        cfg.set(i + "", Arrays.asList(new String[] { "system:broadcast §a%player% §7hat sein §e" + i + " §7Türchen aufgemacht§8! §b/Adventskalender" }));
	        this.adventskalender_Utils.addCommandList(i, Arrays.asList(new String[] { "system:broadcast §a%player% §7hat sein §e" + i + " §7Türchen aufgemacht§8! §b/Adventskalender" }));
	      } 
	      try {
	        cfg.save(file);
	      } catch (IOException iOException) {}
	    } else {
	      for (int i = 1; i < 25; i++)
	        this.adventskalender_Utils.addCommandList(i, cfg.getStringList(i + "")); 
	    } 
	  }
	
	public static void sleep(long millis) {
		
		try {
			
			Thread.sleep(millis);
			
		}catch (InterruptedException ignored){
			
		}
		
	}
	
}
