package thuc_hanh.decorator.Flutter;

public class MainWidget {
    public static void main(String[] args) {
        Flutter flutter = new Widget("Scafford");
        flutter = new Icon("child","column",flutter);
        System.out.println(flutter.show());
    }
}
