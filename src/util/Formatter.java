/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author yudai
 */
public class Formatter {
  public final static String DEGREE  = "\u00b0";
  
  public static String toDegree(String str) {
    return str+DEGREE;
  }
  
  public static String toCelcius(String str) {   
     return str+" "+DEGREE+"C";
  }
  
  public static String toPercent(String str) {
    return str+" %";
  }
  
  public static String capitalizeFully(String str) {
    String result = "";
    String[] words = str.split("\\s");
    for (int i = 0; i < words.length; i++) {
      if (i+1 < words.length) {
        result += (capitalize(words[i]) + " ");
      } else {
        result += capitalize(words[i]);
      }
    }
    return result;
  }
  
  public static String capitalize(String str) {
    if (str.length() == 0) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
  }
  
  public static String toMPS(String str) {
    return str+" m/s";
  }
}
