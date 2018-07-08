/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weathermodel;

import static org.junit.Assert.assertEquals;
import static weathermodel.ForecastDataTest.CLOUDINESS_VAL;
import static weathermodel.ForecastDataTest.DT_TXT_VAL;
import static weathermodel.ForecastDataTest.DT_VAL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for Current Weather Data.
 * @author yudai
 */
public class CurrentWeatherDataTest {
  private CurrentWeatherData data;
  private JSONObject json;
  public static final String COUNTRY_VAL = "Indonesia";
  public static final int CITY_ID_VAL = 1642911;
  public static final String CITY_NAME_VAL = "Jakarta";
  public static final double LAT_VAL = -6.1754;
  public static final double LON_VAL = 106.8272;
  public static final double DELTA = 1e-15;

  @Before
  public void setUp() {
    json = createSampleCurrentWeatherData();
    data = new CurrentWeatherData(json);
  }

  /**
   * Test of getLat method, of class CurrentWeatherData.
   */
  @Test
  public void testGetLat() {
    assertEquals(LAT_VAL, data.getLat(), DELTA);
  }

  /**
   * Test of getLon method, of class CurrentWeatherData.
   */
  @Test
  public void testGetLon() {
    assertEquals(LON_VAL, data.getLon(), DELTA);
  }

  /**
   * Test of getCloudiness method, of class CurrentWeatherData.
   */
  @Test
  public void testGetCloudiness() {
    assertEquals(CLOUDINESS_VAL, data.getCloudiness());
  }

  /**
   * Test of getCityId method, of class CurrentWeatherData.
   */
  @Test
  public void testGetCityId() {
    assertEquals(CITY_ID_VAL, data.getCityId());
  }

  /**
   * Test of getCityName method, of class CurrentWeatherData.
   */
  @Test
  public void testGetCityName() {
    assertEquals(CITY_NAME_VAL, data.getCityName());
  }

  /**
   * Test of getCityCountry method, of class CurrentWeatherData.
   */
  @Test
  public void testGetCityCountry() {
    assertEquals(COUNTRY_VAL, data.getCityCountry());
  }

  /**
   * Test of getTemp method, of class CurrentWeatherData.
   */
  @Test
  public void testGetTemp() {
    assertEquals(DetailTest.TEMP_VAL, data.getTemp(), DELTA);
  }

  /**
   * Test of getTempMin method, of class CurrentWeatherData.
   */
  @Test
  public void testGetTempMin() {
    assertEquals(DetailTest.MIN_TEMP_VAL, data.getTempMin(), DELTA);
  }

  /**
   * Test of getTempMax method, of class CurrentWeatherData.
   */
  @Test
  public void testGetTempMax() {
    assertEquals(DetailTest.MAX_TEMP_VAL, data.getTempMax(), DELTA);
  }

  /**
   * Test of getHumidity method, of class CurrentWeatherData.
   */
  @Test
  public void testGetHumidity() {
    assertEquals(DetailTest.HUMIDITY_VAL, data.getHumidity());
  }

  /**
   * Test of getWeatherId method, of class CurrentWeatherData.
   */
  @Test
  public void testGetWeatherId() {
    assertEquals(WeatherTest.ID_VAL, data.getWeatherId());
  }

  /**
   * Test of getWeatherMain method, of class CurrentWeatherData.
   */
  @Test
  public void testGetWeatherMain() {
    assertEquals(WeatherTest.MAIN_VAL, data.getWeatherMain());
  }

  /**
   * Test of getWeatherDetails method, of class CurrentWeatherData.
   */
  @Test
  public void testGetWeatherDetails() {
    assertEquals(WeatherTest.DESCRIPTION_VAL, data.getWeatherDetails());
  }

  /**
   * Test of getWeatherIcon method, of class CurrentWeatherData.
   */
  @Test
  public void testGetWeatherIcon() {
    assertEquals(WeatherTest.ICON_VAL, data.getWeatherIcon());
  }

  /**
   * Test of getWindDeg method, of class CurrentWeatherData.
   */
  @Test
  public void testGetWindDeg() {
    assertEquals(WindTest.DEG_VAL, data.getWindDeg(), DELTA);
  }

  /**
   * Test of getWindSpeed method, of class CurrentWeatherData.
   */
  @Test
  public void testGetWindSpeed() {
    assertEquals(WindTest.SPEED_VAL, data.getWindSpeed(), DELTA);
  }

  /**
   * Generate a sample JSONObject of Current Weather Data.
   * @return JSON of Current Weather Data
   */
  public static JSONObject createSampleCurrentWeatherData() {
    try {
      JSONObject json = new JSONObject();

      JSONObject coor = new JSONObject();
      coor.put("lat",LAT_VAL);
      coor.put("lon", LON_VAL);
      json.put("coord",coor);

      JSONObject sys = new JSONObject();
      sys.put("country", COUNTRY_VAL);
      json.put("sys", sys);

      json.put("id", CITY_ID_VAL);
      json.put("name", CITY_NAME_VAL);
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

  /*
        {
            "id": 1642911,
            "name": "Jakarta",
            "coord": {
                "lat": -6.1754,
                "lon": 106.8272
            },
            "main": {
                "temp": 28.61,
                "pressure": 1009,
                "humidity": 69,
                "temp_min": 28,
                "temp_max": 29
            },
            "dt": 1531054800,
            "wind": {
                "speed": 1
            },
            "sys": {
                "country": "ID"
            },
            "rain": null,
            "snow": null,
            "clouds": {
                "all": 20
            },
            "weather": [
                {
                    "id": 721,
                    "main": "Haze",
                    "description": "haze",
                    "icon": "50n"
                }
            ]
        }
  */
}
