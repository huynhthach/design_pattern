package thuc_hanh.chain_of_reponsibility.Shopping;

public class NhanVien implements I_Shopping{
    I_Shopping nextlevel;
    String chucvu;
    int hanmuc;

    public NhanVien(String chucvu, int hanmuc) {
        this.chucvu = chucvu;
        this.hanmuc = hanmuc;
    }

    @Override
    public I_Shopping next(I_Shopping shopping) {
        this.nextlevel=shopping;
        return shopping;
    }

    @Override
    public String MuaHang(int tien) {
        if(tien<=hanmuc)
            return " " + tien + " "+chucvu;
        if(nextlevel!=null)
        return nextlevel.MuaHang(tien);
        else return "error";
    }
}
