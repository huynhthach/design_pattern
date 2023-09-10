package creational.builder.buider_bt2;

public class MyStringbuilder {
    private String str;
    private MyStringbuilder(builder b){
        this.str=b.str;
    }

    @Override
    public String toString() {
        return str;
    }

    public static class builder{
        String str;
        public builder string(String str){
            this.str=str;
            return this;
        }
        public builder addString(String s){
            this.str+=s;
            return this;
        }
        public builder addFloat(Float f){
            this.str+=f;
            return this;
        }
        public builder addBool(Boolean bl){
            this.str+=bl;
            return this;
        }
        public MyStringbuilder build(){ return new MyStringbuilder(this);}
    }
}
