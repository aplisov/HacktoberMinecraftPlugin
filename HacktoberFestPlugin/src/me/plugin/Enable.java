package me.plugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import me.plugin.events.PlayerJoin;
import me.plugin.events.PlayerQuit;
import net.md_5.bungee.api.ChatColor;

public class Enable extends JavaPlugin implements Listener {

	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
		Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);
		Bukkit.getPluginManager().registerEvents(new PlayerQuit(), this);
	}

	public void onDisable() {

	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("command")) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "! " + ChatColor.GREEN
					+ "Congratulations! This is your very first command!");
		}
		return false;
	}

}
