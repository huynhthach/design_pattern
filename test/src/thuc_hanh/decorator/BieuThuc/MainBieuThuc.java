package thuc_hanh.decorator.BieuThuc;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc bieuThuc = new BieuThucDonGian(6);
        //BieuThuc bieuThuc = new BieuThucDonGian(8);

        bieuThuc = new Cong(bieuThuc,9);
        bieuThuc = new Nhan(bieuThuc,8);
        bieuThuc = new Cong(bieuThuc,5);

        /*bieuThuc = new Cong(bieuThuc,6);
        bieuThuc = new Chia(bieuThuc,2);
        bieuThuc = new Nhan(bieuThuc,5);
        bieuThuc = new Cong(bieuThuc,8);
        bieuThuc = new Tru(bieuThuc,4);*/

        System.out.println(bieuThuc.bieuThuc() +" = "+ bieuThuc.giaTri());
    }
}
