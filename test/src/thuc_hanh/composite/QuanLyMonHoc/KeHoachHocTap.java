package thuc_hanh.composite.QuanLyMonHoc;

public abstract class KeHoachHocTap {
    abstract public void add(KeHoachHocTap keHoachHocTap);
    abstract public void remove(KeHoachHocTap keHoachHocTap);
    abstract String getMonHoc();
    abstract public int soTC();
    abstract public int getHocPhi();
}
