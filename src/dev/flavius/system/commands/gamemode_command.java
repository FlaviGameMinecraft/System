package dev.flavius.system.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import dev.flavius.system.Utils.strings.texts;

public class gamemode_command implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		Player p = (Player) sender;
		
		if(command.getName().equalsIgnoreCase("gamemode")) {
			
				if(sender.hasPermission("system.command.gamemode") || (sender.hasPermission("system.pack.admin") || (sender.hasPermission("system.*")))) {
					
					if(args.length == 0) {
						
						sender.sendMessage(texts.Prefix + texts.Usage + "gamemode <Modus> <Spieler>");
						return false;
					}
					
					if(args.length == 1) {
						
						if(sender instanceof Player) {
						
						if(args[0].equalsIgnoreCase("überleben") || args[0].equalsIgnoreCase("survial") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("0")) {
							
							p.setGameMode(GameMode.SURVIVAL);
							
							p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
							
							p.sendMessage(texts.Prefix + "§aDein Spielmodus wurde zum §bÜberlebens Modus §aaktualisiert");
							
						}else if(args[0].equalsIgnoreCase("kreativ") || args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("1")) {
							
							p.setGameMode(GameMode.CREATIVE);
							
							p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
							
							p.sendMessage(texts.Prefix + "§aDein Spielmodus wurde zum §bKreativ Modus §aaktualisiert");
							
						}else if(args[0].equalsIgnoreCase("abenteuer") || args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("2")) {
							
							p.setGameMode(GameMode.ADVENTURE);
							
							p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
							
							p.sendMessage(texts.Prefix + "§aDein Spielmodus wurde zum §bAbenteuer Modus §aaktualisiert");
							
						}else if(args[0].equalsIgnoreCase("zuschauer") || args[0].equalsIgnoreCase("spectator") || args[0].equalsIgnoreCase("spec") || args[0].equalsIgnoreCase("3")) {
							
							p.setGameMode(GameMode.SPECTATOR);
							
							p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
							
							p.sendMessage(texts.Prefix + "§aDein Spielmodus wurde zum §bZuschauer Modus §aaktualisiert");
							
						}else if(!args[0].equalsIgnoreCase("überleben") || !args[0].equalsIgnoreCase("survial") || !args[0].equalsIgnoreCase("s") || !args[0].equalsIgnoreCase("0") || !args[0].equalsIgnoreCase("kreativ") || !args[0].equalsIgnoreCase("creative") || !args[0].equalsIgnoreCase("c") || !args[0].equalsIgnoreCase("1") || !args[0].equalsIgnoreCase("abenteuer") || !args[0].equalsIgnoreCase("adventure") || !args[0].equalsIgnoreCase("a") || !args[0].equalsIgnoreCase("2") || !args[0].equalsIgnoreCase("zuschauer") || !args[0].equalsIgnoreCase("spectator") || !args[0].equalsIgnoreCase("spec") || !args[0].equalsIgnoreCase("3")) {
							
							sender.sendMessage(texts.Prefix + texts.Usage + "gamemode <Modus> <Spieler>");
							return false;
						}
						return false;
						
						}else {
							
							sender.sendMessage(texts.Prefix + texts.NotAPlayer);
							
						}
						
					}
						
					if(args.length == 2){
						
						try {
							
							Player t = Bukkit.getPlayer(args[1]);
							
							if(args[1].equalsIgnoreCase(sender.getName())) {
								
								if(sender instanceof Player) {
								
								if(args[0].equalsIgnoreCase("überleben") || args[0].equalsIgnoreCase("survial") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("0")) {
									
									p.setGameMode(GameMode.SURVIVAL);
									
									p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
									
									p.sendMessage(texts.Prefix + "§aDein Spielmodus wurde zum §bÜberlebens Modus §aaktualisiert");
									
								}else if(args[0].equalsIgnoreCase("kreativ") || args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("1")) {
									
									p.setGameMode(GameMode.CREATIVE);
									
									p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
									
									p.sendMessage(texts.Prefix + "§aDein Spielmodus wurde zum §bKreativ Modus §aaktualisiert");
									
								}else if(args[0].equalsIgnoreCase("abenteuer") || args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("2")) {
									
									p.setGameMode(GameMode.ADVENTURE);
									
									p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
									
									p.sendMessage(texts.Prefix + "§aDein Spielmodus wurde zum §bAbenteuer Modus §aaktualisiert");
									
								}else if(args[0].equalsIgnoreCase("zuschauer") || args[0].equalsIgnoreCase("spectator") || args[0].equalsIgnoreCase("spec") || args[0].equalsIgnoreCase("3")) {
									
									p.setGameMode(GameMode.SPECTATOR);
									
									p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
									
									p.sendMessage(texts.Prefix + "§aDein Spielmodus wurde zum §bZuschauer Modus §aaktualisiert");
									
								}else {
									
									sender.sendMessage(texts.Prefix + texts.Usage + "gamemode <Modus> <Spieler>");
									return false;
								}
								
								}else {
									
									sender.sendMessage(texts.Prefix + texts.NotAPlayer);
									
								}
							
								
						}else if(args[1].equalsIgnoreCase("*")) {
							
							for (Player all : Bukkit.getOnlinePlayers()) {
							
								if(args[0].equalsIgnoreCase("überleben") || args[0].equalsIgnoreCase("survial") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("0")) {
								
								all.setGameMode(GameMode.SURVIVAL);
								
								all.playSound(all.getLocation(), Sound.CLICK, 1, 2);
								
								all.sendMessage(texts.Prefix + "§aDein Spielmodus wurde von §b" + sender.getName() + " §7zum §bÜberlebens Modus §aaktualisiert");
								
								p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
								
								p.sendMessage(texts.Prefix + "§aDer Spielmodus von §4* §7[§e" + Bukkit.getServer().getOnlinePlayers().size() + "§7/§e" + Bukkit.getServer().getMaxPlayers() + "§7] §awurde zum §bÜberlebens Modus §aaktualisiert");
								
							}else if(args[0].equalsIgnoreCase("kreativ") || args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("1")) {
								
								all.setGameMode(GameMode.CREATIVE);
								
								all.playSound(all.getLocation(), Sound.CLICK, 1, 2);
								
								all.sendMessage(texts.Prefix + "§aDein Spielmodus wurde von §b" + sender.getName() + " §7zum §bKreativ Modus §aaktualisiert");

								p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
								
								p.sendMessage(texts.Prefix + "§aDer Spielmodus von §4* §7[§e" + Bukkit.getServer().getOnlinePlayers().size() + "§7/§e" + Bukkit.getServer().getMaxPlayers() + "§7] §awurde zum §bKreativ Modus §aaktualisiert");
							
							}else if(args[0].equalsIgnoreCase("abenteuer") || args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("2")) {
								
								all.setGameMode(GameMode.ADVENTURE);
								
								all.playSound(all.getLocation(), Sound.CLICK, 1, 2);
								
								all.sendMessage(texts.Prefix + "§aDein Spielmodus wurde von §b" + sender.getName() + " §7zum §bAbenteuer Modus §aaktualisiert");

								p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
								
								p.sendMessage(texts.Prefix + "§aDer Spielmodus von §4* §7[§e" + Bukkit.getServer().getOnlinePlayers().size() + "§7/§e" + Bukkit.getServer().getMaxPlayers() + "§7] §awurde zum §bAbenteuer Modus §aaktualisiert");
								
							}else if(args[0].equalsIgnoreCase("zuschauer") || args[0].equalsIgnoreCase("spectator") || args[0].equalsIgnoreCase("spec") || args[0].equalsIgnoreCase("3")) {
								
								all.setGameMode(GameMode.SPECTATOR);
								
								all.playSound(all.getLocation(), Sound.CLICK, 1, 2);
								
								all.sendMessage(texts.Prefix + "§aDein Spielmodus wurde von §b" + sender.getName() + " §7zum §bZuschauer Modus §aaktualisiert");

								p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
								
								p.sendMessage(texts.Prefix + "§aDer Spielmodus von §4* §7[§e" + Bukkit.getServer().getOnlinePlayers().size() + "§7/§e" + Bukkit.getServer().getMaxPlayers() + "§7] §awurde zum §bZuschauer Modus §aaktualisiert");
							
							}else if(!args[0].equalsIgnoreCase("überleben") || !args[0].equalsIgnoreCase("survial") || !args[0].equalsIgnoreCase("s") || !args[0].equalsIgnoreCase("0") || !args[0].equalsIgnoreCase("kreativ") || !args[0].equalsIgnoreCase("creative") || !args[0].equalsIgnoreCase("c") || !args[0].equalsIgnoreCase("1") || !args[0].equalsIgnoreCase("abenteuer") || !args[0].equalsIgnoreCase("adventure") || !args[0].equalsIgnoreCase("a") || !args[0].equalsIgnoreCase("2") || !args[0].equalsIgnoreCase("zuschauer") || !args[0].equalsIgnoreCase("spectator") || !args[0].equalsIgnoreCase("spec") || !args[0].equalsIgnoreCase("3")) {
						
								sender.sendMessage(texts.Prefix + texts.Usage + "gamemode <Modus> <Spieler>");
								return false;
							}
							
							}
								
						}else if(!args[1].equalsIgnoreCase(sender.getName()) || !args[1].equalsIgnoreCase("*")) {
							
							if(sender instanceof Player) {
								
							if(args[0].equalsIgnoreCase("überleben") || args[0].equalsIgnoreCase("survial") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("0")) {
							
								t.setGameMode(GameMode.SURVIVAL);
								
								t.playSound(t.getLocation(), Sound.CLICK, 1, 2);
								
								t.sendMessage(texts.Prefix + "§aDein Spielmodus wurde von §b" + sender.getName() + " §7zum §bÜberlebens Modus §aaktualisiert");
								
								p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
								
								p.sendMessage(texts.Prefix + "§aDer Spielmodus von §b" + t.getName() + " §awurde zum §bÜberlebens Modus §aaktualisiert");
								
							}else if(args[0].equalsIgnoreCase("kreativ") || args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("1")) {
								
								t.setGameMode(GameMode.CREATIVE);
								
								t.playSound(t.getLocation(), Sound.CLICK, 1, 2);
								
								t.sendMessage(texts.Prefix + "§aDein Spielmodus wurde von §b" + sender.getName() + " §7zum §bKreativ Modus §aaktualisiert");

								p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
								
								p.sendMessage(texts.Prefix + "§aDer Spielmodus von §b" + t.getName() + " §awurde zum §bKreativ Modus §aaktualisiert");
							
							}else if(args[0].equalsIgnoreCase("abenteuer") || args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("2")) {
								
								t.setGameMode(GameMode.ADVENTURE);
								
								t.playSound(t.getLocation(), Sound.CLICK, 1, 2);
								
								t.sendMessage(texts.Prefix + "§aDein Spielmodus wurde von §b" + sender.getName() + " §7zum §bAbenteuer Modus §aaktualisiert");

								p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
								
								p.sendMessage(texts.Prefix + "§aDer Spielmodus von §b" + t.getName() + " §awurde zum §bAbenteuer Modus §aaktualisiert");
							}else if(args[0].equalsIgnoreCase("zuschauer") || args[0].equalsIgnoreCase("spectator") || args[0].equalsIgnoreCase("spec") || args[0].equalsIgnoreCase("3")) {
								
								t.setGameMode(GameMode.SPECTATOR);
								
								t.playSound(t.getLocation(), Sound.CLICK, 1, 2);
								
								t.sendMessage(texts.Prefix + "§aDein Spielmodus wurde von §b" + sender.getName() + " §7zum §bZuschauer Modus §aaktualisiert");

								p.playSound(p.getLocation(), Sound.CLICK, 1, 2);
								
								p.sendMessage(texts.Prefix + "§aDer Spielmodus von §b" + t.getName() + " §awurde zum §bZuschauer Modus §aaktualisiert");
								
								
							}else if(!args[0].equalsIgnoreCase("überleben") || args[0].equalsIgnoreCase("survial") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("kreativ") || args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("abenteuer") || args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("zuschauer") || args[0].equalsIgnoreCase("spectator") || args[0].equalsIgnoreCase("spec") || args[0].equalsIgnoreCase("3")) {
						
								sender.sendMessage(texts.Prefix + texts.Usage + "gamemode <Modus> <Spieler>");
								return false;
						
							}else {
								
								sender.sendMessage(texts.Prefix + texts.Usage + "gamemode <Modus> <Spieler>");
								return false;
							}
							
							}else {
								
								sender.sendMessage(texts.Prefix + texts.NotAPlayer);
								
							}
							
						}
							
						}catch (NullPointerException npe) {
							 
							sender.sendMessage(texts.Prefix + "§4Fehler! §cDer Spieler §b" + args[1] + " §cKonnte nicht gefunden werden!");
							
						}
						
					}else {
						
						sender.sendMessage(texts.Prefix + texts.Usage + "gamemode <Modus> <Spieler>");
						return false;
					}
					
						
				}else {
					
					sender.sendMessage(texts.Prefix + texts.NoPerms + "system.command.gamemode");
					
				}
				
		}
		return false;	
	}
}
