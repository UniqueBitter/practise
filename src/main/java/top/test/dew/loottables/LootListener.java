package top.test.dew.loottables;

import github.saukiya.sxitem.SXItem;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Map;
import java.util.Random;


public class LootListener implements Listener {
    public Random random = new Random();

    @EventHandler
    public void onEntityDeathEvent(EntityDeathEvent event) {
        var entity = event.getEntity();
        var player = entity.getKiller();
        if (player == null) {
            return;
        }
        if (entity.customName() == null) {
            return;
        }
        String name = entity.getCustomName();
        LootData lootData = LootManager.lootData.get(name);
        if (lootData == null) {
            return;
        }

        var drop = event.getDrops();
        for (DropData dropData : lootData.drop()) {
            int i = random.nextInt(100);
            if (i < dropData.getWeight()) {
                for (String s : dropData.getMessage()) {
                    player.sendMessage(s.replace("&", "§"));
                }
                for (Map.Entry<String, Integer> stringIntegerEntry : dropData.getItems().entrySet()) {
                    ItemStack item = SXItem.getItemManager().getItem(stringIntegerEntry.getKey(), player);
                    if (item == null || item.getType() == Material.AIR) {
                        continue;
                    }
                    item.setAmount(stringIntegerEntry.getValue());
                    drop.add(item);
                }
            }
        }

    }

}
