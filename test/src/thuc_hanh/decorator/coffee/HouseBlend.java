package thuc_hanh.decorator.coffee;

public class HouseBlend extends Beverage{


    public HouseBlend(String descreption) {
        super(descreption);
    }

    @Override
    public String getDescription() {
        return descreption;
    }

    @Override
    public double cost() {
        return 20000;
    }
}
