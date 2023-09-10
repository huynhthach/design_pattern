package thuc_hanh.chain_of_reponsibility.hoc_luc;

public class Hoc_Luc implements I_HocSinh {
    I_HocSinh iHocSinh;
    String hocluc;
    int diemhl;

    public Hoc_Luc(String hocluc, int diem) {
        this.hocluc = hocluc;
        this.diemhl = diem;
    }

    @Override
    public I_HocSinh next(I_HocSinh iHocSinh) {
        this.iHocSinh=iHocSinh;
        return iHocSinh;
    }

    @Override
    public String hocluc(int diem) {
        if(diem <= diemhl)
            return hocluc;
        return iHocSinh.hocluc(diem);
    }
}
