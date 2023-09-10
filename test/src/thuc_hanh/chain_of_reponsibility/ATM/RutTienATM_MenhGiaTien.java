package thuc_hanh.chain_of_reponsibility.ATM;

public class RutTienATM_MenhGiaTien implements I_RutTienATM{
    int menhGia;
    I_RutTienATM ketiep;

    public RutTienATM_MenhGiaTien(int menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    public I_RutTienATM thanhPhanKeTiep(I_RutTienATM atm) {
        this.ketiep=atm;
        return atm;
    }

    @Override
    public void ruttien(int sotien) {
        int soto = 0;
        if(sotien >= menhGia){
            soto = sotien / menhGia;
            sotien -= soto * menhGia;
        }
        if(soto>0){
            System.out.println(soto + " " + menhGia);
        }
        if(sotien!=0 && ketiep!=null){
            ketiep.ruttien(sotien);
        }
        else
            System.out.println("done!");
    }
}
