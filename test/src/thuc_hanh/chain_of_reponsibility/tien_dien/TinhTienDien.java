package thuc_hanh.chain_of_reponsibility.tien_dien;

public class TinhTienDien implements I_TienDien{
    int max,min,sotien;
    I_TienDien iTienDien;

    public TinhTienDien(int min, int max, int sotien) {
        this.min = min;
        this.max = max;
        this.sotien = sotien;
    }

    @Override
    public I_TienDien Next(I_TienDien dien) {
        this.iTienDien = dien;
        return dien;
    }

    @Override
    public int tong(int luongdien) {
        if(luongdien <= max){
            return sotien*(luongdien-min);
        }else
            return sotien*(max-min) + iTienDien.tong(luongdien);
    }
}
