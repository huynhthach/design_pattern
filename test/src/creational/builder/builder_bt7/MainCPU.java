package creational.builder.builder_bt7;

public class MainCPU {
    public static void main(String[] args) {
        Computer c = new Computer.builder().buildCPU("core i7 8650u")
                .buildRam("32gb").buildstorage("12ssd").buildscreen("14inch").build();
        System.out.println(c.toString());

    }
}
