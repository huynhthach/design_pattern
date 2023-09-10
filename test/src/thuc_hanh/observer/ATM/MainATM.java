package thuc_hanh.observer.ATM;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan taiKhoan = new TaiKhoan();
        taiKhoan.duathevaomay(atm);
        taiKhoan.sodu = 1000000;
        atm.RutTien(20000);
    }
}
