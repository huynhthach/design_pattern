package creational.builder.builder_bt5;
import java.util.ArrayList;
public class SachBuilder {
    String title,author;
    int part;
    ArrayList<String> pagenum;
    public SachBuilder(builder b){
        this.title=b.title;
        this.author=b.author;
        this.pagenum=b.pagenum;
        this.part=b.part;
    }

    @Override
    public String toString() {
        return "SachBuilder:" +
                "title=" + title +
                "\n author=" + author +
                "\n pagenum=" + pagenum +
                "\n part=" + part;
    }

    public static class builder{
        String title,author;
        //int pagenum,part;
        ArrayList<String> pagenum = new ArrayList<>();
        int part;
        public builder buildtitle(String title){
            this.title=title;
            return this;
        }
        public builder buildauthor(String author){
            this.author=author;
            return this;
        }
        public builder buildpagenum(String s){
            pagenum.add(s);
            return this;
        }
        public builder buildpart(int  part){
            this.part=part;
            return this;
        }
        public SachBuilder build(){ return new SachBuilder(this);}
    }
}
