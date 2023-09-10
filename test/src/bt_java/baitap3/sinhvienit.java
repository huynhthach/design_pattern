package bt_java.baitap3;

public class sinhvienit extends sinhvienntu{
    double diemJava,diemCss,diemHtml;
    public sinhvienit(String hoten, String nganh,double diemJava,double diemCss,double diemHtml) {
        super(hoten, nganh);
        this.diemJava=diemJava;
        this.diemCss=diemCss;
        this.diemHtml=diemHtml;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemCss + diemHtml)/4;
    }
    public String gethocluc(){
        double diem = getDiem();
        if(diem>5){
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
