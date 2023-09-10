public class Tot_Long implements I_QuanCo_LONG{
    @Override
    public void ThucHienNuocDi_Long() {
        System.out.println("Đi theo kiểu vòng cung");
    }

    @Override
    public void anquan_Long() {
        System.out.println("ăn theo hướng vòng cung");
    }


    @Override
    public void hienThi_Long() {
        System.out.println("quân tốt");
        ThucHienNuocDi_Long();
        anquan_Long();
    }
}
