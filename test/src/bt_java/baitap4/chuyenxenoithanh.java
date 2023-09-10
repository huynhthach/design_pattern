package bt_java.baitap4;

public class chuyenxenoithanh extends chuyenxe{
    String noiden;
    double songaydiduoc,doanhthu;

    public chuyenxenoithanh(String masochuyen, String hotentx, String soxe, double doanhthu, String noiden, double songaydiduoc) {
        super(masochuyen, hotentx, soxe);
        this.noiden = noiden;
        this.songaydiduoc = songaydiduoc;
        this.doanhthu = doanhthu;
    }

    @Override
    public String toString() {
        return "chuyenxenoithanh{" +"ma so chuyen="+masochuyen+".hoten="+hotentx+",soxe="+soxe +
                "noiden='" + noiden +
                ", songaydiduoc=" + songaydiduoc +
                ", doanhthu=" + doanhthu +
                '}';
    }
}
