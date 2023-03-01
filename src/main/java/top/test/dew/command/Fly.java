package top.test.dew.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (label.equalsIgnoreCase("fly")) {
            Player player = (Player) sender;
            if (player.getAllowFlight()) {
                player.setAllowFlight(false);
                sender.sendMessage(ChatColor.RED+ "你已关闭飞行");
            }else {
                player.setAllowFlight(true);
                sender.sendMessage(ChatColor.GREEN+ "你已开启飞行");
            }
            return true;
        }
        return true;
    }
}
