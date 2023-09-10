package thuc_hanh.decorator.BieuThuc;

public class BieuThucDonGian extends BieuThuc{
    float toanhang;

    public BieuThucDonGian(float toanhang) {
        this.toanhang = toanhang;
    }

    @Override
    float giaTri() {
        return toanhang;
    }

    @Override
    String bieuThuc() {
        return "" + toanhang;
    }
}
