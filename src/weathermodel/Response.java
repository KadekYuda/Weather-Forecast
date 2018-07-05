package weathermodel;

import org.json.JSONObject;

public class Response {
  private int statusCode;
  private String message;

  private static final String COD = "cod";
  private static final String MES = "message";

  /**
   * API Response object containing status code and message from API server.
   * @param json JSON object returned from Open Weather API.
   */
  Response(JSONObject json) {
    statusCode = json.optInt(COD);
    if (statusCode < 200 || statusCode >= 300) {
      message = json.optString(MES);
    } else {
      message = "OK";
    }
  }

  public int getStatusCode() {
    return statusCode;
  }

  public String getMessage() {
    return message;
  }
}
