package kontcis;

public class UkazParam {
    public static void main(String[] args) {
        KontCis e = new KontCis();

        if (e.jeSude(10)) System.out.println("Cislo 10 je sude");
        if (e.jeSude(9)) System.out.println("Cislo 9 je sude");
        if (e.jeSude(8)) System.out.println("Cislo 8 je sude");

    }
}
