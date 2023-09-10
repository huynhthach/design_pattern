package thuc_hanh.template_method.sort2;

public class SortProductName extends SortCollection<Product>{
    @Override
    public int compare(Product t1, Product t2) {
        return t1.name.compareTo(t2.name);
    }
}
