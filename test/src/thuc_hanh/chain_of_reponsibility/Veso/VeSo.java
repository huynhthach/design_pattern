package thuc_hanh.chain_of_reponsibility.Veso;

import java.util.Arrays;

public class VeSo implements I_DoVeSo {
    I_DoVeSo veSo;
    String tengiai;
    String[] sotrungthuong;

    public VeSo(String[] veso,String tengiai) {
        this.tengiai=tengiai;
        this.sotrungthuong = veso;
    }

    @Override
    public I_DoVeSo next(I_DoVeSo veSo) {
        this.veSo = veSo;
        return veSo;
    }

    @Override
    public String kiemtragiai(String chuoi) {
        for(int i=0;i<sotrungthuong.length;i++)
            if(chuoi.endsWith(sotrungthuong[i]))
                return "ban da trung giai " + tengiai +" voi ma so " + chuoi;
        if(veSo!=null)
            return veSo.kiemtragiai(chuoi);
        else
            return "trúng gió";
    }
}
