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
 * Test for Wind model data.
 * @author yudai
 */
public class WindTest {

  private JSONObject json;
  private Wind wind;
  public static final double SPEED_VAL = 1.23;
  public static final double DEG_VAL = 4.56;
  public static final double DELTA = 1e-15;

  @Before
  public void setUp() {
    json = createSampleWindJsonData();
    wind = new Wind(json);
  }

  /**
   * Test of getDeg method, of class Wind.
   */
  @Test
  public void testGetDeg() {
    assertEquals(DEG_VAL, wind.getDeg(), DELTA);
  }

  /**
   * Test of getSpeed method, of class Wind.
   */
  @Test
  public void testGetSpeed() {
    assertEquals(SPEED_VAL, wind.getSpeed(), DELTA);
  }

  /**
   * Generate sample Wind JSON data.
   * @return Wind JSON data.
   */
  public static JSONObject createSampleWindJsonData() {
    try {
      JSONObject json = new JSONObject();
      json.put("speed", SPEED_VAL);
      json.put("deg", DEG_VAL);
      return json;
    } catch (JSONException ex) {
      return null;
    }
  }
}
