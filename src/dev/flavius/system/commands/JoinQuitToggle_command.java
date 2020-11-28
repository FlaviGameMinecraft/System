package dev.flavius.system.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import dev.flavius.system.Utils.strings.texts;
import net.md_5.bungee.api.chat.TextComponent;

public class JoinQuitToggle_command implements CommandExecutor, Listener{
	
	 static TextComponent join = new TextComponent("");
	
	 static TextComponent quit = new TextComponent("");
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		boolean active = false;
		
		if(sender.hasPermission("System.test")) {
			
			if(sender instanceof Player) {
				
				Player player = (Player)sender;
				
				Player p = player.getPlayer();
				
				if(command.getName().equalsIgnoreCase("joinquittoggle")) {
					
					if(active == false) {
						
						join.setText(texts.Prefix + "§7[§a+§7] §a" + p.getName() + " §7Hat den Server Betreten");
						
						quit.setText(texts.Prefix + "§7[§c-§7] §c" + p.getName() + " §7Hat den Server Verlassen");
						
						p.sendMessage("message an");
						
					}if(active == true) {
						
						join.setText(null);
						
						quit.setText(null);
						
						p.sendMessage("message aus");
						
					}
					
				}
				
			}else {
				
				sender.sendMessage(texts.Prefix + texts.NotAPlayer);
				
			}
			
		}else {
			
			sender.sendMessage(texts.Prefix + texts.NoPerms);
			
		}
		
		return true;
	}
	
	public static String outputJ = TextComponent.toPlainText(join);
	
	public static String outputQ = TextComponent.toPlainText(quit);
	
}
