package creational.factory;

public class MamTomPizza extends Pizza{

    @Override
    void prepare() {
        builder.append("MamTom and thit cay`\n");
    }

    @Override
    void cut() {
        builder.append("cat 6 chieu");
    }

    @Override
    void bake() {
        builder.append("nuong 6 tieng");
    }

    @Override
    void box() {
        builder.append("dong hop 20k");
    }
}
