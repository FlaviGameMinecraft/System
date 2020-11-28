package dev.flavius.system.Utils;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BannerMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;

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

public class adventskalender_ItemManager {
  private ItemStack item;
  
  private List<String> lore = new ArrayList<>();
  
  private ItemMeta meta;
  
  public adventskalender_ItemManager(Material mat, short subid, int amount) {
    this.item = new ItemStack(mat, amount, subid);
    this.meta = this.item.getItemMeta();
  }
  
  public adventskalender_ItemManager(ItemStack item) {
    this.item = item;
    this.meta = item.getItemMeta();
  }
  
  public adventskalender_ItemManager(Material mat, short subid) {
    this.item = new ItemStack(mat, 1, subid);
    this.meta = this.item.getItemMeta();
  }
  
  public adventskalender_ItemManager(Material mat, int amount) {
    this.item = new ItemStack(mat, amount, (short)0);
    this.meta = this.item.getItemMeta();
  }
  
  public adventskalender_ItemManager(Material mat) {
    this.item = new ItemStack(mat, 1, (short)0);
    this.meta = this.item.getItemMeta();
  }
  
  public adventskalender_ItemManager setAmount(int value) {
    this.item.setAmount(value);
    return this;
  }
  
  public adventskalender_ItemManager setNoName() {
    this.meta.setDisplayName(" ");
    return this;
  }
  
  public adventskalender_ItemManager setGlow() {
    this.meta.addEnchant(Enchantment.DURABILITY, 1, true);
    this.meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
    return this;
  }
  
  public adventskalender_ItemManager setData(short data) {
    this.item.setDurability(data);
    return this;
  }
  
  public adventskalender_ItemManager addLoreLine(String line) {
    this.lore.add(line);
    return this;
  }
  
  public adventskalender_ItemManager addLoreArray(String[] lines) {
    for (int x = 0; x < lines.length; x++)
      this.lore.add(lines[x]); 
    return this;
  }
  
  public adventskalender_ItemManager addLoreAll(List<String> lines) {
    this.lore.addAll(lines);
    return this;
  }
  
  public adventskalender_ItemManager setDisplayName(String name) {
    this.meta.setDisplayName(name);
    return this;
  }
  
  public adventskalender_ItemManager setSkullOwner(String owner) {
    ((SkullMeta)this.meta).setOwner(owner);
    return this;
  }
  
  public adventskalender_ItemManager setColor(Color c) {
    ((LeatherArmorMeta)this.meta).setColor(c);
    return this;
  }
  
  public adventskalender_ItemManager setBannerColor(DyeColor c) {
    ((BannerMeta)this.meta).setBaseColor(c);
    return this;
  }
  
  public adventskalender_ItemManager setUnbreakable(boolean value) {
    this.meta.spigot().setUnbreakable(value);
    return this;
  }
  
  public adventskalender_ItemManager addEnchantment(Enchantment ench, int lvl) {
    this.meta.addEnchant(ench, lvl, true);
    return this;
  }
  
  public adventskalender_ItemManager addItemFlag(ItemFlag flag) {
    this.meta.addItemFlags(new ItemFlag[] { flag });
    return this;
  }
  
  public adventskalender_ItemManager addLeatherColor(Color color) {
    ((LeatherArmorMeta)this.meta).setColor(color);
    return this;
  }
  
  public ItemStack build() {
    if (!this.lore.isEmpty())
      this.meta.setLore(this.lore); 
    this.item.setItemMeta(this.meta);
    return this.item;
  }
}