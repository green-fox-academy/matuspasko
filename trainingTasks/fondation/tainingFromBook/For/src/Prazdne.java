// Casti cyklu for mohou bit prazdne
public class Prazdne {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; ) {
            System.out.println("Pruchod c. " + i);
            i++; // inkrementuje ridici promennou cyklu
        }
    }
}
