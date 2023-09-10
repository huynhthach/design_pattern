package creational.builder.builder_bt1;
public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.builder()
                .buildngayban("24/11").buildmahoadon("1234")
                .buildtenkhachhang("long")
                .buildcthd(new CTHD("a",12,12,12))
                .build();
        System.out.println(hoaDon.toString());

    }
}
