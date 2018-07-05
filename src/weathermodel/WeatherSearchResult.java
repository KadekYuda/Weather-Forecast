package weathermodel;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class WeatherSearchResult extends Response {

  private static final String LIST = "list";
  private static final String COUNT = "count";

  private ArrayList<CurrentWeatherData> cityWeatherSearchResult;

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
