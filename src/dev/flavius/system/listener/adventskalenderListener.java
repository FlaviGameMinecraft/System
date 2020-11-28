package dev.flavius.system.listener;

import dev.flavius.system.System;
import dev.flavius.system.Utils.strings.texts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.server.PluginDisableEvent;
import org.bukkit.plugin.Plugin;

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

public class adventskalenderListener implements Listener {
	
@SuppressWarnings("deprecation")
@EventHandler
  public void onJoin(final PlayerJoinEvent e) {
    Bukkit.getScheduler().scheduleAsyncDelayedTask((Plugin)System.getInstance(), new Runnable() {
          public void run() {
            File file = new File("plugins//System//AdventsKalender//players.yml");
            YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
            (System.getInstance()).adventskalender_Utils.setOpenedPlayerDoors(e.getPlayer(), cfg.getIntegerList(e.getPlayer().getUniqueId().toString()));
          }
        });
  }
  
  @EventHandler
  public void onClick(InventoryClickEvent e) {
    Player p = (Player)e.getWhoClicked();
    if (e.getInventory().getName().equalsIgnoreCase("§6Adventskalender")) {
      e.setCancelled(true);
      if (e.getCurrentItem() != null) {
        if (e.getCurrentItem().getItemMeta() == null)
          return; 
        if (e.getCurrentItem().getItemMeta().hasEnchants()) {
          if (e.getCurrentItem().getAmount() <= getDay()) {
            p.sendMessage(texts.Prefix + "§aDu hast das Türchen §6" + e.getCurrentItem().getAmount() + " §ageöffnet!");
            List<Integer> list = (System.getInstance()).adventskalender_Utils.getOpenedPlayerDoors(p);
            list.add(Integer.valueOf(e.getCurrentItem().getAmount()));
            (System.getInstance()).adventskalender_Utils.setOpenedPlayerDoors(p, list);
            p.playSound(p.getLocation(), Sound.CHEST_CLOSE, 0.3F, 0.3F);
            for (String s : (System.getInstance()).adventskalender_Utils.getCommandList(e.getCurrentItem().getAmount()))
              Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), s.replace("%player%", p.getName())); 
          } else {
            p.sendMessage(texts.Prefix + "§cDu darfst dieses Türchen noch nicht öffnen!");
          } 
        } else {
          p.sendMessage(texts.Prefix + "§cDieses Türchen hast du bereits geöffnet!");
        } 
      } 
    } 
  }
  
  private int getDay() {
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
    return Integer.parseInt(simpleDateFormat.format(calendar.getTime()));
  }
  
  @EventHandler
  public void onDisable(PluginDisableEvent e) {
    File file = new File("plugins//System//AdventsKalender//players.yml");
    YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
    for (Player all : Bukkit.getOnlinePlayers())
      cfg.set(all.getUniqueId().toString(), (System.getInstance()).adventskalender_Utils.getOpenedPlayerDoors(all)); 
    try {
      cfg.save(file);
    } catch (IOException e1) {
      e1.printStackTrace();
    } 
  }
  
  @EventHandler
  public void onQuit(PlayerQuitEvent e) {
    File file = new File("plugins//System//AdventsKalender//players.yml");
    YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
    cfg.set(e.getPlayer().getUniqueId().toString(), (System.getInstance()).adventskalender_Utils.getOpenedPlayerDoors(e.getPlayer()));
    try {
      cfg.save(file);
    } catch (IOException e1) {
      e1.printStackTrace();
    } 
  }
}