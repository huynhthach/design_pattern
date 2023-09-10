package bt_java.baitap3;

public class sinhvienbliz extends sinhvienntu {
    double diemmaketting,diemsale;
    public sinhvienbliz(String hoten, String nganh,double diemmaketting,double diemsale) {
        super(hoten, nganh);
        this.diemmaketting=diemmaketting;
        this.diemsale=diemsale;
    }
    @Override
    public double getDiem() {
        return (2 * diemmaketting + diemsale)/3;
    }
    public String gethocluc(){
        double diem = getDiem();
        if(diem<5){
            return "yeu";
        } else if (diem<6.5) {
            return "trung binh";
        } else if (diem<7.5) {
            return "kha";
        } else if (diem<9) {
            return "gioi";
        }else return "xuat sac";
    }

    @Override
    void xuat() {
        super.xuat();
        System.out.println("diem:"+getDiem());
        System.out.println("xep loai"+gethocluc());
    }
}
