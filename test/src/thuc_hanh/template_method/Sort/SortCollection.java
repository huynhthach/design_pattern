package thuc_hanh.template_method.Sort;

import java.util.ArrayList;
import java.util.List;

public abstract class SortCollection<T> {
    public abstract int compare(T t1,T t2);

    public void Sort(List<T> lists){
        lists.sort((o1, o2) -> compare(o1,o2));
    }
}
