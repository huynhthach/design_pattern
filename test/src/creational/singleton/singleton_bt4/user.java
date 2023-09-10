package creational.singleton.singleton_bt4;

public class user {

    public void vote(candidate c){
        election e = election.getElect();
        if(c==candidate.donal_trump){
            e.vote(c);
        }else
            e.vote(c);
    }
}
