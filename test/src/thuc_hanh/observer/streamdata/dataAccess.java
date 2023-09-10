package thuc_hanh.observer.streamdata;

import java.util.ArrayList;
import java.util.List;

public class dataAccess {
    List<MonHoc> list = new ArrayList<>();
    Stream<List<MonHoc>> stream;

    public dataAccess(Stream<List<MonHoc>> stream) {
        this.stream = stream;
    }
    public void addMH(MonHoc mh){
        list.add(mh);
        stream.addEvent(list);
    }
    public void removeMH(int i){
        list.remove(i);
    }
}
