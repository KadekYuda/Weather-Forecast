# Weather-Forecast

Made by: I Kadek Yuda Budipratama Giri / 13516115

## Build
1. Install Ant
2. Masuk ke directory project
3. Untuk melakukan checkstyle, masukkan perintah berikut ke dalam command prompt/terminal
```
ant checkstyle
```


## API
**API (Application Programming Interface)** adalah sekumpulan alat-alat yang memudahkan pengembangan sebuah software dengan menyediakan fitur-fitur yang memudahkan pengembangan aplikasi dengan menyediakan berbagai fungsi, prosedur, serta alat-alat yang dapat berinteraksi dengan aplikasi yang menggunakan layanan tersebut. Tujuan penggunaan API adalah untuk menggunakan suatu fitur tanpa harus mengimplementasikan kembali fitur tersebut ke dalam kode, karena hal tersebut beresiko terjadi kesalahan dan *bug* serta terkesan mengulangi implementasi kode kode yang sudah ada. Selain itu, penggunaan API akan mempermudah pengembangan aplikasi karena pengembang aplikasi tidak perlu lagi mengimplementasikan fitur yang dibutuhkan.


## Open Weather API
**Open Weather API** adalah sebuah API yang menyediakan layanan penyediaan data mengenai cuaca di berbagai kota. Layanan cuaca yang diseduakan oleh Open Weather API mulai dari penyediaan data cuaca pada satu waktu, prediksi cuaca untuk 5 hari setiap 3 jam, prediksi cuaca per hari, data cuaca dalam bentuk peta, dan berbagai informasi seperti sinar UV dan tingkat polusi di suatu kota. Data cuaca yang disediakan adalah lokasi, keadaan cuaca, keterangan cuaca, informasi kecepatan dan arah angin, curah hujan, jumlah awan, suhu sekarang, prediksi suhu maksimal dan minimal, dan kelembapan.

## Struktur Package

```
weatherforecast
|
|__util
|  |__ Formatter.java
|  |__ Utilities.java
|
|__weatherservice
|  |__ OpenWeatherClient.java
|
|__weatherdisplay
|  |__ DisplayFrame.java
|  |__ ResultPanel.java
|
|__weathermodel
   |__ CurrentWeaherData.java
   |__ Detail.java
   |__ ForecastData.java
   |__ Response.java
   |__ Weather.java
   |__ WeatherForecastResult.java
   |__ WeatherSearchResult.java
   |__ Wind.java

```

### Checklist

- [X] Melengkapkan kelas WeatherService untuk bisa mengembalikan lokasi kota
- [X] Membuat fitur pencarian kota
- [X] Handling kasus jika tidak ada kota
- [X] Mengubah metode getString menjadi optString pada kelas WeatherService
- [X] Menmbuat rancangan tampilan depan
- [X] Menyatukan GUI dengan OpenWeatherClient
- [X] Memeriksa standar kode dengan checkstyle
- [X] Membuat dokumentasi
- [X] Melakukan tes JDepend
- [X] Melengkapi testing untuk weathermodel