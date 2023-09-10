package thuc_hanh.decorator.coffee;

public class DarkRoast extends Beverage{


    public DarkRoast(String descreption) {
        super(descreption);
    }

    @Override
    public String getDescription() {
        return descreption;
    }

    @Override
    public double cost() {
        return 10000;
    }
}
