package thuc_hanh.template_method.sort2;

public class SortProductPrice extends SortCollection<Product>{
    @Override
    public int compare(Product t1, Product t2) {
        if(t1.getPrice()<t2.getPrice())
            return 1;
        if(t1.getPrice()>t2.getPrice())
            return -1;
        else
            return 0;
    }
}
