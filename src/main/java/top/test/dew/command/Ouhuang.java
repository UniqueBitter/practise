package top.test.dew.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Ouhuang implements CommandExecutor {
    public int n = 1;
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (label.equalsIgnoreCase("ouhuang")) {
            Player player = (Player) sender;
            if (n == 1) {
                Objects.requireNonNull(player.getScoreboard().getObjective("gailv")).getScore(player).setScore(1);
                player.sendMessage("§a你开箱子一定出神器了！");
                n = 2;
            } else {
                Objects.requireNonNull(player.getScoreboard().getObjective("gailv")).getScore(player).setScore(0);
                player.sendMessage("§a你只能看脸了！");
                n = 1;
            }
            return true;
        }
        return false;
    }
}
