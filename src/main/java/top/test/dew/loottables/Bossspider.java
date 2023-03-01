package top.test.dew.loottables;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Random;


public class Bossspider implements Listener {
    public Random random = new Random();

    @EventHandler
    public void kingspiderloot(EntityDeathEvent event) {
        var entity = event.getEntity();
        var player = entity.getKiller();
        String deadentity;
        deadentity = "pl.monster.east.Bossspider";
        String key;
        String Message;
        Message = "你破开女王肚子，发现了一把镰刀";
        if (!(entity.getName().equals(deadentity))) {
            return;
        }
        assert player != null;
        var drop = event.getDrops();
        int i = random.nextInt(100)+1;
        if (i < 5) {
            player.sendMessage(Message);
        }
    }
}
