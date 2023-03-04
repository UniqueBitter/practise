package top.test.dew.loottables;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import top.test.dew.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LootManager {


    public static HashMap<String, LootData> lootData = new HashMap<>();

    public static void read() {
        FileConfiguration config = Main.plugin.getConfig();
        for (String key : config.getKeys(false)) {
            String display = config.getString(key + ".display");
            ArrayList<DropData> dropData = new ArrayList<>();
            ConfigurationSection configurationSection = config.getConfigurationSection(key + ".drop");
            if (configurationSection == null) {
                continue;
            }
            for (String configurationSectionKey : configurationSection.getKeys(false)) {
                int weight = configurationSection.getInt(configurationSectionKey + ".weight");
                HashMap<String, Integer> items = new HashMap<>();
                for (String item : configurationSection.getStringList(configurationSectionKey + ".items")) {
                    String[] info = item.split(" ");
                    String name = info[0];
                    int amount = Integer.parseInt(info[1]);
                    items.put(name, amount);
                }
                List<String> stringList = configurationSection.getStringList(configurationSectionKey + ".message");
                dropData.add(new DropData(weight, items, stringList));

            }
            lootData.put(display, new LootData(key, display, dropData));
        }
    }


}
