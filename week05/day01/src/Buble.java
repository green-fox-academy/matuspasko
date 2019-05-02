public class Buble {
    public static void main(String[] args) {
        int cisla[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int a, b, t;
        int velikost;
        velikost = 10; //pocet tridenych prvku

        //zobrazi puvodni pole
        System.out.println("Puvodni pole: ");
        for (int i = 0; i < velikost; i++) {
            System.out.println(" " + cisla[i]);
            System.out.println();
        }

        //toto je algoritmus bubble sort
        for (a = 1; a < velikost; a++) {
            for (b = velikost - 1; b >= a; b--) {
                if (cisla[b - 1] > cisla[b]) {  // pri nespravnem poradi
                    //vymeni prvky
                    t = cisla[b - 1];
                    cisla[b - 1] = cisla[b];
                    cisla[b] = t;
                }
            }
            //zobrazi setridene pole
            System.out.print("Setridene pale:");
            for (int i = 0; i < velikost; i++) {
                System.out.print(" " + cisla[i]);
                System.out.println();
            }
        }
    }
}


