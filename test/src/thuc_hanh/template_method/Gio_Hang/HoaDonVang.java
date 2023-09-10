package thuc_hanh.template_method.Gio_Hang;

public class HoaDonVang extends HoaDon<MatHang>{

    @Override
    public String getTMH(MatHang matHang) {
        return matHang.getTenMatHang();
    }

    @Override
    public double tinhtongtien() {
        double tong = 0;
        for(MatHang t:list)
            tong+= t.getThanhTien();
        return tong;
    }

    @Override
    public double tinhchietkhau() {
        double tongTien = tinhtongtien();
        if (tongTien >= 500000) {
            return tongTien * 0.02;
        }
        return 0;
    }
}
