package top.test.dew;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§a[UB] 插件已加载");
        //注册自定义事件
//        Bukkit.getPluginManager().registerEvent();
        //注册监听器
        Bukkit.getPluginManager().registerEvents(new Join(), this);
    }

}
