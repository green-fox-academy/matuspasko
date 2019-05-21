public class ForEachBreak {
    public static void main(String[] args) {
        int cisla[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soucet = 0;

        //Zobrazi a secte hodnoty pomoci cyklu for ve stylu for-each.
        for (int x : cisla) {
            System.out.println("Hodnota se rovna: " + x);
            soucet += x;    // soucet = soucet + x , zabezpeci to pripocitanie k vysledku
            if (x == 5) break; // zastavi po dosazeni hodnoty 5

        }
        System.out.println("Soucet hodnot: " + soucet);
    }
}

