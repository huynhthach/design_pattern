package thuc_hanh.chain_of_reponsibility.Shopping;

public class MainShopping {
    public static void main(String[] args) {
        I_Shopping nhanvien = new NhanVien("nhân viên",10000);
        I_Shopping quanly = new NhanVien("quản lý",50000);
        I_Shopping giamdoc = new NhanVien("giám đốc",100000);
        nhanvien.next(quanly).next(giamdoc);
        System.out.println(nhanvien.MuaHang(2000000));
    }
}
