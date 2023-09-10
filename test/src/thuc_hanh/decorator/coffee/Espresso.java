package thuc_hanh.decorator.coffee;

public class Espresso extends Beverage{


    public Espresso(String descreption) {
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
