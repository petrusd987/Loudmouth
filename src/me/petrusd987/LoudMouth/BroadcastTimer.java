/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.petrusd987.LoudMouth;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.Bukkit;

/**
 *
 * @author petrusd987
 */
public class BroadcastTimer implements Runnable{
    public int broadcastInterval = 60;
    public int broadcastMethod = Config.BROADCAST_SEQUENTIAL;
    private Thread broadcastThread = null;
    private int messageCount = 0;
    
    public void start(){
     start(broadcastInterval);
    }
    
    public void start(int interval){
        this.broadcastInterval = interval;
        
        if(broadcastThread == null){
            broadcastThread = new Thread(this);
            broadcastThread.start();
        }
        
    }
    
    public void stop(){
        if(broadcastThread != null){
            broadcastThread.stop();
            broadcastThread = null;
        }
        
    }
    public void run() {
        while(true){
            threadWait(broadcastInterval*1000);
            Bukkit.broadcastMessage(Config.messages.get(messageCount));
            generateNewMessageCount();
        }
    }
    
    private void generateNewMessageCount(){
        if(broadcastMethod == Config.BROADCAST_SEQUENTIAL){
            if(messageCount == Config.messages.size()-1){
                messageCount = 0;
            }else{
                messageCount++;
            }
        }
    }
    
    public synchronized void threadWait(long time){
        try {   
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(BroadcastTimer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
