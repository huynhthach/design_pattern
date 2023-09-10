public abstract class FactoryCo_Long {
    public abstract I_QuanCo_LONG createco(LoaiCo loaiCo);
    public I_QuanCo_LONG create(LoaiCo loaiCo){
        I_QuanCo_LONG iQuanCoLong;
        iQuanCoLong = createco(loaiCo);
        iQuanCoLong.ThucHienNuocDi_Long();
        iQuanCoLong.anquan_Long();
        iQuanCoLong.hienThi_Long();
        return iQuanCoLong;
    }
}