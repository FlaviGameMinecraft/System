package dev.flavius.system.Utils;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.bukkit.entity.Player;

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

public class adventskalender_Utils {
  private ConcurrentHashMap<Integer, List<String>> list = new ConcurrentHashMap<>();
  
  private ConcurrentHashMap<String, List<Integer>> playerList = new ConcurrentHashMap<>();
  
  public List<String> getCommandList(int tuer) {
    return this.list.get(Integer.valueOf(tuer));
  }
  
  public void addCommandList(int tuer, List<String> list) {
    this.list.put(Integer.valueOf(tuer), list);
  }
  
  public List<Integer> getOpenedPlayerDoors(Player p) {
    return this.playerList.get(p.getName());
  }
  
  public void setOpenedPlayerDoors(Player p, List<Integer> list) {
    this.playerList.put(p.getName(), list);
  }
}
