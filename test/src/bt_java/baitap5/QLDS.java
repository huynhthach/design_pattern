package bt_java.baitap5;

import java.util.ArrayList;
import java.util.List;

public class QLDS implements IQLDS{
    List<canhan> list = new ArrayList<>();
    @Override
    public int them(canhan p) {
        for(canhan c : list)
            if(c.sdt == p.sdt)
                return 0;
        list.add(p);
        return 0;
    }

    @Override
    public int xoa(String ten) {
        list.removeIf(t->ten.equals(t.hoten));
        return 0;
    }

    @Override
    public void inds() {
        for(canhan cn:list)
            System.out.println(cn.HienThiTT());
    }
}
