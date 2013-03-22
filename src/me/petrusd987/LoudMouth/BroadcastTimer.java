/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.petrusd987.LoudMouth;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author petrusd987
 */
public class BroadcastTimer implements Runnable{
    public int broadcastInterval = 60;
    private Thread broadcastThread = null;
    
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
            LoudMouth.PluginInfo(Integer.toString(this.broadcastInterval));
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
