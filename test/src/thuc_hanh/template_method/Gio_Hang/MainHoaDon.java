package thuc_hanh.template_method.Gio_Hang;

public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon<MatHang> hoaDon = new HoaDonVang();
        hoaDon.addMH(new MatHang("but",5,60000));
        hoaDon.addMH(new MatHang("thuoc",5,60000));
        hoaDon.Inds();
        System.out.println(hoaDon.tinhtongtien());
        System.out.println(hoaDon.tinhchietkhau());
    }
}
