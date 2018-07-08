/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weathermodel;

import static org.junit.Assert.assertEquals;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for Forecast Data Test.
 * @author yudai
 */
public class ForecastDataTest {
  public static final long DT_VAL = 1531062000;
  public static final String DT_TXT_VAL = "2018-07-08 15:00:00";
  public static final int CLOUDINESS_VAL = 32;
  public static final double SNOW_VAL = 32;
  public static final double RAIN_VAL = 32;
  public static final double DELTA = 1e-15;

  private JSONObject json;
  private ForecastData data;

  @Before
  public void setUp() {
    json = createSampleForecastData();
    data = new ForecastData(json);
  }

  /**
   * Test of getDateTime method, of class ForecastData.
   */
  @Test
  public void testGetDateTime() {
    assertEquals(DT_VAL, data.getDateTime());
  }

  /**
   * Test of getDateTimeText method, of class ForecastData.
   */
  @Test
  public void testGetDateTimeText() {
    assertEquals(DT_TXT_VAL, data.getDateTimeText());
  }

  /**
   * Test of getTemp method, of class ForecastData.
   */
  @Test
  public void testGetTemp() {
    assertEquals(DetailTest.TEMP_VAL, data.getTemp(), DELTA);
  }

  /**
   * Test of getTempMin method, of class ForecastData.
   */
  @Test
  public void testGetTempMin() {
    assertEquals(DetailTest.MIN_TEMP_VAL, data.getTempMin(), DELTA);
  }

  /**
   * Test of getTempMax method, of class ForecastData.
   */
  @Test
  public void testGetTempMax() {
    assertEquals(DetailTest.MAX_TEMP_VAL, data.getTempMax(), DELTA);
  }

  /**
   * Test of getHumidity method, of class ForecastData.
   */
  @Test
  public void testGetHumidity() {
    assertEquals(DetailTest.HUMIDITY_VAL, data.getHumidity());
  }

  /**
   * Test of getWeatherId method, of class ForecastData.
   */
  @Test
  public void testGetWeatherId() {
    assertEquals(WeatherTest.ID_VAL, data.getWeatherId());
  }

  /**
   * Test of getWeatherMain method, of class ForecastData.
   */
  @Test
  public void testGetWeatherMain() {
    assertEquals(WeatherTest.MAIN_VAL, data.getWeatherMain());
  }

  /**
   * Test of getWeatherDetails method, of class ForecastData.
   */
  @Test
  public void testGetWeatherDetails() {
    assertEquals(WeatherTest.DESCRIPTION_VAL, data.getWeatherDetails());
  }

  /**
   * Test of getWeatherIcon method, of class ForecastData.
   */
  @Test
  public void testGetWeatherIcon() {
    assertEquals(WeatherTest.ICON_VAL, data.getWeatherIcon());
  }

  /**
   * Test of getWindDeg method, of class ForecastData.
   */
  @Test
  public void testGetWindDeg() {
    assertEquals(WindTest.DEG_VAL, data.getWindDeg(), DELTA);
  }

  /**
   * Test of getWindSpeed method, of class ForecastData.
   */
  @Test
  public void testGetWindSpeed() {
    assertEquals(WindTest.SPEED_VAL, data.getWindSpeed(), DELTA);
  }

  /**
   * Test of getCloudiness method, of class ForecastData.
   */
  @Test
  public void testGetCloudiness() {
    assertEquals(CLOUDINESS_VAL, data.getCloudiness());
  }

  /**
   * Generate sample Forecast Data JSON.
   * @return Forecast Data in JSON;.
   */
  public static JSONObject createSampleForecastData() {
    try {
      JSONObject json = new JSONObject();
      json.put("dt", DT_VAL);
      json.put("dt_txt", DT_TXT_VAL);
      json.put("main", DetailTest.createSampleDetailJsonData());
      JSONArray jsonArray = new JSONArray();
      jsonArray.put(WeatherTest.createSampleWeatherJsonData());
      json.put("weather", jsonArray);
      JSONObject clouds = new JSONObject();
      clouds.put("all", CLOUDINESS_VAL);
      json.put("clouds", clouds);
      json.put("wind", WindTest.createSampleWindJsonData());
      return json;
    } catch (JSONException ex) {
      return null;
    }
  }
}

  /*
          {
            "dt": 1531062000,
            "main": {
                "temp": 299.72,
                "temp_min": 298.667,
                "temp_max": 299.72,
                "pressure": 996.79,
                "sea_level": 1037.87,
                "grnd_level": 996.79,
                "humidity": 77,
                "temp_kf": 1.05
            },
            "weather": [
                {
                    "id": 802,
                    "main": "Clouds",
                    "description": "scattered clouds",
                    "icon": "03d"
                }
            ],
            "clouds": {
                "all": 32
            },
            "wind": {
                "speed": 1.51,
                "deg": 160.501
            },
            "sys": {
                "pod": "d"
            },
            "dt_txt": "2018-07-08 15:00:00"
          }
  */
