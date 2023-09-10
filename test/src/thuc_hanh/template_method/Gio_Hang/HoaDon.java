package thuc_hanh.template_method.Gio_Hang;

import java.util.ArrayList;
import java.util.List;

public abstract class HoaDon<T> {
    List<T> list = new ArrayList<>();
    public abstract String getTMH(T t);
    public void addMH(T t){
        for(var o:list)
            if(getTMH(o).equals(getTMH(t)))
                return;
        list.add(t);
    }
    public void Inds(){
        list.forEach(t -> System.out.println(t.toString()));
    }
    public abstract double tinhtongtien();
    public abstract double tinhchietkhau();
}
