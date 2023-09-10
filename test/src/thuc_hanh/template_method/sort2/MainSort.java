package thuc_hanh.template_method.sort2;

import java.util.ArrayList;
import java.util.List;

public class MainSort {
    public static void main(String[] args) {
        Product product = new Product("bút",10000,2);
        Product product1 = new Product("ass",4000,2);
        List<Product> list = new ArrayList<>();
        list.add(product);
        list.add(product1);
        SortCollection<Product> sortCollection = new SortProductName();
        sortCollection.sort(list);
        list.forEach(product2 -> System.out.println(product2.toString()));
    }
}
