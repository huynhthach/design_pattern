package thuc_hanh.decorator.BieuThuc;

public class Nhan extends BieuThucDecorator{
    int toanHang;

    public Nhan(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    float giaTri() {
        return (bieuThuc.giaTri())*toanHang;
    }

    @Override
    String bieuThuc() {
        return "("+bieuThuc.bieuThuc()+")"+" * " + toanHang +" ";
    }
}
