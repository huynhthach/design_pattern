package thuc_hanh.template_method.Gio_Hang;

public class MatHang {
        String tenMatHang;
        int soLuong;
        double donGia;

        public MatHang(String tenMatHang, int soLuong, double donGia) {
            this.tenMatHang = tenMatHang;
            this.soLuong = soLuong;
            this.donGia = donGia;
        }

        public String getTenMatHang() {
            return tenMatHang;
        }

        public int getSoLuong() {
            return soLuong;
        }

        public double getDonGia() {
            return donGia;
        }

        public double getThanhTien() {
            return soLuong * donGia;
        }

    @Override
    public String toString() {
        return "MatHang{" +
                "tenMatHang='" + tenMatHang + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
}
