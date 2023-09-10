package thuc_hanh.decorator.Tokenize;

import java.util.*;

public class LoaiBoStopWord extends TokenizeDecorator{
    List<String> dsTuCanLoaiBo = Arrays.asList("va","hoac","thi");

    public LoaiBoStopWord(Tokenize tokenize) {
        super(tokenize);
    }

    @Override
    List<String> tokenize() {
        var token = tokenize.tokenize();
        token.removeAll(dsTuCanLoaiBo);
        return token;
    }
}
