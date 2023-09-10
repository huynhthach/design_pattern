package thuc_hanh.decorator.BieuThuc;

public class Tru extends BieuThucDecorator{
    float toanHang;

    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    float giaTri() {
        return bieuThuc.giaTri()-toanHang;
    }

    @Override
    String bieuThuc() {
        return bieuThuc.bieuThuc()+" - " + toanHang;
    }
}
