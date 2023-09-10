public class Xe_Long implements I_QuanCo_LONG{

    @Override
    public void ThucHienNuocDi_Long() {
        System.out.println("đi thẳng về phía trước hoặc đi sang ngang");
    }

    @Override
    public void anquan_Long() {
        System.out.println("ăn được quân khác khi đi thẳng");
    }


    @Override
    public void hienThi_Long() {
        System.out.println("quân xe");
        ThucHienNuocDi_Long();
        anquan_Long();
    }
}
