package top.test.dew.loottables;

import com.google.common.eventbus.DeadEvent;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.Plugin;

import java.util.Random;

public class Bossspider implements Listener{
    @EventHandler
    public static void bosspipder (EntityDeathEvent event) {
        var entity = event.getEntity();
        var player = entity.getKiller();
        assert player != null;
        player.sendMessage("你已经击杀了怪物");
    }
}