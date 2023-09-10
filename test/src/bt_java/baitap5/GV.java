package bt_java.baitap5;

public class GV extends canhan{
    String monday,tobomon;

    public GV(String hoten, String diachi, String sdt, int tuoi,String monday,String tobomon) {
        super(hoten, diachi, sdt, tuoi);
        this.monday = monday;
        this.tobomon = tobomon;
    }


    @Override
    public String HienThiTT() {
        return "ho ten giao vien ="+hoten+"\ndia chi = "+diachi+
                "\nsdt ="+sdt+"\ntuoi = "+tuoi+"\nmon day ="+monday+
                "\nto bo mon = "+tobomon;
    }
}
