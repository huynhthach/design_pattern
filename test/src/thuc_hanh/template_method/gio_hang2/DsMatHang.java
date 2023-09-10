package thuc_hanh.template_method.gio_hang2;

import java.util.ArrayList;
import java.util.List;

public abstract class DsMatHang<T> {
    List<T> list = new ArrayList<>();
    public abstract String getName(T t);
    public void addMh(T t){
        list.add(t);
    }
    public void remove(T t){
        list.remove(t);
    }
    public abstract double tinhtien();
    public abstract double tinhchietkhau();
}
