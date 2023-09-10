package thuc_hanh.decorator.Flutter;

public class Icon extends WidgetDecorator{
    String child;
    String name;
    Flutter flutter;

    public Icon(String child, String name, Flutter flutter) {
        super(flutter.Widget);;
        this.child = child;
        this.name = name;
        this.flutter = flutter;
    }

    @Override
    public String show() {
        return flutter.show()+name+child;
    }
}
