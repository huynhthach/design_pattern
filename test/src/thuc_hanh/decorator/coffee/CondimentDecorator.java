package thuc_hanh.decorator.coffee;

public abstract class CondimentDecorator extends Beverage{
    Beverage component;

    public CondimentDecorator(String descreption) {
        super(descreption);
    }


    @Override
    public String getDescription() {
        return component.getDescription();
    }

    @Override
    public double cost() {
        return component.cost();
    }
}
