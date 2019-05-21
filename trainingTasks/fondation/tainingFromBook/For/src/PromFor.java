// Deklaruje ridici promennou cyklu uvnitr prilazu for
public class PromFor {
    public static void main(String[] args) {
        int soucet = 0;
        int fakt = 1;

        // vypocita faktorial cisel do 5
        for (int i = 1; i <= 5; i++) {
            soucet += i; // promenna i je znama v ramci cyklu
            fakt *= i;
        }
        // zde vsak promenna i neni definovana
        System.out.println(" Soucet se rovna " + soucet);
        System.out.println(" Fakrorial de rovna " + fakt);
    }
}

