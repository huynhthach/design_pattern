package thuc_hanh.decorator.Flutter;

public abstract class WidgetDecorator extends Flutter{
    Flutter flutter;
    public WidgetDecorator(String widget) {
        super(widget);
    }

    @Override
    public String show() {
        return flutter.show();
    }
}
