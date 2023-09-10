package thuc_hanh.chain_of_reponsibility.Veso;

public interface I_DoVeSo {
    I_DoVeSo next(I_DoVeSo veSo);
    String kiemtragiai(String chuoi);
}
