package bt_java.baitap3;

public abstract class sinhvienntu {
    String hoten,nganh;

    public sinhvienntu(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }
    public abstract double getDiem();
    void xuat() {
    System.out.println("ten hoc sinh"+hoten);
    System.out.println("nganh hoc"+nganh);
    }
    public String getHoten() {
        return hoten;
    }

    public String getNganh() {
        return nganh;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public static void main(String[] args) {
    sinhvienbliz blt = new sinhvienbliz("htl","maketting",8.5,4.2);
    blt.xuat();

    }
}
