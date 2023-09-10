package creational.singleton.bt1;

import creational.singleton.bt1.singleton;

public class mainsingelton {
    public static void main(String[] args) {
        singleton s1 = singleton.instance();
        singleton s2 = singleton.instance();
        s1.tang();
        System.out.println("s1:"+s1.getCount());
    }
}
