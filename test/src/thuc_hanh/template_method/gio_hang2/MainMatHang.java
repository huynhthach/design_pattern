package thuc_hanh.template_method.gio_hang2;

public class MainMatHang {
    public static void main(String[] args) {
        DsMatHang<MatHang> matHang = new KhachHangBac();
        matHang.addMh(new MatHang("kem",5,50000));
        matHang.addMh(new MatHang("kim",5,50000));
        System.out.println(matHang.tinhtien());
        System.out.println(matHang.tinhchietkhau());
    }
}
