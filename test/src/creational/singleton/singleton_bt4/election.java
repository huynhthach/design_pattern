package creational.singleton.singleton_bt4;

public class election {
    private static election elect;
    int donal_trump=0,joe_biden=0;
    private election(){}
    public void vote(candidate c){
        if(c==candidate.donal_trump){
            donal_trump++;
        }else joe_biden++;
    }
    public static election getElect(){
        if(elect==null) {
            elect=new election();
        }
        return elect;
    }

    public int getDonal_trump() {
        return donal_trump;
    }

    public int getJoe_biden() {
        return joe_biden;
    }
}
