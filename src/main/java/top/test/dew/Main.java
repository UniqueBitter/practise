package top.test.dew;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import top.test.dew.command.Fly;
import top.test.dew.command.Ouhuang;
import top.test.dew.command.Ubzs;
import top.test.dew.loottables.LootListener;
import top.test.dew.loottables.LootManager;

import java.util.Objects;

public class Main extends JavaPlugin {

    public static JavaPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        saveDefaultConfig();
        Bukkit.getConsoleSender().sendMessage("§a[UB] 插件已加载");
        //注册自定义事件
//        Bukkit.getPluginManager().registerEvent();
        //注册监听器
        Bukkit.getPluginManager().registerEvents(new Join(), this);
        Bukkit.getPluginManager().registerEvents(new LootListener(), this);

        Objects.requireNonNull(Bukkit.getPluginCommand("fly")).setExecutor(new Fly());
        Objects.requireNonNull(Bukkit.getPluginCommand("ubzs")).setExecutor(new Ubzs());
        Objects.requireNonNull(Bukkit.getPluginCommand("ouhuang")).setExecutor(new Ouhuang());


        LootManager.read();
//        var a = getConfig().getKeys(false);
//        for (String s : a) {
//            getConfig().getString(s + ".key");
//        }

    }

}
