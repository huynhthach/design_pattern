package creational.builder.builder_singleton_bt3;

public class Circe extends Shape{
    public Circe(String paper, String brush, String frame) {
        super(paper, brush, frame);
    }

    @Override
    public String draw() {
        return "Circe="+"\npaper:"+paper+
                "\nbrush:"+brush+
                "\nframe:"+frame;
    }
}
