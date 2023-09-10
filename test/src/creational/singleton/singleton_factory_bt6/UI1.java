package creational.singleton.singleton_factory_bt6;

public class UI1 {
    private dataAccess data = dataAccess.getDataAccess();
    public void addsp(SanPham sanPham){
        data.themsp(sanPham);
    }
}
