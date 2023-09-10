package behavior_pattern.Stragedy_pattern.baitapc3;

public class MatHang {
    String tenmh;
    int soluong;
    double dongia;

    public MatHang(String tenmh, int soluong, double dongia) {
        this.tenmh = tenmh;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getTenmh() {
        return tenmh;
    }

    public void setTenmh(String tenmh) {
        this.tenmh = tenmh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    @Override
    public String toString() {
        return "MatHang{" +
                "tenmh='" + tenmh + '\'' +
                ", soluong=" + soluong +
                ", dongia=" + dongia +
                '}';
    }
}
