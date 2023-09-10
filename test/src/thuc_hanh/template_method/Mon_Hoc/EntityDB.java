package thuc_hanh.template_method.Mon_Hoc;

import java.util.ArrayList;
import java.util.List;

public abstract class EntityDB<T> {
    List<T> List = new ArrayList<>();

    public abstract int getKey(T t);
    T findById(int id){
        for(var t: List){
            if(getKey(t)==id)
                return t;
        }
        return null;
    }
    public void Add(T t){
        for(var o:List){
            if(getKey(o)==getKey(t))
                return;
        }
        List.add(t);
    }
    public void Inds(){
        List.forEach(t -> System.out.println(t.toString()));
    }
    public void update(T t){
        for(int i=0;i<List.size();i++){
            if(getKey(List.get(i))==getKey(t)){
                List.set(i,t);
                return;
            }
        }
    }
    public void delete(int id){
        for(var t:List){
            if(getKey(t)==id){
                List.remove((t));
                return;
            }
        }
    }
}
