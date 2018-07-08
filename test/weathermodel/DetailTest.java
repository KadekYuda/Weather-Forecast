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
 * Test for Detail model Data.
 * @author yudai
 */
public class DetailTest {
  private JSONObject json;
  private Detail detail;
  public static final double TEMP_VAL = 30.1;
  public static final double MAX_TEMP_VAL = 31;
  public static final double MIN_TEMP_VAL = 29;
  public static final int HUMIDITY_VAL = 62;
  public static final double DELTA = 1e-15;

  public DetailTest() {
  }

  @Before
  public void setUp() {
    json = createSampleDetailJsonData();
    detail = new Detail(json);
  }

  /**
   * Test of getTemp method, of class Detail.
   */
  @Test
  public void testGetTemp() {
    assertEquals(TEMP_VAL, detail.getTemp(), DELTA);
  }

  /**
   * Test of getTempMin method, of class Detail.
   */
  @Test
  public void testGetTempMin() {
    assertEquals(MIN_TEMP_VAL, detail.getTempMin(), DELTA);
  }

  /**
   * Test of getTempMax method, of class Detail.
   */
  @Test
  public void testGetTempMax() {
    assertEquals(MAX_TEMP_VAL, detail.getTempMax(), DELTA);
  }

  /**
   * Test of getHumidity method, of class Detail.
   */
  @Test
  public void testGetHumidity() {
    assertEquals(HUMIDITY_VAL, detail.getHumidity());
  }

  /**
   * Generate sample Detail JSON data.
   * @return Detail JSON data
   */
  public static JSONObject createSampleDetailJsonData() {
    try {
      JSONObject json = new JSONObject();
      json.put("temp", TEMP_VAL);
      json.put("temp_max", MAX_TEMP_VAL);
      json.put("temp_min", MIN_TEMP_VAL);
      json.put("humidity", HUMIDITY_VAL);
      return json;
    } catch (JSONException ex) {
      return null;
    }
  }
}
