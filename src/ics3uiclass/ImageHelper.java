/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3uiclass;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Hadida
 */
public class ImageHelper {
    
    public static BufferedImage loadimage(String name){
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(name));
        } catch (IOException ex) {
            Logger.getLogger(ImageHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return img;
    }
    
}
