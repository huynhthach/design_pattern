package thuc_hanh.observer.ATM;

public class TaiKhoan implements ATM.I_TaiKhoanATM{
    ATM atm;
    String tentk;
    int sodu;

    public void duathevaomay(ATM atm){
        atm.attach(this);
    }
    public void rutthe(){
        atm.detach(this);
    }
    @Override
    public boolean KiemTraSoDu(int sotienrut) {
        if(sotienrut>sodu) {
            return false;
        }else return true;
    }

    @Override
    public void NhanThongBao(int sotiendarut, boolean xacnhan) {
        if(xacnhan){
            System.out.println("số dư cũ " + sodu);
            sodu-=sotiendarut;
            System.out.println("số tiền cần rút " + sotiendarut);
            System.out.println("còn lại:"+sodu);
        }else System.out.println("rút không thành công");
    }
}
