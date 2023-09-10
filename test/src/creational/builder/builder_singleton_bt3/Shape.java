package creational.builder.builder_singleton_bt3;

public abstract class Shape {
    String paper,brush,frame;

    public Shape(String paper, String brush, String frame) {
        this.paper = paper;
        this.brush = brush;
        this.frame = frame;
    }
    public abstract String draw();
}
