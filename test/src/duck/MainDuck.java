package duck;

public class MainDuck {
    public static void main(String[] args) {
        Duck vb = new VitBau();
        vb.setFlyBehavior(new RoundFly());
        vb.setQuackBehavior(new SQuack());
        vb.display();
        vb.setQuackBehavior(new MQuack());
        vb.display();
    }
}
