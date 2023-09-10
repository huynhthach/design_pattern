package thuc_hanh.observer.Game;

public class DrashBoard implements PlayerData.I_Player{
    PlayerData playerData;
    public DrashBoard(PlayerData playerData){
        this.playerData=playerData;
        playerData.attach(this);
    }
    public void huydangky(){
        playerData.dettach();
    }
    @Override
    public void nhanthongbao() {
        System.out.println("thời gian còn lại của người chơi để hồi sinh là "+playerData.thoiGian);
        System.out.println("mạng còn lại là "+playerData.countDown);
        System.out.println("điểm đạt được là "+playerData.grade);
    }
}
