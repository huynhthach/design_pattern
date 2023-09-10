package behavior_pattern.Chain_of_Responsibility.f88;

public class NhanVienf88 implements IXuLyVay{
    IXuLyVay capCaoHon;
    String ten,chucvu;
    int hanMucChoVay;

    public NhanVienf88(String ten, String chucvu, int hanMucChoVay) {
        this.ten = ten;
        this.chucvu = chucvu;
        this.hanMucChoVay = hanMucChoVay;
    }

    @Override
    public String xuLyKhoanVay(int tienvay) {
        if(tienvay<=hanMucChoVay)
            return chucvu + " " + ten + " xu ly khoan vay";
        return capCaoHon.xuLyKhoanVay(tienvay);
    }

    @Override
    public IXuLyVay capCaoHon(IXuLyVay capCaoHon) {
        this.capCaoHon=capCaoHon;
        return capCaoHon;
    }
}
