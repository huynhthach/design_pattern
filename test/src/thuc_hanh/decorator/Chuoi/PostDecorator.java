package thuc_hanh.decorator.Chuoi;

public abstract class PostDecorator extends Post{
    Post post;

    public PostDecorator(Post post) {
        this.post = post;
    }

    @Override
    String getContent() {
        return post.getContent();
    }

    @Override
    void setContent(String content) {
        post.setContent(content);
    }
}
