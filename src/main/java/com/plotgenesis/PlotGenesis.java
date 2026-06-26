package com.plotgenesis;

import org.bukkit.plugin.java.JavaPlugin;

public class PlotGenesis extends JavaPlugin {
    
    private static PlotGenesis instance;
    
    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        getLogger().info("PlotGenesis v" + getDescription().getVersion() + " has been enabled!");
        getLogger().info("Plot generation system ready!");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("PlotGenesis has been disabled!");
    }
    
    public static PlotGenesis getInstance() {
        return instance;
    }
}
