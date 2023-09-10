package thuc_hanh.decorator.BieuThuc;

public class Cong extends BieuThucDecorator {
    float toanHang;

    public Cong(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    float giaTri() {
        return bieuThuc.giaTri()+toanHang;
    }

    @Override
    String bieuThuc() {
        return super.bieuThuc()+" + "+toanHang;
    }
}
