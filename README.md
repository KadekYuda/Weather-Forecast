# Weather-Forecast

Made by: I Kadek Yuda Budipratama Giri / 13516115

## API
**API (Application Programming Interface)** adalah sekumpulan alat-alat yang memudahkan pengembangan sebuah software dengan menyediakan fitur-fitur yang memudahkan pengembangan aplikasi dengan menyediakan berbagai fungsi, prosedur, serta alat-alat yang dapat berinteraksi dengan aplikasi yang menggunakan layanan tersebut. Tujuan penggunaan API adalah untuk menggunakan suatu fitur tanpa harus mengimplementasikan kembali fitur tersebut ke dalam kode, karena hal tersebut beresiko terjadi kesalahan dan *bug* serta terkesan mengulangi implementasi kode kode yang sudah ada. Selain itu, penggunaan API akan mempermudah pengembangan aplikasi karena pengembang aplikasi tidak perlu lagi mengimplementasikan fitur yang dibutuhkan.


## Open Weather API
**Open Weather API** adalah sebuah API yang menyediakan layanan penyediaan data mengenai cuaca di berbagai kota. Layanan cuaca yang diseduakan oleh Open Weather API mulai dari penyediaan data cuaca pada satu waktu, prediksi cuaca untuk 5 hari setiap 3 jam, prediksi cuaca per hari, data cuaca dalam bentuk peta, dan berbagai informasi seperti sinar UV dan tingkat polusi di suatu kota. Data cuaca yang disediakan adalah lokasi, keadaan cuaca, keterangan cuaca, informasi kecepatan dan arah angin, curah hujan, jumlah awan, suhu sekarang, prediksi suhu maksimal dan minimal, dan kelembapan.

## Struktur Package

```
weatherforecast
|__weatherService
|  |__ Weather.java
|  |__ WeatherService.java
|
|__weatherservice
|  |__ DisplayFrame.java
|  |__ DisplayPanel.java
|__Main.java
```
### Checklist Package

| Package | Nama File | Implemented | Tested |
|---|---|---|---|
| weatherservice | Weather.java | [X] | [-] |
| weatherservice | WeatherService.java | [X] | [X] |
| weatherdisplay | DisplayFrame.java | [-] | [-] |
| weatherdisplay | DisplayPanel.java | [-] | [-] |
| - | Main.java | [-] | [-] |

### Checklist

- [ ] Melengkapkan kelas WeatherService untuk bisa mengembalikan lokasi kota
- [ ] Membuat fitur pencarian kota
- [ ] Handling kasus jika tidak ada kota
- [ ] Mengubah metode getString menjadi optString pada kelas WeatherService
- [ ] Menmbuat tampilan depan
