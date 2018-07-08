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
 * Test for Response model data.
 * @author yudai
 */
public class ResponseTest {
  private JSONObject json;
  private Response response;
  public static final int COD_VAL = 200;
  public static final String MSG_VAL = "OK";

  @Before
  public void setUp() {
    json = createSampleResponseJsonData();
    response = new Response(json);
  }

  /**
   * Test of getStatusCode method, of class Response.
   */
  @Test
  public void testGetStatusCode() {
    assertEquals(COD_VAL, response.getStatusCode());
  }

  /**
   * Test of getMessage method, of class Response.
   */
  @Test
  public void testGetMessage() {
    assertEquals(MSG_VAL, response.getMessage());
  }

  /**
   * Create sample Response data.
   * @return Response JSON data
   */
  public static JSONObject createSampleResponseJsonData() {
    try {
      JSONObject json = new JSONObject();
      json.put("cod", COD_VAL);
      json.put("temp_max", MSG_VAL);
      return json;
    } catch (JSONException ex) {
      return null;
    }
  }

}
