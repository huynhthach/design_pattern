package creational.builder.builder_singleton_bt3;

public class Rectagle extends Shape{
    private static Rectagle rectagle;

    private Rectagle(String paper, String brush, String frame) {
        super(paper, brush, frame);
    }
    public static Rectagle getRectagle(){
        if(rectagle==null) {
            rectagle=new Rectagle("a4","solid","1050px");
        }
        return rectagle;
    }
    @Override
    public String draw() {
        return "Rectagle="+"\npaper:"+paper+
                "\nbrush:"+brush+
                "\nframe:"+frame;
    }
}
