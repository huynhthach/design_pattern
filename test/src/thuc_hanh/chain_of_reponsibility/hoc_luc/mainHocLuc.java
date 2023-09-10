package thuc_hanh.chain_of_reponsibility.hoc_luc;

public class mainHocLuc {
    public static void main(String[] args) {
        I_HocSinh hs0 = new Hoc_Luc("y",4);
        I_HocSinh hs1 = new Hoc_Luc("tb",5);
        I_HocSinh hs2 = new Hoc_Luc("k",7);
        I_HocSinh hs3 = new Hoc_Luc("g",8);
        I_HocSinh hs4 = new Hoc_Luc("xs",10);
        hs0.next(hs1).next(hs2).next(hs3).next(hs4);
        System.out.println(hs0.hocluc(3));
    }
}
