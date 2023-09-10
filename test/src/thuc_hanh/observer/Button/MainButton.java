package thuc_hanh.observer.Button;

public class MainButton {
    public static void main(String[] args) {
        Button button = new Button();
        Activity activity = new Activity(button);
        Activity activity1 = new Activity(button);
        button.notifyer();
        button.notifyer();
    }
}
