package creational.singleton.bt1;

public class singleton {
    private static singleton instance;
    int count =0;
    private singleton(){}
    public static singleton instance(){
        if(instance==null)
            instance=new singleton();
        return instance;
    }
    public void tang(){
        count++;
    }

    public int getCount() {
        return count;
    }

    public static singleton getInstance() {
        return instance;
    }

}
