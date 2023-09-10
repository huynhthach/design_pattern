package behavior_pattern.template_method_online;

import java.util.ArrayList;
import java.util.List;

public abstract class ObjectDB<T> {
    List<T> List = new ArrayList<>();

    public abstract int getId(T t);

    T findById(int id){
        for(var t: List){
            if(getId(t)==id)
                return t;
        }
        return null;
    }
    public void addSV(T t){
        for(var o:List){
            if(getId(o)==getId(t))
                return;
        }
        List.add(t);
    }
    public void Inds(){
        List.forEach(t -> System.out.println(t.toString()));
    }
    public void updateSV(T t){
        for(int i=0;i<List.size();i++){
            if(getId(List.get(i))==getId(t)){
                List.set(i,t);
                return;
            }
        }
    }
    public void deleteSV(int id){
        for(var t:List){
            if(getId(t)==id){
                List.remove((t));
                return;
            }
        }
    }

}
