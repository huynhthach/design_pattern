package thuc_hanh.chain_of_reponsibility.Veso;

public class MainVeSo {
    public static void main(String[] args) {
        String[] giai8 = {"12","45","78"};
        String[] giai7 = {"123","456","789"};
        String[] giai6 = {"1234","4567","6789"
                          ,"1232","4564","7895"
                          ,"1233","4565","7897"};
        String[] giai5 = {  "59796" +
                            "94210" +
                            "47286" +
                            "83380" +
                            "36264" +
                            "49325" +
                            "96527","41819" +
                                    "69306" +
                                    "16923" +
                                    "83583" +
                                    "98283" +
                                    "34413" +
                                    "28544","38652" +
                                            "95763" +
                                            "57107" +
                                            "49612" +
                                            "49220" +
                                            "01637" +
                                            "32064"};
        String[] giai4 = {"50738","32944","10570"
                ,"93375","16749","99720"};
        String[] giai3 = {"47762","47762","71117"};
        String[] giai2 = {"45027","22277","03192"};
        String[] giai1 = {"44098","22347","032982"};
        String[] giaidb = {"036398"};
        I_DoVeSo G8 = new VeSo(giai8,"giai 8");
        I_DoVeSo G7 = new VeSo(giai7,"giai 7");
        I_DoVeSo G6 = new VeSo(giai6,"giai 6");
        I_DoVeSo G5 = new VeSo(giai5,"giai 5");
        I_DoVeSo G4 = new VeSo(giai4,"giai 4");
        I_DoVeSo G3 = new VeSo(giai3,"giai 3");
        I_DoVeSo G2 = new VeSo(giai2,"giai 2");
        I_DoVeSo G1 = new VeSo(giai1,"giai 1");
        I_DoVeSo GDB = new VeSo(giaidb,"giai dac biet");
        G8.next(G7).next(G6).next(G5).next(G4).next(G3).next(G2).next(G1).next(GDB);
        System.out.println(G8.kiemtragiai("036397"));
    }
}
