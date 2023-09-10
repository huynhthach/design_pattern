package creational.factory;

public class PizzaMamNem extends  Pizza{
    @Override
    void prepare() {
        builder.append("ec ec");
    }

    @Override
    void cut() {
        builder.append("ssss");
    }

    @Override
    void bake() {
        builder.append("aaaaa");
    }

    @Override
    void box() {
        builder.append("segs");
    }
}
