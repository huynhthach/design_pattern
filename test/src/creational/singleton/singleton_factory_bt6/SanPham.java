package creational.singleton.singleton_factory_bt6;

public class SanPham {
    String masp,tensp;
    int soluong,dongia;

    public SanPham(String masp, String tensp, int soluong, int dongia) {
        this.masp = masp;
        this.tensp = tensp;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    @Override
    public String toString() {
        return "SanPham{" +
                "masp=" + masp + '\n' +
                ", tensp=" + tensp + '\n' +
                ", soluong=" + soluong +'\n'+
                ", dongia=" + dongia +
                '}';
    }
}
