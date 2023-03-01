package top.test.dew;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import top.test.dew.command.Fly;
import top.test.dew.command.Ouhuang;
import top.test.dew.command.Ubzs;
import top.test.dew.loottables.Bossspider;

import java.util.Objects;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§a[UB] 插件已加载");
        //注册自定义事件
//        Bukkit.getPluginManager().registerEvent();
        //注册监听器
        Bukkit.getPluginManager().registerEvents(new Join(), this);
        Bukkit.getPluginManager().registerEvents(new Bossspider(), this);

        Objects.requireNonNull(Bukkit.getPluginCommand("fly")).setExecutor(new Fly());
        Objects.requireNonNull(Bukkit.getPluginCommand("ubzs")).setExecutor(new Ubzs());
        Objects.requireNonNull(Bukkit.getPluginCommand("ouhuang")).setExecutor(new Ouhuang());
    }

}
