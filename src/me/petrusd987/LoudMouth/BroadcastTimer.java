/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.petrusd987.LoudMouth;

/**
 *
 * @author petrusd987
 */
public class BroadcastTimer implements Runnable{
    public int broadcastInterval = 60;
    
    public void start(){}
    
    public void start(int interval){
        this.broadcastInterval = interval;
    }
    
    public void stop(){
        
    }
    public void run() {
    }
    
}
