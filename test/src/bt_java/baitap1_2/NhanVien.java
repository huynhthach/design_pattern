package bt_java.baitap1_2;

public class NhanVien {
    String nhanvien ,diachi;
    int tuoi ,tongsogiolam;
    double tienluong ;
    public NhanVien(String nv,String dc,int t,int tsgl,double l){
        this.nhanvien = nv;
        this.diachi = dc;
        this.tuoi = t;
        this.tongsogiolam = tsgl;
        this.tienluong = l;
    }
    public String getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(String nhanvien) {
        this.nhanvien = nhanvien;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getTongsogiolam() {
        return tongsogiolam;
    }

    public void setTongsogiolam(int tongsogiolam) {
        this.tongsogiolam = tongsogiolam;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public String getThongtin(){
        System.out.println("ten"+nhanvien);
        System.out.println("dia chi"+diachi);
        System.out.println("tuoi"+tuoi);
        System.out.println("tong so gi lam"+tongsogiolam);
        System.out.println("luong"+tienluong);
        return  null;
    }
    private double tinhthuong(){
        double thuong;
        if(tongsogiolam>200){
            thuong = tienluong * 0.2;
        } else if (tongsogiolam > 100 && tongsogiolam<200) {
            thuong = tienluong * 0.1;
        }else {
            thuong = 0;
        }
        return thuong;
    }


    public static void main(String[] args) {
        NhanVien nv = new NhanVien("huynh thach long","nha trang",20,500,40000);
        QuanLyNhanVien ql = new QuanLyNhanVien();
        ql.them(nv);
        ql.inDS();
        }
    }