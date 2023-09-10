package behavior_pattern.Stragedy_pattern.baitapc3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GioHang {
    List<MatHang> list = new ArrayList<>();
    IvanChuyen ivanChuyen;

    IThanhToan thanhToan;
    public int tongtien =0;

    public int them(MatHang matHang) {
        list.add(matHang);
        return 0;
    }
    public IvanChuyen getIvanChuyen() {
        return ivanChuyen;
    }

    public void setIvanChuyen(IvanChuyen ivanChuyen) {
        this.ivanChuyen = ivanChuyen;
    }

    public IThanhToan getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(IThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }
    public void inds(){
        list.forEach(t->System.out.println(t.toString()));
    }
    public int Sumgiohang(){
        int sum=0;
        for(MatHang s:list)
            sum+=s.getDongia()*s.getSoluong();
        return sum;
    }
    public int giamgia(){
        int t=Sumgiohang();
        int m = (int) (t*0.1);
        if(t>100000) {
            return t - m;
        }else return t;
    }
    public int ttoan(){
        int t=giamgia();
        return (int)thanhToan.tinhtoan(t);
    }
    public int vanchuyen(){
        int t=ttoan();
        return ivanChuyen.vanchuyen(t);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MatHang mh = new MatHang("tv",6,200000);
        MatHang nv = new MatHang("tl",2,2000);
        GioHang gioHang = new GioHang();
        gioHang.them(mh);
        gioHang.them(nv);
        gioHang.inds();
        System.out.println("tong cua gio hang la:"+gioHang.Sumgiohang());
        gioHang.setThanhToan(new TTCod());
        gioHang.setIvanChuyen(new GHTK());
        System.out.println("gio hang duoc giam gia la:"+gioHang.giamgia());
        System.out.println("so tien can phai thanh toan:"+gioHang.ttoan());
        System.out.println("so tien van chuyen"+gioHang.vanchuyen());
    }
}
