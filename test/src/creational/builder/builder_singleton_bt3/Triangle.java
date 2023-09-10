package creational.builder.builder_singleton_bt3;

public class Triangle extends Shape{

    public Triangle(String paper, String brush, String frame) {
        super(paper, brush, frame);
    }

    @Override
    public String draw() {
        return "Triangle="+"\npaper:"+paper+
                "\nbrush:"+brush+
                "\nframe:"+frame;
    }
}
