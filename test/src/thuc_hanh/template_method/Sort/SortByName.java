package thuc_hanh.template_method.Sort;


import java.util.ArrayList;
import java.util.List;

public class SortByName extends SortCollection<Product>{
    @Override
    public int compare(Product t1, Product t2) {
        return t1.name.compareTo(t2.name);
    }
}
