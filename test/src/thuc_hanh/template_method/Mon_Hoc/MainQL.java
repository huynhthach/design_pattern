package thuc_hanh.template_method.Mon_Hoc;

public class MainQL {
    public static void main(String[] args) {
        EntityDB<SinhVien> sinhVienEntityDB = new SinhVienDb();
        EntityDB<MonHoc> monHocEntityDB = new MonHocDB();
        sinhVienEntityDB.Add(new SinhVien(1,"long","24/11/2002","nha trang"));
        monHocEntityDB.Add(new MonHoc(2,"toan",3));
        sinhVienEntityDB.Inds();
        monHocEntityDB.Inds();
    }
}
