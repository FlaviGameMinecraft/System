package dev.flavius.system.events;

import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.plugin.Plugin;

import dev.flavius.system.System;
import dev.flavius.system.Utils.adventskalender_ItemManager;
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

public class adventskalender_CreateInventory implements CommandExecutor {
  @SuppressWarnings("deprecation")
public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
    if (sender instanceof Player) {
    	Player p = (Player)sender;
    		if(p.hasPermission("system.command.event.adventskalender") || p.hasPermission("system.pack.default") || p.hasPermission("system.*")){
    			if (command.getName().equalsIgnoreCase("adventskalender")) {
    				final Inventory inv = Bukkit.createInventory(null, 36, "§6Adventskalender");
    				p.openInventory(inv);
    				final List<Integer> list = (System.getInstance()).adventskalender_Utils.getOpenedPlayerDoors(p);
    				p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
    				Bukkit.getScheduler().scheduleAsyncDelayedTask((Plugin)System.getInstance(), new Runnable() {
    					public void run() {
    						int i;
    						for (i = 1; i < 8; i++) {
    							if (list.contains(Integer.valueOf(i))) {
    								inv.setItem(i, (new adventskalender_ItemManager(Material.ACACIA_DOOR_ITEM)).setDisplayName("§e§lTürchen").setAmount(i).build());
    							} else {
    								inv.setItem(i, (new adventskalender_ItemManager(Material.DARK_OAK_DOOR_ITEM)).setDisplayName("§e§lTürchen").addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).setAmount(i).build());
    							} 
    						} 
    						for (i = 10; i < 17; i++) {
    							if (list.contains(Integer.valueOf(i - 2))) {
    								inv.setItem(i, (new adventskalender_ItemManager(Material.ACACIA_DOOR_ITEM)).setDisplayName("§e§lTürchen").setAmount(i - 2).build());
    							} else {
    								inv.setItem(i, (new adventskalender_ItemManager(Material.DARK_OAK_DOOR_ITEM)).setDisplayName("§e§lTürchen").addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).setAmount(i - 2).build());
    							} 
    						} 
    						for (i = 19; i < 26; i++) {
    							if (list.contains(Integer.valueOf(i - 4))) {
    								inv.setItem(i, (new adventskalender_ItemManager(Material.ACACIA_DOOR_ITEM)).setDisplayName("§e§lTürchen").setAmount(i - 4).build());
    							} else {
    								inv.setItem(i, (new adventskalender_ItemManager(Material.DARK_OAK_DOOR_ITEM)).setDisplayName("§e§lTürchen").addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).setAmount(i - 4).build());
    							} 
    						} 
    						for (i = 30; i < 33; i++) {
    							if (list.contains(Integer.valueOf(i - 8))) {
    								inv.setItem(i, (new adventskalender_ItemManager(Material.ACACIA_DOOR_ITEM)).setDisplayName("§e§lTürchen").setAmount(i - 8).build());
    							} else {
    								inv.setItem(i, (new adventskalender_ItemManager(Material.DARK_OAK_DOOR_ITEM)).setDisplayName("§e§lTürchen").addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).setAmount(i - 8).build());
    							} 
    						} 
    					}
    				});
    			} 
    		}else {
    			
    			p.sendMessage(texts.Prefix + texts.NoPerms + "system.command.adventskalender");
    			
    		}
    	}
    return false;
  }
  
}
