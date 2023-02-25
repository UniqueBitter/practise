package top.test.dew;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {

    @EventHandler
    public void playerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Location location = event.getPlayer().getLocation();
        if (!(player.getName().equals("Unique_Bitter"))) {
            return;
        }
        event.setJoinMessage("§e啊哈哈哈哈哈UB来咯！");
    }
}
