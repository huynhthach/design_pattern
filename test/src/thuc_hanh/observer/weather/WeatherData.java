package thuc_hanh.observer.weather;

public class WeatherData implements Weather.WeatherObserver{
    Weather weather;
    public WeatherData(Weather weather1){
        this.weather = weather1;
        weather.attach(this);
    }
    public void huydangky(){
        weather.dettach();
    }
    @Override
    public void update(float temp, float humidity, float pleasure) {
        System.out.println("nhiệt độ = "+temp);
        System.out.println("độ ẩm = "+humidity);
        System.out.println("pleasure = "+pleasure);
    }
}
