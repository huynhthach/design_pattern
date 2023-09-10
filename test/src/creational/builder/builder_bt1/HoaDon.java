package creational.builder.builder_bt1;

import java.util.ArrayList;

public class HoaDon {
    String mahoadon,ngayban,tenkhachhang;
    ArrayList<CTHD> cthds;
    public HoaDon(builder b){
        this.mahoadon=b.mahoadon;
        this.ngayban=b.ngayban;
        this.tenkhachhang=b.tenkhachhang;
        this.cthds=b.cthds;
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("mã hoá đơn:").append(mahoadon)
                .append("\n")
                .append("ngày bán").append(ngayban)
                .append("\n")
                .append("tên khách hàng").append(tenkhachhang)
                .append("\n");
        for (CTHD cthd:cthds){
            s.append("chi tiết hoá đơn:").append(cthd);
        }
        return s.toString();
    }

    public static class builder{
            String mahoadon,ngayban,tenkhachhang;
            ArrayList<CTHD> cthds = new ArrayList<>();
            public builder buildmahoadon(String mahoadon){
                this.mahoadon=mahoadon;
                return this;
            }
            public builder buildngayban(String ngayban){
                this.ngayban=ngayban;
                return this;
            }
            public builder buildtenkhachhang(String tenkhachhang){
                this.tenkhachhang=tenkhachhang;
                return this;
            }
            public builder buildcthd(CTHD cthd){
                cthds.add(cthd);
                return this;
            }

            public HoaDon build(){
                return new HoaDon(this);
            }
        }
}
