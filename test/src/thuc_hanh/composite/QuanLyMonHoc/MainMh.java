package thuc_hanh.composite.QuanLyMonHoc;

public class MainMh {
    public static void main(String[] args) {
        KeHoachHocTap keHoachHocTap = new KeHoachHocTapChung();
        KeHoachHocTap nam1 = new KeHoachHocTapChung();
        KeHoachHocTap v1 = new MonHoc("toan",20000,3);
        KeHoachHocTap v2 = new MonHoc("anh",20000,4);
        keHoachHocTap.add(v1);
        keHoachHocTap.add(v2);
        System.out.println(keHoachHocTap.soTC());
    }
}
