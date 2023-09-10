package thuc_hanh.template_method.gio_hang2;

public class MatHang {
    String ten;
    double soluong,dongia;

    public MatHang(String ten, double soluong, double dongia) {
        this.ten = ten;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getTen() {
        return ten;
    }

    public double getSoluong() {
        return soluong;
    }

    public double getDongia() {
        return dongia;
    }

    @Override
    public String toString() {
        return "MatHang{" +
                "ten='" + ten + '\'' +
                ", soluong=" + soluong +
                ", dongia=" + dongia +
                '}';
    }
}
