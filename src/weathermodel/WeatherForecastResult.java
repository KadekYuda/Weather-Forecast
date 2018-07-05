package weathermodel;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class WeatherForecastResult extends Response {
  private static final String CITY = "city";
  private static final String FORECAST = "list";

  private City city;
  private ArrayList<ForecastData> forecastList;

  /**
   * Create a forecast result from JSON response from Open Weather API.
   * @param json JSON response from Open Weather API.
   */
  public WeatherForecastResult(JSONObject json) {
    super(json);
    forecastList = new ArrayList<ForecastData>();
    if (super.getStatusCode() < 200 || super.getStatusCode() >= 300) {
      city = new City();
    } else {
      city = new City(json.optJSONObject(CITY));
      JSONArray jsonArray = json.optJSONArray(FORECAST);
      for (int i = 0; i < jsonArray.length(); i++) {
        JSONObject obj = jsonArray.optJSONObject(i);
        ForecastData forecast = new ForecastData(obj);
        forecastList.add(forecast);
      }
    }
  }

  private class City {
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String COUNTRY = "country";

    private int cityId;
    private String cityName;
    private String cityCountry;

    private City() {
      cityId = Integer.MIN_VALUE;
      cityName = "";
      cityCountry = "";
    }

    private City(JSONObject json) {
      cityId = json.optInt(ID);
      cityName = json.optString(NAME);
      cityCountry = json.optString(COUNTRY);
    }

    private int getCityId() {
      return cityId;
    }

    private String getCityName() {
      return cityName;
    }

    private String getCityCountry() {
      return cityCountry;
    }
  }

  public ArrayList<ForecastData> getForecastList() {
    return forecastList;
  }

  public String  getCityName() {
    return city.getCityName();
  }

  public String getCityCountry() {
    return city.getCityCountry();
  }

  public int getCityId() {
    return city.getCityId();
  }
}
