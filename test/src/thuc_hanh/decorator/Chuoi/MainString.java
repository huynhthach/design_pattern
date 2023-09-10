package thuc_hanh.decorator.Chuoi;

public class MainString {
    public static void main(String[] args) {
        Post post = new BasicPost();
        post.setContent("alo alo");
        post = new WordCountDecorator(post);
        post = new PreviewDecorator(post);
        post = new HagTagDecorator(post);
        System.out.println(post.getContent());
    }
}
