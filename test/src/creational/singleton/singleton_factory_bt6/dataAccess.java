package creational.singleton.singleton_factory_bt6;

import java.util.ArrayList;
import java.util.HashMap;

public class dataAccess {
    private ArrayList<SanPham> sanPhams = new ArrayList<>();
    private static dataAccess dataAccess;
    //sử dụng dictionary
    private dataAccess(){
        sanPhams = new ArrayList<>();
    }
    public static dataAccess getDataAccess(){
        if(dataAccess == null) {
            dataAccess = new dataAccess();
        }
        return dataAccess;
    }
    public ArrayList<SanPham> getSanPhams() {
        return sanPhams;
    }
    public void themsp(SanPham sanPham){
        sanPhams.add(sanPham);
    }
    public void insp(){
        sanPhams.forEach(t->System.out.println(t.toString()));
    }
}
