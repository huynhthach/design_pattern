package thuc_hanh.observer.streamdata;

import java.util.ArrayList;
import java.util.List;

public class Stream<T>{
    List<Listeners> listeners = new ArrayList<>();
    public void listen(Listeners listener){
        listeners.add(listener);
    }
    public void addEvent(T t){
        for(var listeners1 : listeners){
            listeners1.handle(t);
        }
    }
    public static interface Listeners<T>{
        void handle(T t);
    }
}
