package creational.factory;

public class VnPizza extends PizzaStore{
    @Override
    protected Pizza createPizza(PizzaType type) {
        if(type==PizzaType.mamtom)
            return new MamTomPizza();
        if(type==PizzaType.mamnem)
            return new PizzaMamNem();
        return null;
    }
}
