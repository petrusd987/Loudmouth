/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.petrusd987.LoudMouth;

import java.util.ArrayList;

/**
 *
 * @author Petrusd987
 */
public class Config {
    public static final String CONFIG_FOLDER = "./plugins/LoudMouth/";
    public static final String CONFIG_FILE = "config.yml";
    
    public static int Message_Generation_Method = 0;
    
    public static ArrayList<String> messages = null;
    
    //Broadcasting Methods
          
    public static final int BROADCAST_SEQUENTIAL = 0;
    public static final int BROADCAST_RANDOM = 1;
}
