package thuc_hanh.observer.Topic;

import java.util.List;

public class ThanhVienB implements Topic.I_Topic{
    Topic topic;
    public ThanhVienB(Topic topic){
        this.topic=topic;
        topic.attach(this);
    }
    public void huydangky(){
        topic.dettach(this);
    }
    @Override
    public void updatetopic(List<String> messages) {
            for(int i=0;i<messages.size();i++){
                System.out.println("messages "+""+(i+1)+":"+messages.get(i));
            }
    }
}
