package thuc_hanh.template_method.sort2;

public class Product {
    String name;
    int price,quarity;

    public Product(String name, int price, int quarity) {
        this.name = name;
        this.price = price;
        this.quarity = quarity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuarity() {
        return quarity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quarity=" + quarity +
                '}';
    }
}
