package thuc_hanh.observer.streamdata;

import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        Stream<List<MonHoc>> stream = new Stream<>();
        dataAccess data = new dataAccess(stream);
        Client<List<MonHoc>> client = new Client<List<MonHoc>>(stream) {
            @Override
            public void handle(List<MonHoc> monHocs) {
                for(var mh: monHocs){
                    System.out.println(mh.toString());
                }
            }
        };
        System.out.println("lần 1");
        data.addMH(new MonHoc("01","mau thiet ke","3"));
        data.removeMH(0);
        System.out.println("lần 2");
        data.addMH(new MonHoc("02","web","2"));
    }
}
