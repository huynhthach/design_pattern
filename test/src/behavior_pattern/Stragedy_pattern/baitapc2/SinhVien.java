package behavior_pattern.Stragedy_pattern.baitapc2;

import java.util.Date;

public class SinhVien {
    String hoten;
    Date ngaysinh;
    float DiemTB;

    public SinhVien(String hoten, Date ngaysinh, float diemTB) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        DiemTB = diemTB;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public float getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(float diemTB) {
        DiemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoten='" + hoten + '\'' +
                ", ngaysinh=" + ngaysinh +
                ", DiemTB=" + DiemTB +
                '}';
    }
}
