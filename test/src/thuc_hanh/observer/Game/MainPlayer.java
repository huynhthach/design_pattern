package thuc_hanh.observer.Game;

public class MainPlayer {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData();
        DrashBoard drashBoard = new DrashBoard(playerData);
        playerData.setThoiGian(200);
        playerData.setCountDown(3);
        playerData.setGrade(1000);
        playerData.notifyer();
    }
}
