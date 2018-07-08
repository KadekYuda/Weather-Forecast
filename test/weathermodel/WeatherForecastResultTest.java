/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weathermodel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

/**
 * Testing for WeatherForecastResult data
 * @author yudai
 */
public class WeatherForecastResultTest {
  private JSONObject json;
  private WeatherForecastResult wfr;

  public static final String COUNTRY_VAL = "Indonesia";
  public static final long CITY_ID_VAL = 1642911;
  public static final String CITY_NAME_VAL = "Jakarta";

  @Before
  public void setUp() {
    json = createSampleWeatherForecastResultData();
    wfr = new WeatherForecastResult(json);
  }

  /**
   * Test of getForecastList method, of class WeatherForecastResult.
   */
  @Test
  public void testGetForecastList() {
    assertNotNull(wfr.getForecastList());
  }

  /**
   * Test of getCityName method, of class WeatherForecastResult.
   */
  @Test
  public void testGetCityName() {
    assertEquals(CITY_NAME_VAL, wfr.getCityName());
  }

  /**
   * Test of getCityCountry method, of class WeatherForecastResult.
   */
  @Test
  public void testGetCityCountry() {
    assertEquals(COUNTRY_VAL, wfr.getCityCountry());
  }

  /**
   * Test of getCityId method, of class WeatherForecastResult.
   */
  @Test
  public void testGetCityId() {
    assertEquals(CITY_ID_VAL, wfr.getCityId());
  }

  /**
   * Generate sample Weather Forecast Result.
   * @return
   */
  public JSONObject createSampleWeatherForecastResultData() {
    try {
      JSONObject json = new JSONObject();
      JSONObject city = new JSONObject();
      json.put("cod", 200);
      json.put("message", "OK");
      city.put("id", CITY_ID_VAL);
      city.put("country", COUNTRY_VAL);
      city.put("name", CITY_NAME_VAL);
      json.put("city", city);
      JSONArray forecastList = new JSONArray();
      forecastList.put(ForecastDataTest.createSampleForecastData());
      json.put("list", forecastList);
      return json;
    } catch (JSONException ex) {
      return null;
    }
  }
}
