package weathermodel;

import org.json.JSONObject;

public class Wind {
  private static final String DEG = "deg";
  private static final String SPEED = "speed";

  private double deg;
  private double speed;

  public Wind(JSONObject json) {
    deg = json.optDouble(DEG, Double.NaN);
    speed = json.optDouble(SPEED, Double.NaN);
  }

  public double getDeg() {
    return deg;
  }

  public double getSpeed() {
    return speed;
  }
}