public class MainCo_Long {
    I_QuanCo_LONG iQuanCoLong;

    public I_QuanCo_LONG getiQuanCoLong() {
        return iQuanCoLong;
    }

    public I_QuanCo_LONG setiQuanCoLong(I_QuanCo_LONG iQuanCoLong) {
        this.iQuanCoLong = iQuanCoLong;
        return iQuanCoLong;
    }

    public static void main(String[] args) {
        FactoryCo_Long factoryCoLong = new Covua_Long();
        I_QuanCo_LONG iQuanCoLong1 = factoryCoLong.create(LoaiCo.Covua);
        iQuanCoLong1.hienThi_Long();
    }
}
