package thuc_hanh.decorator.Chuoi;


public class WordCountDecorator extends PostDecorator{
    public WordCountDecorator(Post post) {
        super(post);
    }

    String count(){
        return String.valueOf(post.getContent().length());
    }


    @Override
    String getContent() {
        return super.getContent() + count();
    }

    @Override
    void setContent(String content) {
        super.setContent(content);
    }
}
