package thuc_hanh.observer.Topic;

public class MainToPic {
    public static void main(String[] args) {
        Topic topic = new Topic();
        ThanhVienA thanhVienA = new ThanhVienA(topic);
        ThanhVienB thanhVienB = new ThanhVienB(topic);
        topic.addMessage("alo alo 1234");
        topic.notifyer();
        topic.addMessage("alo alo 134");
        topic.notifyer();
    }
}
