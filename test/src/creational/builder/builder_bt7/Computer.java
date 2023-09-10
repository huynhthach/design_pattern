package creational.builder.builder_bt7;

public class Computer {
    String CPU,RAM,storage,screen;
    private Computer(builder b){
        this.CPU=b.CPU;
        this.RAM=b.RAM;
        this.storage=b.storage;
        this.screen=b.screen;
    }

    @Override
    public String toString() {
        return "Computer:" +
                "CPU='" + CPU + '\n' +
                ", RAM='" + RAM + '\n' +
                ", storage='" + storage + '\n' +
                ", screen='" + screen + '\n';
    }

    public static class builder{
         private String CPU,RAM,storage,screen;
         public builder buildCPU(String CPU){
             this.CPU=CPU;
             return this;
         }
         public builder buildRam(String RAM){
             this.RAM=RAM;
             return this;
         }
         public builder buildstorage(String storage){
             this.storage=storage;
             return this;
         }
         public builder buildscreen(String screen){
             this.screen=screen;
             return this;
         }
        public Computer build(){
            return new Computer(this);
        }
    }
}
