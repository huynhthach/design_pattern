package creational.singleton.singleton_bt4;

import static creational.singleton.singleton_bt4.candidate.donal_trump;

public class mainvote {
    public static void main(String[] args) {
        election e = election.getElect();
        election g = election.getElect();
        user u = new user();
        user s = new user();
        u.vote(donal_trump);
        System.out.println("vote:"+e.getDonal_trump());
        s.vote(donal_trump);
        System.out.println("vote 2:"+g.getDonal_trump());
        //System.out.println("vote:"+e.getJoe_biden());

    }
}
