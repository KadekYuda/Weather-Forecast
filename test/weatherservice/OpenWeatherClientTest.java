/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherservice;

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
 *
 * @author yudai
 */
public class OpenWeatherClientTest {
  
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
      OpenWeatherClient wfs = new OpenWeatherClient("1410697d3b7d76e4d1a16c890195cc57");
      WeatherForecastResult wfr = wfs.getForecast(1642911);
      System.out.println("Status Code: " + wfr.getStatusCode());
      System.out.println("Message: " + wfr.getMessage());
      if (wfr.getStatusCode() >= 200 && wfr.getStatusCode() < 300) {
        System.out.println("City ID: " + wfr.getCityId());
        System.out.println("City Name: " + wfr.getCityName());
        System.out.println("Country: " + wfr.getCityCountry());
        System.out.println();
        ArrayList<ForecastData> forecastList = wfr.getForecastList();
        for (ForecastData fd : forecastList) {
          System.out.println("Date Time in Second: " + fd.getDateTime());
          System.out.println("Date Time in Text: " + fd.getDateTimeText());
          System.out.println("Temperature: " + fd.getTemp());
          System.out.println("Maximum Temperature: " + fd.getTempMax());
          System.out.println("Minimum Temperature: " + fd.getTempMin());
          System.out.println("Humidity: " + fd.getHumidity());
          System.out.println("Weather ID: " + fd.getWeatherId());
          System.out.println("Weather: " + fd.getWeatherMain());
          System.out.println("Weather Details: " + fd.getWeatherDetails());
          System.out.println("Weather Icon: " + fd.getWeatherIcon());
          System.out.println("Wind Speed: " + fd.getWindSpeed());
          System.out.println("Wind Degree: " + fd.getWindDeg());
          System.out.println("Cloudiness: " + fd.getCloudiness());
          System.out.println("Snow Volume: " + fd.getSnow());
          System.out.println("Rain Volume: " + fd.getRain());
          System.out.println();
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Test of getSearch method, of class OpenWeatherClient.
   */
  @Test
  public void testGetSearch() throws Exception {
    try {
      OpenWeatherClient wfs = new OpenWeatherClient("1410697d3b7d76e4d1a16c890195cc57");
      WeatherSearchResult wsr = wfs.getSearch("London");
      System.out.println("Status Code: " + wsr.getStatusCode());
      System.out.println("Message: " + wsr.getMessage());
      ArrayList<CurrentWeatherData> currentWeatherData = wsr.getCityWeatherSearchResult();
      for (int i = 0; i < currentWeatherData.size(); i++) {
        CurrentWeatherData curr = currentWeatherData.get(i);
        System.out.println(curr.getLat());
        System.out.println(curr.getLon());
        System.out.println(curr.getCityId());
        System.out.println(curr.getCityName());
        System.out.println(curr.getCityCountry());
        System.out.println(curr.getWeatherId());
        System.out.println(curr.getWeatherMain());
        System.out.println(curr.getWeatherDetails());
        System.out.println(curr.getWeatherIcon());
        System.out.println(curr.getTemp());
        System.out.println(curr.getTemp());
        System.out.println(curr.getTempMax());
        System.out.println(curr.getTempMin());
        System.out.println(curr.getHumidity());
        System.out.println(curr.getCloudiness());
        System.out.println(curr.getRain());
        System.out.println(curr.getSnow());
        System.out.println(curr.getWindSpeed());
        System.out.println(curr.getWindDeg());
        System.out.println();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
}
