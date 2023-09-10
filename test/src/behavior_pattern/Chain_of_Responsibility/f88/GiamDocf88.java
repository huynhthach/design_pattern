package behavior_pattern.Chain_of_Responsibility.f88;

public class GiamDocf88 implements IXuLyVay{
    String ten;
    int hanMucChoVay;

    public GiamDocf88(String ten, int hanMucChoVay) {
        this.ten = ten;
        this.hanMucChoVay = hanMucChoVay;
    }

    @Override
    public String xuLyKhoanVay(int tienvay) {
        if(tienvay<hanMucChoVay)
            return "Giam Doc " + ten +" xu ly khoan vay";
        return "ra ngan hang vay";
    }

    @Override
    public IXuLyVay capCaoHon(IXuLyVay xuLyVay) {
        return null;
    }
}
