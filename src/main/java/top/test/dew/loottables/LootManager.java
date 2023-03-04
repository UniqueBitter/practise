package top.test.dew.loottables;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import top.test.dew.Main;
import top.test.dew.command.UB;
import top.test.dew.config;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LootManager {


    public static HashMap<String, LootData> lootData = new HashMap<>();



    public static void read() {
        FileConfiguration config = Main.plugin.getConfig();
        //config=插件配置文件
        for (String key : config.getKeys(false)) {
            //循环遍历获得key(蜘蛛女王)
            String display = config.getString(key + ".display");
            //display名称(pl.monster.east.Bossspider)
            ArrayList<DropData> dropData = new ArrayList<>();
            //战利品列表dropData
            ConfigurationSection configurationSection = config.getConfigurationSection(key + ".drop");
            if (configurationSection == null) {
                //没有物品结束这次循环
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
                //消息
                dropData.add(new DropData(weight, items, stringList));
            }
            lootData.put(display, new LootData(key, display, dropData));
        }
    }




}
