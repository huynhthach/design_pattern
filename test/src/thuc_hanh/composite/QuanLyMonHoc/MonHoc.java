package thuc_hanh.composite.QuanLyMonHoc;

public class MonHoc extends KeHoachHocTap{
    String tenMH;
    int hocphi,sotc;

    public MonHoc(String tenMH, int hocphi, int sotc) {
        this.tenMH = tenMH;
        this.hocphi = hocphi;
        this.sotc = sotc;
    }

    @Override
    public void add(KeHoachHocTap keHoachHocTap) {

    }

    @Override
    public void remove(KeHoachHocTap keHoachHocTap) {

    }
    @Override
    String getMonHoc() {
        return "MonHoc{" +
                "tenMH='" + tenMH + '\'' +
                ", hocphi=" + hocphi +
                ", sotc=" +sotc +
                ",tong so tc ="+ soTC()+
                "hoc phi ="+getHocPhi()+
                '}';
    }

    @Override
    public int soTC() {
        return sotc;
    }

    @Override
    public int getHocPhi() {
        return hocphi*sotc;
    }
}
