package thuc_hanh.chain_of_reponsibility.ATM;

public interface I_RutTienATM {
    I_RutTienATM thanhPhanKeTiep(I_RutTienATM atm);
    void ruttien(int sotien);
}
