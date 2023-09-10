package behavior_pattern.Stragedy_pattern.baitapc3;
public class VNpays implements IThanhToan {

    @Override
    public double tinhtoan(double m) {
        double t=m*0.03;
        if(m>200000)
        return m-t;
        return m;
    }
}
