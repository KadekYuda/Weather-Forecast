package weatherservice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

import org.json.JSONException;
import org.json.JSONObject;
import weathermodel.WeatherForecastResult;
import weathermodel.WeatherSearchResult;

/**
 * Generate weather information using OpenWeatherMap API.
 */
public class OpenWeatherClient {
  private static String API_KEY;

  /**
   * Creating service with user's API.
   * @param key API Key from OpenWeatherMap API.
   */
  public OpenWeatherClient(String key) {
    API_KEY = key;
  }

  /**
   * Sending request to OpenWeatherMap API to get Forecast for a certain location in JSON string.
   *
   * @param location City Location.
   * @return JSON String of Forecast for location.
   */
  private JSONObject getSearchJson(String location) throws JSONException {
    String baseUrl = "https://api.openweathermap.org/data/2.5/find?q=";
    String urlString = baseUrl + location + "&units=metric&appid=" + API_KEY;
    StringBuilder result = new StringBuilder();
    try {
      URL url = new URL(urlString);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      conn.setRequestProperty("User-Agent", "Mozilla/5.0");
      int statusCode = conn.getResponseCode();
      String message = conn.getResponseMessage();
      if (statusCode < 200 || statusCode >= 300) {
        JSONObject response = new JSONObject();
        response.put("cod",statusCode);
        response.put("message", message);
        return response;
      } else {
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
          result.append(line);
        }
        rd.close();
      }
    } catch (UnknownHostException e) {
      e.getStackTrace();
      JSONObject response = new JSONObject();
      response.put("cod", 503);
      response.put("message", "Service Unavailable");
      return response;
    } catch (Exception e) {
      JSONObject response = new JSONObject();
      response.put("cod", 500);
      response.put("message", "Internal Server Error");
      e.printStackTrace();
    }
    return new JSONObject(result.toString());
  }

  private JSONObject getForecastJson(int countryId) throws JSONException {
    String baseUrl = "https://api.openweathermap.org/data/2.5/forecast?id=";
    String urlString = baseUrl + countryId + "&units=metric&appid=" + API_KEY;
    StringBuilder result = new StringBuilder();
    try {
      URL url = new URL(urlString);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      conn.setRequestProperty("User-Agent", "Mozilla/5.0");
      int statusCode = conn.getResponseCode();
      String message = conn.getResponseMessage();
      if (statusCode < 200 || statusCode >= 300) {
        JSONObject response = new JSONObject();
        response.put("cod",statusCode);
        response.put("message", message);
        return response;
      } else {
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
          result.append(line);
        }
        rd.close();
      }
    } catch (UnknownHostException e) {
      e.getStackTrace();
      JSONObject response = new JSONObject();
      response.put("cod", 503);
      response.put("message", "Service Unavailable");
      return response;
    } catch (Exception e) {
      JSONObject response = new JSONObject();
      response.put("cod", 500);
      response.put("message", "Internal Server Error");
      e.printStackTrace();
    }
    return new JSONObject(result.toString());
  }

  /**
   * Get forecast for a certain location.
   * @param id  ID of City.
   * @return WeatherForecastResult from city location
   */
  public WeatherForecastResult getForecast(int id) {
    try {
      JSONObject weatherJson = getForecastJson(id);
      //System.out.println(weatherJson.toString());
      return new WeatherForecastResult(weatherJson);
    } catch (Exception e) {
      return new WeatherForecastResult(null);
    }
  }

  /**
   * Get search for some city.
   * @param location name of the city.
   * @return a set of city names in WeatherSearchResult. 
   */
  public WeatherSearchResult getSearch(String location) {
    try {
      JSONObject searchJson = getSearchJson(location);
      //System.out.println(searchJson.toString());
      return new WeatherSearchResult(searchJson);
    } catch (Exception e) {
      return new WeatherSearchResult(null);
    }
  }
}
