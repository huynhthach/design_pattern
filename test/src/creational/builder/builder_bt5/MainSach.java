package creational.builder.builder_bt5;
public class MainSach {
    public static void main(String[] args) {
        SachBuilder builder = new SachBuilder.builder()
                .buildtitle("mắt biếc").buildauthor("nguyễn nhật ánh")
                .buildpagenum("chap 8").buildpart(7).build();
        System.out.println(builder.toString());
    }
}
