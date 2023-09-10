package thuc_hanh.observer.weather;

public class Weather {
    WeatherObserver observer;

    public void attach(WeatherObserver observer){
        this.observer = observer;
    }
    public void dettach(){
        this.observer=null;
    }
    public void notifyObserver(float t,float h,float p){
        observer.update(t,h,p);
    }

    public static interface WeatherObserver{
        void update(float temp,float humidity,float pleasure);
    }
}
