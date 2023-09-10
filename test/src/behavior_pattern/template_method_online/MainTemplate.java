package behavior_pattern.template_method_online;

public class MainTemplate {
    public static void main(String[] args) {
        ObjectDB<MySinhVien> objectDB = new MySinhVienDB();
        objectDB.addSV(new MySinhVien(1234,"long","24","nhatrang"));
        objectDB.Inds();
    }
}
