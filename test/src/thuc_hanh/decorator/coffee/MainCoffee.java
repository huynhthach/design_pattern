package thuc_hanh.decorator.coffee;

public class MainCoffee {
    public static void main(String[] args) {
        Beverage b = new HouseBlend("ca phe goi");
        b = new Milk(b,"them sua");
        b = new Mocha(b,"them mocha");
        System.out.println(b.cost());
        System.out.println(b.getDescription());
    }
}
