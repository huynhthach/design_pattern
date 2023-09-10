package creational.singleton.singleton_factory_bt6;
public class MainSP {
    public static void main(String[] args) {
        UI1 ui1 = new UI1();
        ui1.addsp(new SanPham("123456","kem",10,12));
        dataAccess access = dataAccess.getDataAccess();
        access.insp();
    }
}
