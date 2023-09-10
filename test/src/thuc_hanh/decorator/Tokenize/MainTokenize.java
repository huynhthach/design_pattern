package thuc_hanh.decorator.Tokenize;

public class MainTokenize {
    public static void main(String[] args) {
        Tokenize tokenize = new TachTu("va 1 2 3");
        tokenize = new LoaiBoStopWord(tokenize);
        System.out.println(tokenize.tokenize());
    }
}
