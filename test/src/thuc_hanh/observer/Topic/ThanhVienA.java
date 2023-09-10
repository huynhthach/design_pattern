package thuc_hanh.observer.Topic;

import java.util.List;

public class ThanhVienA implements Topic.I_Topic{
    Topic topic;
    public ThanhVienA(Topic topic){
        this.topic=topic;
        topic.attach(this);
    }
    public void huydangky(){
        topic.dettach(this);
    }
    @Override
    public void updatetopic(List<String> messages) {
        System.out.println(messages.get(messages.size()-1));
    }
}
