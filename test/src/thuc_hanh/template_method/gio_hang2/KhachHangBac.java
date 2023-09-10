package thuc_hanh.template_method.gio_hang2;

import java.util.List;

public class KhachHangBac extends DsMatHang<MatHang>{

    @Override
    public String getName(MatHang matHang) {
        return matHang.getTen();
    }

    @Override
    public double tinhtien() {
        double tong = 0;
        for(MatHang m : list)
            tong+=m.getSoluong()*m.getDongia();
        return tong;
    }

    @Override
    public double tinhchietkhau() {
        double chietkhau =0;
        if(tinhtien()==500000)
            chietkhau = tinhtien()*0.02;
        return chietkhau;

    }
}
