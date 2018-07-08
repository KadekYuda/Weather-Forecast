/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weathermodel;

import static org.junit.Assert.assertEquals;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

/**
 * Test unit for Weather Data.
 * @author yudai
 */
public class WeatherTest {
  private JSONObject json;
  private Weather weather;
  public static final int ID_VAL = 721;
  public static final String MAIN_VAL = "Haze";
  public static final String DESCRIPTION_VAL = "haze";
  public static final String ICON_VAL = "50d";

  @Before
  public void setUp() {
    json = createSampleWeatherJsonData();
    weather = new Weather(json);
  }

  /**
   * Test of getId method, of class Weather.
   */
  @Test
  public void testGetId() {
    assertEquals(ID_VAL, weather.getId());
  }

  /**
   * Test of getMain method, of class Weather.
   */
  @Test
  public void testGetMain() {
    assertEquals(MAIN_VAL, weather.getMain());
  }

  /**
   * Test of getDetails method, of class Weather.
   */
  @Test
  public void testGetDetails() {
    assertEquals(DESCRIPTION_VAL, weather.getDetails());
  }

  /**
   * Test of getIcon method, of class Weather.
   */
  @Test
  public void testGetIcon() {
    assertEquals(ICON_VAL, weather.getIcon());
  }

  /**
   * Generate sample Weather JSON data.
   * @return Weather JSON data
   */
  public static JSONObject createSampleWeatherJsonData() {
    try {
      JSONObject json = new JSONObject();
      json.put("id", ID_VAL);
      json.put("main", MAIN_VAL);
      json.put("description", DESCRIPTION_VAL);
      json.put("icon", ICON_VAL);
      return json;
    } catch (JSONException ex) {
      return null;
    }
  }
}
