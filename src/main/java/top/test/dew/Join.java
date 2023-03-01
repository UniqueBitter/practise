package top.test.dew;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener{
    @EventHandler
    public static void onePlayerJoinEvent (PlayerJoinEvent event) {
        Player player = event.getPlayer();
        switch (player.getName()) {
            case "Unique_Bitter", "Ray_Hughes" -> {
                event.setJoinMessage(null);
            }
        }
}
