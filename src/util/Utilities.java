/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * Utilities to provide little helper for images and values.
 * @author yudai
 */
public class Utilities {
  /**
   * List of wind directions in compass.
   */
  private static String [] directions = {"North", 
                                         "North-West", 
                                         "West", 
                                         "South-West", 
                                         "South", 
                                         "South-East", 
                                         "East", 
                                         "North-East" };
  
  /**
   * Get image icon at specified size.
   * @param filePath file path of image
   * @param width desired image icon width
   * @param height desired image icon height
   * @return Image Icon ready to be used in JComponent
   */
  public static ImageIcon getImageIcon(String filePath, int width, int height) {
    ImageIcon icon = new ImageIcon(filePath);
    Image resizedIcon = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
    icon.setImage(resizedIcon);
    return icon;
  }
  
  /**
   * Convert a degree value to compass direction.
   * @param deg degree value, ranged from 0 - 360. Could be NaN.
   * @return wind direction or "N / A" if degree value is NaN.
   */
  public static String convertToCompass(double deg) {
    if (Double.compare(deg, Double.NaN) == 0) {
      return "N / A";
    } else {
      return directions[(int) Math.round(((deg %= 360) < 0 ? deg + 360 : deg) / 45) % 8];
    }
  }
}
