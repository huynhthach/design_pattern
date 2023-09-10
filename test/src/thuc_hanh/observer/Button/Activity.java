package thuc_hanh.observer.Button;

public class Activity implements Button.I_Button{
    Button button;
    int n;
    public Activity(Button button){
        this.button=button;
        button.attach(this);
    }
    public void huydangky(){
        button.dettach();
    }
    @Override
    public void updateActivity() {
        n++;
            System.out.println("bạn click lần thứ " + n);
    }
}
