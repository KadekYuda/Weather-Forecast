package weathermodel;

import org.json.JSONObject;

public class Weather {
  private static final String ID = "id";
  private static final String MAIN = "main";
  private static final String DETAILS = "description";
  private static final String ICON = "icon";

  private int id;
  private String main;
  private String details;
  private String icon;

  public Weather(JSONObject json) {
    id = json.optInt(ID, Integer.MIN_VALUE);
    main = json.optString(MAIN, "");
    details = json.optString(DETAILS, "");
    icon = json.optString(ICON);
  }

  public int getId() {
    return id;
  }

  public String getMain() {
    return main;
  }

  public String getDetails() {
    return details;
  }

  public String getIcon() {
    return icon;
  }
}
