package me.petrusd987.LoudMouth;

import org.bukkit.plugin.java.JavaPlugin;

public class LoudMouth extends JavaPlugin{
    @Override
    public void onDisable(){
       PluginInfo("LoudMouth disabled!");
    }
    
    @Override
    public void onEnable(){
        PluginInfo("LoudMouth now enabled!");
    }
    
    public static void PluginInfo(String message){
        System.out.println("[LoudMouth] " + message);
    }
}
