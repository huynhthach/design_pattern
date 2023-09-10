package thuc_hanh.observer.tigia;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    List<I_Theodoitigia> observers = new ArrayList<>();
    public void attach(I_Theodoitigia o){
        if(!observers.contains(o))  //kiem tra
            observers.add(o);
    }
    public void detach(I_Theodoitigia o){
        observers.remove(o);
    }
    public void notify(float delta){
        for(I_Theodoitigia o : observers)
            o.updatetigia(delta);
    }
    public static interface  I_Theodoitigia{
        void updatetigia(float delta);
    }
}
