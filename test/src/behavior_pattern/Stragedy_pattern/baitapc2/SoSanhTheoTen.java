package behavior_pattern.Stragedy_pattern.baitapc2;


public class SoSanhTheoTen implements ISoSanh<SinhVien> {
    @Override
    public int sosanh(SinhVien o1, SinhVien o2) {
        return o1.hoten.compareTo(o2.hoten);
    }
}
