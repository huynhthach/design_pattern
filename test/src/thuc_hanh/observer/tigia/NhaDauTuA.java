package thuc_hanh.observer.tigia;

public class NhaDauTuA implements TiGia.I_Theodoitigia{
    TiGia t;
    public NhaDauTuA(TiGia t){
        this.t=t;
        t.attach(this);
    }
    public void huydangky(){
        t.detach(this);
    }
    @Override
    public void updatetigia(float delta) {
        if(delta > 0)
            System.out.println("A mua vao");
        else
            System.out.println("A ban ra");
    }
}
