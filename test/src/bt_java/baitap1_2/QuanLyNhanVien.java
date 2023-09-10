package bt_java.baitap1_2;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien implements IQuanLy{
    List<NhanVien> list = new ArrayList<>();
    @Override
    public void them(NhanVien nv) {
        for(NhanVien n:list)
            if(n.nhanvien == nv.nhanvien)
                return;
        list.add(nv);
    }

    @Override
    public void inDS() {
        for(NhanVien n:list){
            System.out.println(n.getThongtin());
        }

    }
}
