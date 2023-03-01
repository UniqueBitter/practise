package top.test.dew.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class Ubzs implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (label.equalsIgnoreCase("ubzs")) {
            Player player = (Player) sender;
            player.sendMessage("§e你5秒内将运气爆棚！");
            Objects.requireNonNull(player.getScoreboard().getObjective("gailv")).getScore(player).setScore(1);
            Timer timer=new Timer();
            TimerTask task=new TimerTask(){
                public void run(){
                    Objects.requireNonNull(player.getScoreboard().getObjective("gailv")).getScore(player).setScore(0);
                    player.sendMessage("§4你的好运结束了");
                }
            };
            timer.schedule(task,5 * 1000);
            return true;
        }
        return false;
    }
}
