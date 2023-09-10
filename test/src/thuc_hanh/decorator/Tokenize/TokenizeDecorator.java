package thuc_hanh.decorator.Tokenize;

import java.util.List;

public class TokenizeDecorator extends Tokenize{
    Tokenize tokenize;

    public TokenizeDecorator(Tokenize tokenize) {
        this.tokenize = tokenize;
    }

    @Override
    List<String> tokenize() {
        return tokenize.tokenize();
    }
}
