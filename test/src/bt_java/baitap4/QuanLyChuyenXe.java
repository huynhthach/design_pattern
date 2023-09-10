package bt_java.baitap4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<chuyenxe> list = new ArrayList<>();
    public void them(chuyenxe cx){
    for(chuyenxe c :list)
        if(c.masochuyen == cx.masochuyen)
            return;
        list.add(cx);
    }
    public void xuatdanhsachchuyenxe(){
        for(chuyenxe c:list){
            System.out.println(c.toString());
        }
    }
    public void tongdoanhthunoithanh(){
        int tong=0;
        for(chuyenxe c : list){
            if(c instanceof chuyenxenoithanh){
                tong +=((chuyenxenoithanh) c).doanhthu;
            }
        }
    }
    public void tongdoanhthungoaithanh(){
        int tong=0;
        for(chuyenxe c : list){
            if(c instanceof chuyenxengoaithanh){
                tong +=((chuyenxengoaithanh) c).doanhthu;
            }
        }
    }

}
