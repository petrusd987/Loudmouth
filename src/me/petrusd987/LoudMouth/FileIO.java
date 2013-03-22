/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.petrusd987.LoudMouth;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author petrusd987
 */
public class FileIO {
    public static void copyFile(File input, File output){
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(input)));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String line = null;
        
        try {
            while((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void copyStreamToFile(InputStream input, File output){
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(input));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String line = null;
        
        try {
            while((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line + "\n");
            }
            
            bufferedWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<String> getLinesFromFile(File input){
        ArrayList<String> arrayList = new ArrayList<String>();
         BufferedReader bufferedReader = null;
        
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(input)));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String line = null;
        
        try {
            while((line = bufferedReader.readLine()) != null){
                arrayList.add(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arrayList;
    }
}
