package thuc_hanh.decorator.coffee;

public class Milk extends CondimentDecorator{

    Beverage beverage;
    String desc;

    public Milk(Beverage beverage,String desc) {
        super(beverage.descreption);
        this.beverage = beverage;
        this.desc = desc;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ " "+this.desc;
    }

    @Override
    public double cost() {
        return 5000+beverage.cost();
    }
}
