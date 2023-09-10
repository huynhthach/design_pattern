package duck;

public class VitBau extends Duck{

    @Override
    public void display() {
        System.out.println("toi la vit bau");
        performFlY();
        performQuack();
        swim();
    }
}
