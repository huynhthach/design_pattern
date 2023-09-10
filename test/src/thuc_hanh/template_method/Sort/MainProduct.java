package thuc_hanh.template_method.Sort;

import java.util.ArrayList;
import java.util.List;

public class MainProduct {
    public static void main(String[] args) {
        Product product = new Product("kem",1000,2);
        Product product1 = new Product("aa",500,3);
        Product product24 = new Product("aa",50,3);
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product1);
        productList.add(product24);
        SortCollection<Product> collection = new SortByName();
        SortCollection<Product> collection1 = new SortByPrice();
        collection1.Sort(productList);
        productList.forEach(product2 -> System.out.println(product2.toString()));
    }
}
