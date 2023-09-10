package thuc_hanh.chain_of_reponsibility.ATM;

public class MainAtm {
    public static void main(String[] args) {
        I_RutTienATM to1 = new RutTienATM_MenhGiaTien(100);
        I_RutTienATM to2 = new RutTienATM_MenhGiaTien(50);
        I_RutTienATM to3 = new RutTienATM_MenhGiaTien(10);
        I_RutTienATM to4 = new RutTienATM_MenhGiaTien(1);
        to1.thanhPhanKeTiep(to2).thanhPhanKeTiep(to3).thanhPhanKeTiep(to4);
        to1.ruttien(222);
    }
}
