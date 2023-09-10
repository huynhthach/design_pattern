package bt_java.baitap4;

public class chuyenxengoaithanh extends chuyenxe{
        double sotuyen,sokmdiduoc,doanhthu;

    public chuyenxengoaithanh(String masochuyen, String hotentx, String soxe, double doanhthu, double sotuyen, double sokmdiduoc) {
        super(masochuyen, hotentx, soxe);
        this.sotuyen = sotuyen;
        this.sokmdiduoc = sokmdiduoc;
        this.doanhthu = doanhthu;
    }

    @Override
    public String toString() {
        return "chuyenxengoaithanh{"+"\nma so chuyen="+masochuyen+"\nhoten="+hotentx+"\nsoxe="+soxe +
                "\nsotuyen=" + sotuyen +
                ", \nsokmdiduoc=" + sokmdiduoc +
                ", \ndoanhthu=" + doanhthu +
                '}';
    }
}
