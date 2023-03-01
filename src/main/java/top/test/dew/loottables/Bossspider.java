package top.test.dew.loottables;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

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
        Message = "你破开女王肚子，发现了一块牛排";
        if (!(entity.getName().equals(deadentity))) {
            return;
        }
        assert player != null;
        var drop = event.getDrops();
        int i = random.nextInt(100)+1;
        if (i < 50) {
            player.sendMessage(Message);
            drop.add(new ItemStack(Material.COOKED_BEEF));
        }
    }
}
