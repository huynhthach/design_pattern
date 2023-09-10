package thuc_hanh.observer.streamdata;

public class MonHoc {
    String maMH,tenMH,soTC;

    public MonHoc(String maMH, String tenMH, String soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getSoTC() {
        return soTC;
    }

    @Override
    public String toString() {
        return  "mã môn học=" + maMH + '\n' +
                "tên môn học=" + tenMH + '\n' +
                "số tín chỉ=" + soTC + '\n';
    }
}
