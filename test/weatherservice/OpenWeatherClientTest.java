/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherservice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import weathermodel.WeatherForecastResult;
import weathermodel.WeatherSearchResult;

import static org.junit.Assert.*;

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
    System.out.println("getForecast");
    int id = 0;
    OpenWeatherClient instance = null;
    WeatherForecastResult expResult = null;
    WeatherForecastResult result = instance.getForecast(id);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getSearch method, of class OpenWeatherClient.
   */
  @Test
  public void testGetSearch() throws Exception {
    System.out.println("getSearch");
    String location = "";
    OpenWeatherClient instance = null;
    WeatherSearchResult expResult = null;
    WeatherSearchResult result = instance.getSearch(location);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
