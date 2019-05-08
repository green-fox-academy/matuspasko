public class ForEach2 {
    public static void main(String[] args) {
        int soucet = 0;
        int cislo[][] = new int[3][5];

        // poskytne poli cisla nejake hodnoty
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                cislo[i][j] = (i + 1) * (j + 1);

            }
        }
        // zobrazi a secte hodnoty pomoci cyklu for ve stylu for-each.
        for (int x[] : cislo) {
            for (int y : x) {
                System.out.println("Hodnota se rovna: " + y);
                soucet += y;
            }
        }
        System.out.println("Soucet hodnot: " + soucet);

    }
}

