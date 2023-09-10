package thuc_hanh.template_method.Mon_Hoc;

public class MonHocDB extends EntityDB<MonHoc>{
    @Override
    public int getKey(MonHoc monHoc) {
        return monHoc.getMaMH();
    }
}
