package behavior_pattern.Stragedy_pattern.baitapc3;
public class Ninjavan implements IvanChuyen{
    @Override
    public int vanchuyen(int v) {
        System.out.println("Van chuyen mat 5 ngay");
        return v+3000;
    }
}
