package com.aguela.Principal;

import com.aguela.Eventos.Muerte;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class principal extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registro_de_Eventos(){
        Bukkit.getPluginManager().registerEvents(new Muerte(),this);
    }
}
