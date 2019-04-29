package delitel;

public class jeDelitel {
    public static void main(String[] args) {
        Delitel x = new Delitel();

        if (x.jeDelitel(2, 20)) System.out.println("Cislo 2 je delitelem. ");
        if (x.jeDelitel(3, 20)) System.out.println("Tento text se nezobrazi. ");
    }
}
