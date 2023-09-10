package thuc_hanh.observer.tigia;

public class NhaDauTuB implements TiGia.I_Theodoitigia{
    TiGia t;
    public NhaDauTuB(TiGia t){
        this.t=t;
        t.attach(this);
    }
    public void huydangky(){
        t.detach(this);
    }
    @Override
    public void updatetigia(float delta) {
        if(delta<0)
            System.out.println("B Mua vao");
        else
            System.out.println("B ban ra");
    }
}
