package thuc_hanh.decorator.Chuoi;

public class BasicPost extends Post{
    String contents;

    @Override
    String getContent() {
        return contents;
    }

    @Override
    void setContent(String content) {
        contents = content;
    }
}
