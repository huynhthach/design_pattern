package thuc_hanh.chain_of_reponsibility.hoc_luc;

public interface I_HocSinh {
    I_HocSinh next(I_HocSinh iHocSinh);
    String hocluc(int diem);
}
