package bt_java.baitap4;

public abstract class chuyenxe {
    String masochuyen,hotentx,soxe;

    public chuyenxe(String masochuyen, String hotentx, String soxe) {
        this.masochuyen = masochuyen;
        this.hotentx = hotentx;
        this.soxe = soxe;
    }

    public String getMasochuyen() {
        return masochuyen;
    }

    public void setMasochuyen(String masochuyen) {
        this.masochuyen = masochuyen;
    }

    public String getHotentx() {
        return hotentx;
    }

    public void setHotentx(String hotentx) {
        this.hotentx = hotentx;
    }

    public String getSoxe() {
        return soxe;
    }

    public void setSoxe(String soxe) {
        this.soxe = soxe;
    }

    public static void main(String[] args) {
    chuyenxengoaithanh cxnt = new chuyenxengoaithanh("2456a","huynh thach long"
                                                    ,"56a.3",45000,21,300);
    chuyenxengoaithanh cnt = new chuyenxengoaithanh("456","huy thach long"
                                                    ,"56a.3",45000,22,300);
    chuyenxengoaithanh cxt = new chuyenxengoaithanh("45","hu thach long"
                                                    ,"56a.3",45000,22,300);
    QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
    qlcx.them(cxnt);
    qlcx.them(cnt);
    qlcx.them(cxt);
    qlcx.xuatdanhsachchuyenxe();
    }
}
