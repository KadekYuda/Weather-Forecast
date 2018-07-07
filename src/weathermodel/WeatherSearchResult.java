package weathermodel;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Return a set of CurrentWeatherData for search purpose.
 * @author yudai
 */
public class WeatherSearchResult extends Response {

  private static final String LIST = "list";
  private static final String COUNT = "count";

  private ArrayList<CurrentWeatherData> cityWeatherSearchResult;

  /**
   * Creates weatherSearchResult data from JSON from OpenWeatherClient.
   * @param json JSON data from weatherDataClient
   */
  public WeatherSearchResult(JSONObject json) {
    super(json);
    int count = json.optInt(COUNT);
    cityWeatherSearchResult = new ArrayList<CurrentWeatherData>();
    JSONArray jsonArray = json.optJSONArray(LIST);
    for (int i = 0; i < count; i++) {
      JSONObject obj = jsonArray.optJSONObject(i);
      CurrentWeatherData currentData = new CurrentWeatherData(obj);
      cityWeatherSearchResult.add(currentData);
    }
  }

  public ArrayList<CurrentWeatherData> getCityWeatherSearchResult() {
    return cityWeatherSearchResult;
  }
}
