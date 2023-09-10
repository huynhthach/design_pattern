package thuc_hanh.chain_of_reponsibility.Shopping;

public interface I_Shopping {
    I_Shopping next(I_Shopping shopping);
    String MuaHang(int tien);
}
