package thuc_hanh.decorator.Flutter;

public abstract class Flutter {
    String Widget;

    public Flutter(String widget) {
        Widget = widget;
    }

    @Override
    public String toString() {
        return "Flutter{" +
                "Widget='" + Widget + '\'' +
                '}';
    }
    public abstract String show();
}
