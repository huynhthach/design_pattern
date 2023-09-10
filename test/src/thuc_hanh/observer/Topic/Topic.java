package thuc_hanh.observer.Topic;
import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<I_Topic> topicsopic = new ArrayList<>();
    private List<String> messages = new ArrayList<>();
    public void attach(I_Topic iTopic){
        topicsopic.add(iTopic);
    }
    public void dettach(I_Topic iTopic){
        topicsopic.remove(iTopic);
    }
    public void addMessage(String message) {
        messages.add(message);
    }
    public void updateMessage(int index, String message) {
        messages.set(index, message);
    }
    public void notifyer(){
        for(Topic.I_Topic o:topicsopic)
            o.updatetopic(messages);
    }
    public static interface I_Topic{
        void updatetopic(List<String> messages);
    }
}
