package thuc_hanh.template_method.Mon_Hoc;

public class MonHoc {
    String tenMH;
    int soTC,maMH;

    public MonHoc(int maMH, String tenMH, int soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }

    public int getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "maMH='" + maMH + '\'' +
                ", tenMH='" + tenMH + '\'' +
                ", soTC=" + soTC +
                '}';
    }
}
