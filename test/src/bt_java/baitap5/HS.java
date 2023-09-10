package bt_java.baitap5;

public class HS extends canhan{
    String lop,nangkhieu;

    public HS(String hoten, String diachi, String sdt, int tuoi,String lop,String nangkhieu) {
        super(hoten, diachi, sdt, tuoi);
        this.lop = lop;
        this.nangkhieu = nangkhieu;
    }

    @Override
    public String HienThiTT() {
        return "ho ten hoc sinh ="+hoten+"\ndia chi = "+diachi+
                "\nsdt ="+sdt+"\ntuoi = "+tuoi+"\nlop ="+lop+
                "\nnang khieu = "+nangkhieu;
    }
}
