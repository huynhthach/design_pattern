public class Covua_Long extends FactoryCo_Long{
    @Override
    public I_QuanCo_LONG createco(LoaiCo loaiCo) {
        if(loaiCo == LoaiCo.Covua) {
            return new Xe_Long();
        }else return null;

    }
}
