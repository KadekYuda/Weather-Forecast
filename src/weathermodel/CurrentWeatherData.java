package weathermodel;

import org.json.JSONObject;


/**
 * A data structure containing current weather data at a city.
 * @author yudai
 */
public class CurrentWeatherData {

  private static final String DETAIL = "main";
  private static final String WEATHER = "weather";
  private static final String CLOUDS = "clouds";
  private static final String WIND = "wind";
  private static final String RAIN = "rain";
  private static final String SNOW = "snow";
  private static final String CLD_ALL = "all";
  private static final String VOL = "3h";
  private static final String ID = "id";
  private static final String NAME = "name";
  private static final String COUNTRY = "country";
  private static final String SYS = "sys";
  private static final String COORD = "coord";

  private Coordinates coordinates;
  private Detail detail;
  private Weather weather;
  private Wind wind;
  private int cloudiness;
  private double snow;
  private double rain;
  private int cityId;
  private String cityName;
  private String cityCountry;

  private class Coordinates {
    private static final String LAT = "lat";
    private static final String LON = "lon";

    private double lat;
    private double lon;

    public Coordinates() {
      lat = Double.NaN;
      lon = Double.NaN;
    }

    public Coordinates(JSONObject json) {
      lat = json.optDouble(LAT);
      lon = json.optDouble(LON);
    }

    public double getLat() {
      return lat;
    }

    public double getLon() {
      return lon;
    }
  }
  
  /**
   * Create a data of current weather according JSON format from OpenWeatherClient.
   * @param json JSON from OpenWeatherMap
   */
  public CurrentWeatherData(JSONObject json) {
    coordinates = new Coordinates(json.optJSONObject(COORD));
    detail = new Detail(json.optJSONObject(DETAIL));
    weather = new Weather(json.optJSONArray(WEATHER).optJSONObject(0));
    wind = new Wind(json.optJSONObject(WIND));
    cityId = json.optInt(ID, Integer.MIN_VALUE);
    cityName = json.optString(NAME, "");
    cityCountry = json.optJSONObject(SYS).optString(COUNTRY);
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

  public double getLat() {
    return coordinates.getLat();
  }

  public double getLon() {
    return coordinates.getLon();
  }

  public int getCloudiness() {
    return cloudiness;
  }

  public double getSnow() {
    return snow;
  }

  public double getRain() {
    return rain;
  }

  public int getCityId() {
    return cityId;
  }

  public String getCityName() {
    return cityName;
  }

  public String getCityCountry() {
    return cityCountry;
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
}
