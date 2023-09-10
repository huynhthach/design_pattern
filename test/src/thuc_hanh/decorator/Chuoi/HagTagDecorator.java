package thuc_hanh.decorator.Chuoi;

import java.util.Arrays;
import java.util.List;

public class HagTagDecorator extends PostDecorator{
    String[] hagtag = {"#facebook","#instagram"};
    public HagTagDecorator(Post post) {
        super(post);
    }

    @Override
    String getContent() {
        return super.getContent()+ Arrays.toString(hagtag);
    }

    @Override
    void setContent(String content) {
        super.setContent(content);
    }
}
