package behavior_pattern.Chain_of_Responsibility.f88;

public class Mainf88 {
    public static void main(String[] args) {
        IXuLyVay gaccong = new NhanVienf88("Long","gac cong",1500000);
        IXuLyVay gacthangmay = new NhanVienf88("loc","gac thang may",2500000);
        IXuLyVay truongphong = new NhanVienf88("linh","truong phong",50000000);
        IXuLyVay phoGD = new NhanVienf88("a","pho GD",80000000);
        IXuLyVay thuKy = new NhanVienf88("a","thu ky",30000000);
        IXuLyVay GiamDoc = new GiamDocf88("b",100000000);
        gaccong.capCaoHon(gacthangmay).capCaoHon(thuKy)
                .capCaoHon(truongphong).capCaoHon(phoGD).capCaoHon(GiamDoc);
        System.out.println(gaccong.xuLyKhoanVay(90000000));
    }
}
