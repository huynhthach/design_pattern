public class Tuong_Long implements I_QuanCo_LONG{
    @Override
    public void ThucHienNuocDi_Long() {
        System.out.println("đi chéo 1 1 góc 45 độ");
    }

    @Override
    public void anquan_Long() {
        System.out.println("ăn được khi đi ngang");
    }


    @Override
    public void hienThi_Long() {
        System.out.println("quân tượng");
        ThucHienNuocDi_Long();
        anquan_Long();
    }
}
