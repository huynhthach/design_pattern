package behavior_pattern.template_method_online;

public class MySinhVien {
    private int maSV;
    private String tenSv,ngaySinh,queQuan;

    public MySinhVien(int maSV, String tenSv, String ngaySinh, String queQuan) {
        this.maSV = maSV;
        this.tenSv = tenSv;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "maSV=" + maSV +
                ", tenSv='" + tenSv + '\n' +
                ", ngaySinh='" + ngaySinh + '\n' +
                ", queQuan='" + queQuan + '\n';
    }
}
