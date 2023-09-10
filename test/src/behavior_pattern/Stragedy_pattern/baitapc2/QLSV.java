package behavior_pattern.Stragedy_pattern.baitapc2;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QLSV {
    List<SinhVien> svs = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;

    public int them(SinhVien sv) {
        svs.add(sv);
        return 0;
    }
    public void sapxep(){
        svs.sort((o1,o2)->soSanh.sosanh(o1,o2));
    }
    public void inds(){
        svs.forEach(t->System.out.println(t.toString()));
    }

    public List<SinhVien> getSvs() {
        return svs;
    }

    public void setSvs(List<SinhVien> svs) {
        this.svs = svs;
    }
    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public static void main(String[] args) {
        Date d = new Date();
        QLSV ql = new QLSV();
        SinhVien sv = new SinhVien("hrl",d,7);
        SinhVien s = new SinhVien("h",d,10);
        ql.them(sv);
        ql.them(s);
        ql.setSoSanh(new SoSanhTheoDiem());
        ql.sapxep();
        ql.inds();
    }
}

