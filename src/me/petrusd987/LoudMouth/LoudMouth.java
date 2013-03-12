package me.petrusd987.LoudMouth;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class LoudMouth extends JavaPlugin{
    @Override
    public void onDisable(){
       PluginInfo("LoudMouth disabled!");
    }
    
    @Override
    public void onEnable(){
        PluginInfo("LoudMouth now enabled!");
        checkFilesExist();
    }
    
    public static void PluginInfo(String message){
        System.out.println("[LoudMouth] " + message);
    }
    
    
    /* The following function checks to ensure that the configuration
     * files and the folder in which they are contained exists*/
    
    public boolean checkFilesExist(){
        boolean fileNotFound = false;
        File folderFile = new File(Config.CONFIG_FOLDER);
        
        //Can't have files without a folder.
        if(!folderFile.exists()){
            fileNotFound = true;
            PluginInfo("Configuration folder not found...Creating");
            folderFile.mkdir();
        }
        
        File configFile = new File(Config.CONFIG_FOLDER + Config.CONFIG_FILE);
        
        if(!configFile.exists()){
            fileNotFound = true;
            PluginInfo("Configuration file not found...Creating");
            try {
                configFile.createNewFile();
            } catch (IOException ex) {
                PluginInfo("Could not create config file!");
            }
        }
        
       
        return fileNotFound;
    }
}
