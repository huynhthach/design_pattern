package creational.builder.buider_bt2;

public class MainBuilder {
    public static void main(String[] args) {
        MyStringbuilder myStringbuilder = new MyStringbuilder.builder()
                .string("long").addString("htl").addFloat(3F).addBool(true).build();
        System.out.println(myStringbuilder.toString());
    }
}
