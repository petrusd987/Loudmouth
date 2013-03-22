/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.petrusd987.LoudMouth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author petrusd987
 */
public class FileIO {
    public void copyFile(File input, File output){
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
                
        try {
            inputStream = new FileInputStream(input);
            outputStream = new FileOutputStream(output);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
}
