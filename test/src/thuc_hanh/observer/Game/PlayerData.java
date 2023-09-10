package thuc_hanh.observer.Game;

public class PlayerData {
    int thoiGian;
    int countDown;
    int grade;
    I_Player iPlayer;

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
    }

    public void setCountDown(int countDown) {
        this.countDown = countDown;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void attach(I_Player player){
        this.iPlayer=player;
    }
    public void dettach(){
        this.iPlayer=null;
    }
    public void notifyer(){
        iPlayer.nhanthongbao();
    }

    public static interface I_Player{
        void nhanthongbao();
    }
}
