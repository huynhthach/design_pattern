package thuc_hanh.decorator.Chuoi;

public class PreviewDecorator extends PostDecorator{
    public PreviewDecorator(Post post) {
        super(post);
    }

    String preview(){
        return post.getContent().substring(0,3);
    }
    @Override
    String getContent() {
        return super.getContent()+preview();
    }

    @Override
    void setContent(String content) {
        super.setContent(content);
    }
}
