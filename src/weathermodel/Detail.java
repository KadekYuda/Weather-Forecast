package weathermodel;

import org.json.JSONObject;

/**
 * Information about temperature and humidity.
 * @author yudai
 */
public class Detail {
  private static final String TEMP = "temp";
  private static final String TEMP_MIN = "temp_min";
  private static final String TEMP_MAX = "temp_max";
  private static final String HUMIDITY = "humidity";

  private double temp;
  private double tempMin;
  private double tempMax;
  private int humidity;

  /**
   * Creates Detail data from JSON data from OpenWeatherClient.
   * @param json JSON data from Open Weather Map
   */
  public Detail(JSONObject json) {
    temp = json.optDouble(TEMP, Double.NaN);
    tempMin = json.optDouble(TEMP_MIN, Double.NaN);
    tempMax = json.optDouble(TEMP_MAX, Double.NaN);
    humidity = json.optInt(HUMIDITY, Integer.MIN_VALUE);
  }

  public double getTemp() {
    return temp;
  }

  public double getTempMin() {
    return tempMin;
  }

  public double getTempMax() {
    return tempMax;
  }

  public int getHumidity() {
    return humidity;
  }
}