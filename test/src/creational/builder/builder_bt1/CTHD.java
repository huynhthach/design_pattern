package creational.builder.builder_bt1;
public class CTHD{
    String sanpham;
    int soluong,dongia,chietkhau;

    public CTHD(String sanpham, int soluong, int dongia, int chietkhau) {
        this.sanpham = sanpham;
        this.soluong = soluong;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
    }
    @Override
    public String toString() {
        return
                "sanpham='" + sanpham +
                ", soluong=" + soluong +
                ", dongia=" + dongia +
                ", chietkhau=" + chietkhau ;
    }
}
