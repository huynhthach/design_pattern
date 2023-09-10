package behavior_pattern.Stragedy_pattern.baitapc1;

public class context {
    ITinh tinhtoan;
    public void tinh(float a,float b){
        System.out.println(tinhtoan.tinh(a,b));
    }
    public ITinh getTinhtoan() {
        return tinhtoan;
    }

    public void setTinhtoan(ITinh tinhtoan) {
        this.tinhtoan = tinhtoan;
    }

    public static void main(String[] args) {
        context cx = new context();
        cx.setTinhtoan(new Cong());
        cx.tinh(4,3);
    }
}
