public class BezeZmeny {
    public static void main(String[] args) {
        int cisla[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : cisla) {
//            System.out.print(x + " ");
            x = x * 10; // v poli cisla se nepropoji
            System.out.print(x + " "); // ak chcem vztlacit vysledok nasobenia musim to tlacit v for funkcii
        }
        System.out.println();
//        for (int x : cisla) {
//            System.out.print(x + " ");
//        }
//
//        System.out.println();
    }
}


