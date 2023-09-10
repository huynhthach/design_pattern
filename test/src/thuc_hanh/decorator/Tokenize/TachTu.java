package thuc_hanh.decorator.Tokenize;
import java.util.Arrays;
import java.util.List;

public class TachTu extends Tokenize{
    String s;

    public TachTu(String s) {
        this.s = s;
    }

    @Override
    List<String> tokenize() {
        return Arrays.asList(s.split(" "));
    }

}
