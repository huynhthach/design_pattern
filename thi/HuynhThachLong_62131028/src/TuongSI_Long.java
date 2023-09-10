public class TuongSI_Long implements I_QuanCo_LONG {

    @Override
    public void ThucHienNuocDi_Long() {
        System.out.println("di 1 buoc ve truoc");
    }

    @Override
    public void anquan_Long() {
        System.out.println("an duoc quan khi di thang");
    }


    @Override
    public void hienThi_Long() {
        System.out.println("quân tướng sĩ");
        ThucHienNuocDi_Long();
        anquan_Long();
    }

}
