package thuc_hanh.composite.QuanLyMonHoc;

import java.util.ArrayList;
import java.util.List;

public class KeHoachHocTapChung extends KeHoachHocTap{
    List<KeHoachHocTap> keHoachHocTaps = new ArrayList<>();
    @Override
    public void add(KeHoachHocTap keHoachHocTap) {
        keHoachHocTaps.add(keHoachHocTap);
    }

    @Override
    public void remove(KeHoachHocTap keHoachHocTap) {
        keHoachHocTaps.remove(keHoachHocTap);
    }

    @Override
    String getMonHoc() {
        StringBuilder builder = new StringBuilder();
        for(KeHoachHocTap k:keHoachHocTaps)
            builder.append(k.getMonHoc());
        return builder.toString();

    }

    @Override
    public int soTC() {
        int tong=0;
        for(KeHoachHocTap k:keHoachHocTaps)
            tong+=k.soTC();
        return tong;
    }

    @Override
    public int getHocPhi() {
        int tong=0;
        for(KeHoachHocTap k:keHoachHocTaps)
            tong+=k.getHocPhi();
        return tong;
    }
}
