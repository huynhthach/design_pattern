package thuc_hanh.observer.Button;

public class Button {
    I_Button iButton;
    public void attach(I_Button iButton){
        this.iButton=iButton;
    }
    public void dettach(){
        this.iButton=null;
    }
    public void notifyer(){
        iButton.updateActivity();
    }
    public static interface I_Button{
        void updateActivity();
    }
}
