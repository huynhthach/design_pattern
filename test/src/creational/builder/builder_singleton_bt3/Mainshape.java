package creational.builder.builder_singleton_bt3;

import static creational.builder.builder_singleton_bt3.ShapeType.Rectangle;
import static creational.builder.builder_singleton_bt3.ShapeType.Triangle;

public class Mainshape {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.createShape(Rectangle);
        System.out.println(shape.draw());
    }
}
