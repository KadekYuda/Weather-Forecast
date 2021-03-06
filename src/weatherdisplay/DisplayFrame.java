/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weatherdisplay;

import java.awt.GridBagConstraints;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import util.Formatter;
import util.Utilities;
import weathermodel.CurrentWeatherData;
import weathermodel.WeatherSearchResult;
import weatherservice.OpenWeatherClient;

/**
 * Main Frame for displaying GUI.
 * @author yudai
 */
public class DisplayFrame extends javax.swing.JFrame {

  /**
   * Creates new form DisplayFrame.
   */
  public DisplayFrame() {
    initComponents();
    this.setIconImage(new ImageIcon("res/icon.png").getImage());
  }

  //CHECKSTYLE.OFF
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings({"checkstyle:linelength",
                     "checkstyle:indentation",
                     "checkstyle:whitespacearound"})
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    finderPanel = new javax.swing.JPanel();
    searchPanel = new javax.swing.JPanel();
    searchField = new javax.swing.JTextField();
    searchButton = new javax.swing.JButton();
    searchResultScrollPane = new javax.swing.JScrollPane();
    searchResultPanel = new javax.swing.JPanel();
    weatherPanel = new javax.swing.JPanel();
    forecastScrollPane = new javax.swing.JScrollPane();
    forecastListPanel = new javax.swing.JPanel();
    currentWeatherPanel = new javax.swing.JPanel();
    cityLabel = new javax.swing.JLabel();
    weatherDetailLabel = new javax.swing.JLabel();
    humidity = new javax.swing.JLabel();
    maxTemp = new javax.swing.JLabel();
    minTemp = new javax.swing.JLabel();
    cloudiness = new javax.swing.JLabel();
    windSpeed = new javax.swing.JLabel();
    windDir = new javax.swing.JLabel();
    humidityLabel = new javax.swing.JLabel();
    cloudinessLabel = new javax.swing.JLabel();
    maxTempLabel = new javax.swing.JLabel();
    minTempLabel = new javax.swing.JLabel();
    windSpeedLabel = new javax.swing.JLabel();
    windDirectionLabel = new javax.swing.JLabel();
    lat = new javax.swing.JLabel();
    lon = new javax.swing.JLabel();
    weatherIcon = new javax.swing.JLabel();
    currentTempLabel = new javax.swing.JLabel();
    latLabel = new javax.swing.JLabel();
    lonLabel = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Weather Forecast App");
    setResizable(false);

    searchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

    searchField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        searchFieldActionPerformed(evt);
      }
    });

    searchButton.setText("Search!");
    searchButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        searchButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
    searchPanel.setLayout(searchPanelLayout);
    searchPanelLayout.setHorizontalGroup(
      searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(searchPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(searchField)
          .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
        .addContainerGap())
    );
    searchPanelLayout.setVerticalGroup(
      searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(searchPanelLayout.createSequentialGroup()
        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(searchButton)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    searchResultScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Result"));
    searchResultScrollPane.setToolTipText("");
    searchResultScrollPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

    searchResultPanel.setLayout(new java.awt.GridBagLayout());
    searchResultScrollPane.setViewportView(searchResultPanel);

    javax.swing.GroupLayout finderPanelLayout = new javax.swing.GroupLayout(finderPanel);
    finderPanel.setLayout(finderPanelLayout);
    finderPanelLayout.setHorizontalGroup(
      finderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, finderPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(finderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(searchResultScrollPane))
        .addContainerGap())
    );
    finderPanelLayout.setVerticalGroup(
      finderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(finderPanelLayout.createSequentialGroup()
        .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(searchResultScrollPane))
    );

    weatherPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Weather Forecast"));

    forecastScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Forecast"));

    forecastListPanel.setLayout(new java.awt.GridBagLayout());
    forecastScrollPane.setViewportView(forecastListPanel);

    currentWeatherPanel.setPreferredSize(new java.awt.Dimension(0, 517));

    cityLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    cityLabel.setText("Welcome to Weather App!");

    weatherDetailLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    weatherDetailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    weatherDetailLabel.setText("Weather Condition");
    weatherDetailLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    humidity.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    humidity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    humidity.setText("Humidity");

    maxTemp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    maxTemp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    maxTemp.setText("Max. Temperature");

    minTemp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    minTemp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    minTemp.setText("Min. Temperature");

    cloudiness.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    cloudiness.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    cloudiness.setText("Cloudiness");

    windSpeed.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    windSpeed.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    windSpeed.setText("Wind Speed");

    windDir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    windDir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    windDir.setText("Wind Direction");

    humidityLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    humidityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    humidityLabel.setText(" ");

    cloudinessLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    cloudinessLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    cloudinessLabel.setText(" ");

    maxTempLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    maxTempLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    maxTempLabel.setText(" ");

    minTempLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    minTempLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    minTempLabel.setText(" ");

    windSpeedLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    windSpeedLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

    windDirectionLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    windDirectionLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

    lat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    lat.setText("Lat:");

    lon.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    lon.setText("Lon:");

    weatherIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    weatherIcon.setText(" ");
    weatherIcon.setPreferredSize(new java.awt.Dimension(256, 256));

    currentTempLabel.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
    currentTempLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    currentTempLabel.setText(" ");

    latLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    latLabel.setText(" ");

    lonLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    lonLabel.setText(" ");

    javax.swing.GroupLayout currentWeatherPanelLayout = new javax.swing.GroupLayout(currentWeatherPanel);
    currentWeatherPanel.setLayout(currentWeatherPanelLayout);
    currentWeatherPanelLayout.setHorizontalGroup(
      currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(currentWeatherPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentWeatherPanelLayout.createSequentialGroup()
            .addComponent(lat)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(latLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lon)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addComponent(weatherDetailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(currentWeatherPanelLayout.createSequentialGroup()
            .addComponent(weatherIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(currentTempLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addGap(18, 18, 18)
        .addGroup(currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(windSpeedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(maxTempLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(windSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
          .addComponent(humidity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(maxTemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(humidityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(70, 70, 70)
        .addGroup(currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(windDirectionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(minTemp, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
          .addComponent(minTempLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(windDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(cloudiness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(cloudinessLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
      .addComponent(cityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    currentWeatherPanelLayout.setVerticalGroup(
      currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(currentWeatherPanelLayout.createSequentialGroup()
        .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(currentWeatherPanelLayout.createSequentialGroup()
            .addGroup(currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(humidityLabel)
              .addComponent(cloudinessLabel))
            .addGap(10, 10, 10)
            .addGroup(currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(humidity)
              .addComponent(cloudiness)))
          .addGroup(currentWeatherPanelLayout.createSequentialGroup()
            .addGroup(currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lat)
                .addComponent(lonLabel))
              .addGroup(currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(latLabel)
                .addComponent(lon)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(weatherDetailLabel)))
        .addGap(3, 3, 3)
        .addGroup(currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(currentWeatherPanelLayout.createSequentialGroup()
            .addGroup(currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(currentWeatherPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(currentWeatherPanelLayout.createSequentialGroup()
                    .addComponent(minTempLabel)
                    .addGap(3, 3, 3)
                    .addComponent(minTemp))
                  .addGroup(currentWeatherPanelLayout.createSequentialGroup()
                    .addComponent(maxTempLabel)
                    .addGap(3, 3, 3)
                    .addComponent(maxTemp))))
              .addGroup(currentWeatherPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(currentTempLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(29, 29, 29)
            .addGroup(currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(windDirectionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
              .addComponent(windSpeedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addComponent(weatherIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(currentWeatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(windSpeed)
          .addComponent(windDir))
        .addGap(26, 26, 26))
    );

    javax.swing.GroupLayout weatherPanelLayout = new javax.swing.GroupLayout(weatherPanel);
    weatherPanel.setLayout(weatherPanelLayout);
    weatherPanelLayout.setHorizontalGroup(
      weatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(forecastScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
      .addComponent(currentWeatherPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
    );
    weatherPanelLayout.setVerticalGroup(
      weatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, weatherPanelLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(currentWeatherPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(forecastScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(finderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(weatherPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(finderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(weatherPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  @SuppressWarnings({"checkstyle:linelength", "checkstyle:indentation", "checkstyle:whitespacearound"})
  private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_searchFieldActionPerformed

  @SuppressWarnings({"checkstyle:linelength", "checkstyle:indentation", "checkstyle:whitespacearound"})
  private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
    searchResultPanel.removeAll();
    WeatherSearchResult result = client.getSearch(searchField.getText());
    int statusCode = result.getStatusCode();
    if (statusCode >= 200 && statusCode < 300) {
      ArrayList<CurrentWeatherData> resultData = result.getCityWeatherSearchResult();
      if (resultData.isEmpty()) {
        JLabel newLabel = new JLabel("No result found");
        searchResultPanel.add(newLabel);
      } else {
        for (CurrentWeatherData data: resultData) {
          // prettifying gbc
          GridBagConstraints gbc = new GridBagConstraints();
          gbc.gridx = 0;
          gbc.weightx = 1.0;
          gbc.anchor = GridBagConstraints.NORTH;
          gbc.fill = GridBagConstraints.HORIZONTAL;
          JPanel newPanel = new ResultPanel(data, this);
          searchResultPanel.add(newPanel, gbc);
        }
        // placing a blank label with certain gbc values to press search result to top.
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = resultData.size()-1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        searchResultPanel.add(new JLabel(" "), gbc);
      }
    } else {
      JOptionPane.showMessageDialog(this, result.getMessage());
    }
    searchResultPanel.repaint();
    searchResultPanel.revalidate();
  }//GEN-LAST:event_searchButtonActionPerformed

  /**
   * Main program starts here.
   * @param args command-line arguments.
   */
  @SuppressWarnings({"checkstyle:linelength", "checkstyle:indentation", "checkstyle:whitespacearound"})
  public static void main(String[] args) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Metal".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(DisplayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(DisplayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(DisplayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(DisplayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new DisplayFrame().setVisible(true);
    });
  }

  /**
   * Assign values to currentWeatherPanel to be shown on GUI.
   * @param current currentWeatherData passed from resultPanel
   */
  public void setCurrentWeatherPanel(CurrentWeatherData current) {
    latLabel.setText(String.valueOf(current.getLat()));
    lonLabel.setText(String.valueOf(current.getLon()));
    currentTempLabel.setText(Formatter.toCelcius(String.valueOf(current.getTemp())));
    maxTempLabel.setText(Formatter.toCelcius(String.valueOf(current.getTempMax())));
    minTempLabel.setText(Formatter.toCelcius(String.valueOf(current.getTempMin())));
    humidityLabel.setText(Formatter.toDegree(String.valueOf(current.getHumidity())));
    cloudinessLabel.setText(Formatter.toPercent(String.valueOf(current.getCloudiness())));
    windSpeedLabel.setText(Formatter.toMps(String.valueOf(current.getWindSpeed())));
    windDirectionLabel.setText(Utilities.convertToCompass(current.getWindDeg()));
    String imagePath = Formatter.toPng(current.getWeatherIcon());
    java.net.URL imgUrl = this.getClass().getClassLoader().getResource(imagePath);
    cityLabel.setText(Formatter.getCityCountry(current.getCityName(), current.getCityCountry()));
    weatherDetailLabel.setText(Formatter.capitalizeFully(current.getWeatherDetails()));
    ImageIcon icon = Utilities.getImageIcon(imgUrl, 240, 240);
    weatherIcon.setIcon(icon);
    currentWeatherPanel.repaint();
    currentWeatherPanel.revalidate();
  }

  public JPanel getForecastListPanel() {
    return forecastListPanel;
  }

  public JPanel getSearchResultPanel() {
    return searchResultPanel;
  }

  public JPanel getCurrentWeatherPanel() {
    return currentWeatherPanel;
  }

  // API Key
  private static final String KEY = "1410697d3b7d76e4d1a16c890195cc57";
  // Open Weather Client declaration
  protected static OpenWeatherClient client = new OpenWeatherClient(KEY);
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel cityLabel;
  private javax.swing.JLabel cloudiness;
  private javax.swing.JLabel cloudinessLabel;
  private javax.swing.JLabel currentTempLabel;
  private javax.swing.JPanel currentWeatherPanel;
  private javax.swing.JPanel finderPanel;
  private javax.swing.JPanel forecastListPanel;
  private javax.swing.JScrollPane forecastScrollPane;
  private javax.swing.JLabel humidity;
  private javax.swing.JLabel humidityLabel;
  private javax.swing.JLabel lat;
  private javax.swing.JLabel latLabel;
  private javax.swing.JLabel lon;
  private javax.swing.JLabel lonLabel;
  private javax.swing.JLabel maxTemp;
  private javax.swing.JLabel maxTempLabel;
  private javax.swing.JLabel minTemp;
  private javax.swing.JLabel minTempLabel;
  private javax.swing.JButton searchButton;
  private javax.swing.JTextField searchField;
  private javax.swing.JPanel searchPanel;
  private javax.swing.JPanel searchResultPanel;
  private javax.swing.JScrollPane searchResultScrollPane;
  private javax.swing.JLabel weatherDetailLabel;
  private javax.swing.JLabel weatherIcon;
  private javax.swing.JPanel weatherPanel;
  private javax.swing.JLabel windDir;
  private javax.swing.JLabel windDirectionLabel;
  private javax.swing.JLabel windSpeed;
  private javax.swing.JLabel windSpeedLabel;
  // End of variables declaration//GEN-END:variables
}
