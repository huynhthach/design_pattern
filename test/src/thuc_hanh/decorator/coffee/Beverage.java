package thuc_hanh.decorator.coffee;

public abstract class Beverage {
    String descreption;

    public Beverage(String descreption) {
        this.descreption = descreption;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "descreption='" + descreption + '\'' +
                '}';
    }

    public abstract String getDescription();
    public abstract double cost();
}
