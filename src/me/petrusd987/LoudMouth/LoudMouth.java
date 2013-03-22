package me.petrusd987.LoudMouth;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class LoudMouth extends JavaPlugin{
    BroadcastTimer broadcastTimer = null;
    
    @Override
    public void onDisable(){
       PluginInfo("LoudMouth disabled!");
    }
    
    @Override
    public void onEnable(){
        PluginInfo("LoudMouth now enabled!");
       
        checkFilesExist();
        
        broadcastTimer = new BroadcastTimer();
        broadcastTimer.start(getConfig().getInt("Message-Broadcast-Interval"));
    }
    
    public static void PluginInfo(String message){
        System.out.println("[LoudMouth] " + message);
    }
    
    
    /* The following function checks to ensure that the configuration
     * files and the folder in which they are contained exists*/
    
    public void checkFilesExist(){
        //Set up the Config File
        getConfig().options().copyDefaults(true);
        saveConfig();
        
        //Set up the messages file
        File inputMessagesFile = new File(getDataFolder(),"messages.txt");
        File outputMessagesFile = new File(Config.CONFIG_FOLDER + "messages.txt");
    }
}
