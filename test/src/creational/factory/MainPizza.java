package creational.factory;

import static creational.factory.PizzaType.mamtom;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new VnPizza();
        Pizza pizza=pizzaStore.order(mamtom);
        System.out.println(pizza.toString());
    }
}
