package bt_java.baitap5;

public abstract class canhan {
    String hoten,diachi,sdt;
    int tuoi;

    public canhan(String hoten, String diachi, String sdt, int tuoi) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.sdt = sdt;
        this.tuoi = tuoi;
    }
    public abstract String HienThiTT();

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }


}
