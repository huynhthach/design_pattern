package creational.builder.builder_singleton_bt3;

public class ShapeFactory {
    public Shape createShape(ShapeType type){
        Shape shape = null;
        if(type==ShapeType.Rectangle){
            return Rectagle.getRectagle();
        }else if (type==ShapeType.Triangle){
            return new Triangle("a4","blue","30");
        }else if (type==ShapeType.Circe){
            return new Circe("a3","black","10");
        }
        return null;
    }
}
