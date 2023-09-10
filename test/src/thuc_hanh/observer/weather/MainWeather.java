package thuc_hanh.observer.weather;

public class MainWeather {
    public static void main(String[] args) {
        Weather weather = new Weather();
        WeatherData weatherData = new WeatherData(weather);
        weather.notifyObserver(2,2,2);
        System.out.println("huỷ đăng ký");
        weatherData.huydangky();
        System.out.println("đăng ký lại");
        WeatherData weatherData1 = new WeatherData(weather);
        weather.notifyObserver(2,3,2);
    }
}
