/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weatherservice;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeTrue;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import weathermodel.CurrentWeatherData;
import weathermodel.ForecastData;
import weathermodel.WeatherForecastResult;
import weathermodel.WeatherSearchResult;


/**
 * Test for OpenWeatherMap API calling.
 * @author yudai
 */
public class OpenWeatherClientTest {
  private OpenWeatherClient client;

  public OpenWeatherClientTest() {
  }

  @BeforeClass
  public static void setUpClass() {

  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
    client = new OpenWeatherClient("1410697d3b7d76e4d1a16c890195cc57");
    assumeTrue("API service is not available.", isConnectedToApi());
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of getForecast method, of class OpenWeatherClient.
   */
  @Test
  public void testGetForecast() {
    try {
      WeatherForecastResult forecastResult = client.getForecast(1642911);
      assertNotNull(forecastResult.getStatusCode());
      assertNotNull(forecastResult.getMessage());
      if (forecastResult.getStatusCode() >= 200 && forecastResult.getStatusCode() < 300) {
        assertNotNull(forecastResult.getCityId());
        assertNotNull(forecastResult.getCityName());
        assertNotNull(forecastResult.getCityCountry());
        ArrayList<ForecastData> forecastList = forecastResult.getForecastList();
        for (ForecastData fd : forecastList) {
          assertNotNull(fd.getDateTime());
          assertNotNull(fd.getDateTimeText());
          assertNotNull(fd.getTemp());
          assertNotNull(fd.getTempMax());
          assertNotNull(fd.getTempMin());
          assertNotNull(fd.getHumidity());
          assertNotNull(fd.getWeatherId());
          assertNotNull(fd.getWeatherMain());
          assertNotNull(fd.getWeatherDetails());
          assertNotNull(fd.getWeatherIcon());
          assertNotNull(fd.getWindSpeed());
          assertNotNull(fd.getWindDeg());
          assertNotNull(fd.getCloudiness());
          assertNotNull(fd.getSnow());
          assertNotNull(fd.getRain());
        }
      } else {
        assertNotNull(forecastResult.getMessage());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Test of getSearch method, of class OpenWeatherClient.
   */
  @Test
  public void testGetSearch() {
    try {
      WeatherSearchResult wsr = client.getSearch("London");
      assertNotNull(wsr.getStatusCode());
      assertNotNull(wsr.getMessage());
      if (wsr.getStatusCode() >= 200 && wsr.getStatusCode() < 300) {
        ArrayList<CurrentWeatherData> currentWeatherData = wsr.getCityWeatherSearchResult();
        for (int i = 0; i < currentWeatherData.size(); i++) {
          CurrentWeatherData curr = currentWeatherData.get(i);
          assertNotNull(curr.getLat());
          assertNotNull(curr.getLon());
          assertNotNull(curr.getCityId());
          assertNotNull(curr.getLat());
          assertNotNull(curr.getLon());
          assertNotNull(curr.getCityId());
          assertNotNull(curr.getCityName());
          assertNotNull(curr.getCityCountry());
          assertNotNull(curr.getWeatherId());
          assertNotNull(curr.getWeatherMain());
          assertNotNull(curr.getWeatherDetails());
          assertNotNull(curr.getWeatherIcon());
          assertNotNull(curr.getTemp());
          assertNotNull(curr.getTemp());
          assertNotNull(curr.getTempMax());
          assertNotNull(curr.getTempMin());
          assertNotNull(curr.getHumidity());
          assertNotNull(curr.getCloudiness());
          assertNotNull(curr.getRain());
          assertNotNull(curr.getSnow());
          assertNotNull(curr.getWindSpeed());
          assertNotNull(curr.getWindDeg());
        }
      } else {
        assertNotNull(wsr.getMessage());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private boolean isConnectedToApi() {
    try {
      final URL url = new URL("https://api.openweathermap.org");
      final URLConnection conn = url.openConnection();
      conn.connect();
      conn.getInputStream().close();
      return true;
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      return false;
    }
  }
}
