package duck;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    public abstract void display();
    public void performQuack(){
        System.out.println(quackBehavior.quack());
    }
    public void performFlY(){
        System.out.println(flyBehavior.fly());
    }
    public void swim(){
        System.out.println("tum` tum`");
    }
    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }
    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public IQuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
