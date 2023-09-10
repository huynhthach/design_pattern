package thuc_hanh.template_method.Sort;

public class SortByPrice extends SortCollection<Product>{
    @Override
    public int compare(Product t1, Product t2) {
        if(t1.getPrice()<t2.getPrice())
            return -1;
        else if (t1.getPrice()==t2.getPrice())
            return 0;
        else
        return 1;
    }
}
