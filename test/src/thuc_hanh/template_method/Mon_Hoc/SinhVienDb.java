package thuc_hanh.template_method.Mon_Hoc;

public class SinhVienDb extends EntityDB<SinhVien>{
    @Override
    public int getKey(SinhVien sinhVien) {
        return sinhVien.getMaSV();
    }
}
