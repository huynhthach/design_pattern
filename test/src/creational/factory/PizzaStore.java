package creational.factory;
abstract public class PizzaStore {
        abstract protected Pizza createPizza(PizzaType type);
        public Pizza order(PizzaType type){
               Pizza pizza;
               pizza=createPizza(type);
               pizza.bake();
               pizza.box();
               pizza.cut();
               pizza.prepare();
               return pizza;
        }

}
