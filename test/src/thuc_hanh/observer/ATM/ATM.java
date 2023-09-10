package thuc_hanh.observer.ATM;

public class ATM {
    private I_TaiKhoanATM taiKhoanATM;

    public void attach(I_TaiKhoanATM taiKhoanATM){
        this.taiKhoanATM=taiKhoanATM;
    }
    public void detach(I_TaiKhoanATM o){
        this.taiKhoanATM=null;
    }
    private boolean KiemTraRutTien(int sotienrut){
        return taiKhoanATM.KiemTraSoDu(sotienrut);
    }
    public void RutTien(int sotien){
        if(KiemTraRutTien(sotien)){
            taiKhoanATM.NhanThongBao(sotien,true);
        }else taiKhoanATM.NhanThongBao(sotien,false);
    }
    public static interface I_TaiKhoanATM{
        boolean KiemTraSoDu(int sotienrut);
        void NhanThongBao(int sotiendarut,boolean xacnhan);
    }
}
