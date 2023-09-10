package bt_java.baitap5;

import java.util.ArrayList;
import java.util.List;

public class Lop {
    List<HS> hs = new ArrayList<>();
    List<GV> gv = new ArrayList<>();
    public int themhs(HS h) {
        for(HS s: hs)
            if(s.hoten == h.hoten)
                return 0;
        hs.add(h);
        return 0;
    }
    public int themgv(GV g) {
        for(GV v: gv)
            if(v.hoten == g.hoten)
                return 0;
        gv.add(g);
        return 0;
    }
    public void indshs() {
        for(HS hocsinh:hs)
            System.out.println(hocsinh.HienThiTT());
    }
    public void indsgv() {
        for(GV giaovien:gv)
            System.out.println(giaovien.HienThiTT());
    }

    public static void main(String[] args) {
        GV gv = new GV("htl","nha traNG","12354",50,"toan","toan");
        GV vv = new GV("htls","nha traNG","1235",50,"toan","toan");
        HS hs = new HS("long","nt","456",20,"cntt","choi game");
        QLDS ql = new QLDS();
        Lop l = new Lop();
        /*ql.them(gv);
        ql.them(vv);
        ql.xoa("htls");
        ql.inds();
         */

        l.themgv(gv);
        l.themhs(hs);
        l.indsgv();
        l.indshs();


    }
}
