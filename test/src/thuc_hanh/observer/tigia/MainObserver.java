package thuc_hanh.observer.tigia;

public class MainObserver {
    public static void main(String[] args) {
        TiGia t = new TiGia();
        NhaDauTuA nhaDauTuA = new NhaDauTuA(t);
        NhaDauTuB nhaDauTuB = new NhaDauTuB(t);
        System.out.println("lan 1");
        t.notify(-5);
        nhaDauTuA.huydangky();
        System.out.println("lan 2");
        t.notify(5);
    }
}
