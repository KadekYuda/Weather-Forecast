/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weathermodel;

import static org.junit.Assert.assertNotNull;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for Weather Search Result data.
 * @author yudai
 */
public class WeatherSearchResultTest {
  private WeatherSearchResult wsr;
  private JSONObject json;

  @Before
  public void setUp() {
    json = createSampleWeatherSearchResult();
    wsr = new WeatherSearchResult(json);
  }

  /**
   * Test of getCityWeatherSearchResult method, of class WeatherSearchResult.
   */
  @Test
  public void testGetCityWeatherSearchResult() {
    assertNotNull(wsr.getCityWeatherSearchResult());
  }

  /**
   * Generate a sample WeatherSearchResult data.
   * @return Weather Search result data.
   */
  public JSONObject createSampleWeatherSearchResult() {
    try {
      JSONObject json = new JSONObject();
      JSONArray jsonArray =  new JSONArray();
      jsonArray.put(CurrentWeatherDataTest.createSampleCurrentWeatherData());
      json.put("list", jsonArray);
      json.put("count", 1);
      return json;
    } catch (JSONException ex) {
      return null;
    }
  }
}
