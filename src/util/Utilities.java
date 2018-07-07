/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author yudai
 */
public class Utilities {
  private static String [] directions = {"North", 
                                         "North-West", 
                                         "West", 
                                         "South-West", 
                                         "South", 
                                         "South-East", 
                                         "East", 
                                         "North-East" };
  
  public static ImageIcon getImageIcon(String filePath, int width, int height) {
    ImageIcon icon = new ImageIcon(filePath);
    Image resizedIcon = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
    icon.setImage(resizedIcon);
    return icon;
  }
  
  public static String convertToCompas(double deg) {
    if (Double.compare(deg, Double.NaN) == 0) {
      return "N / A";
    } else {
       return directions[(int) Math.round(((deg %= 360) < 0 ? deg + 360 : deg) / 45) % 8];
    }
  }
}
