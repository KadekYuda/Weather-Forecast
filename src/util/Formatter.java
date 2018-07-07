/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

/**
 * String formatting utilities for displaying text on GUI. 
 * @author yudai
 */
public class Formatter {
  public static String toDegree(String str) {
    return str + Character.toString((char)0x00b0);
  }
  
  public static String toCelcius(String str) {   
    return str + " " + Character.toString((char)0x00b0) + "C";
  }
  
  public static String toPercent(String str) {
    return str + " %";
  }
  
  /**
   * Capitalize all words first letter.
   * @param str input sentence/phrase
   * @return capitalized sentence/phrase
   */
  public static String capitalizeFully(String str) {
    String result = "";
    String[] words = str.split("\\s");
    for (int i = 0; i < words.length; i++) {
      if (i + 1 < words.length) {
        result += (capitalize(words[i]) + " ");
      } else {
        result += capitalize(words[i]);
      }
    }
    return result;
  }
  
  /**
   * Capitalize a word first letter.
   * @param str input word
   * @return capitalized word
   */
  public static String capitalize(String str) {
    if (str.length() == 0) {
      return str;
    } else {
      return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
  }
  
  public static String toMps(String str) {
    return str + " m/s";
  }
  
  public static String toPng(String str) {
    return str + ".png";
  }
  
  public static String getCityCountry(String city, String country) {
    return city + ", " + country;
  }
}
