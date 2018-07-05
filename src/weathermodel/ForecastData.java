package weathermodel;

import org.json.JSONObject;

public class ForecastData {
  private static final String DT_TEXT = "dt_txt";
  private static final String DT_SEC = "dt";
  private static final String DETAIL = "main";
  private static final String WEATHER = "weather";
  private static final String CLOUDS = "clouds";
  private static final String WIND = "wind";
  private static final String RAIN = "rain";
  private static final String SNOW = "snow";
  private static final String CLD_ALL = "all";
  private static final String VOL = "3h";

  private long dateTime;
  private String dateTimeText;
  private Detail detail;
  private Weather weather;
  private Wind wind;
  private int cloudiness;
  private double rain; //rain volume
  private double snow; //snow volume

  /**
   * Object containing information about weather in a specific time.
   * @param json JSON Response from Open Weather App.
   */
  public ForecastData(JSONObject json) {
    dateTime = json.optLong(DT_SEC);
    dateTimeText = json.optString(DT_TEXT);
    detail = new Detail(json.optJSONObject(DETAIL));
    weather = new Weather(json.optJSONArray(WEATHER).optJSONObject(0));
    wind = new Wind(json.optJSONObject(WIND));
    cloudiness = json.optJSONObject(CLOUDS).optInt(CLD_ALL);
    JSONObject rainJson = json.optJSONObject(RAIN);
    if (rainJson == null) {
      rain = Double.NaN;
    } else {
      rain = json.optDouble(VOL, Double.NaN);
    }
    JSONObject snowJson = json.optJSONObject(SNOW);
    if (snowJson == null) {
      snow = Double.NaN;
    } else {
      snow = json.optDouble(VOL, Double.NaN);
    }
  }

  public long getDateTime() {
    return dateTime;
  }

  public String getDateTimeText() {
    return dateTimeText;
  }

  public double getTemp() {
    return detail.getTemp();
  }

  public double getTempMin() {
    return detail.getTempMin();
  }

  public double getTempMax() {
    return detail.getTempMax();
  }

  public int getHumidity() {
    return detail.getHumidity();
  }

  public int getWeatherId() {
    return weather.getId();
  }

  public String getWeatherMain() {
    return weather.getMain();
  }

  public String getWeatherDetails() {
    return weather.getDetails();
  }

  public String getWeatherIcon() {
    return weather.getIcon();
  }

  public double getWindDeg() {
    return wind.getDeg();
  }

  public double getWindSpeed() {
    return wind.getSpeed();
  }

  public int getCloudiness() {
    return cloudiness;
  }

  public double getRain() {
    return rain;
  }

  public double getSnow() {
    return snow;
  }
}