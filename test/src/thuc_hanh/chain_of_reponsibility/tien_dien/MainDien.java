package thuc_hanh.chain_of_reponsibility.tien_dien;

public class MainDien {
    public static void main(String[] args) {
        I_TienDien bac1 = new TinhTienDien(0,50,1000);
        I_TienDien bac2 = new TinhTienDien(50,100,2000);
        I_TienDien bac3 = new TinhTienDien(100,200,3000);
        I_TienDien bac4 = new TinhTienDien(200,300,4000);
        I_TienDien bac5 = new TinhTienDien(300,400,5000);
        I_TienDien bac6 = new TinhTienDien(400,Integer.MAX_VALUE,6000);
        bac1.Next(bac2).Next(bac3).Next(bac4).Next(bac5).Next(bac6);
        System.out.println(bac1.tong(21));
    }
}
