package thuc_hanh.chain_of_reponsibility.tien_dien;

public interface I_TienDien {
    I_TienDien Next(I_TienDien dien);
    int tong(int luongdien);
}
