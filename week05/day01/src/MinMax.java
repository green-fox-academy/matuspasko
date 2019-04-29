public class MinMax {
    public static void main(String[] args) {
        int cisla[] = new int[10];
        int min, max;

        cisla[0] = 99;
        cisla[1] = -10;
        cisla[2] = 100123;
        cisla[3] = 18;
        cisla[4] = -978;
        cisla[5] = 5623;
        cisla[6] = 463;
        cisla[7] = -9;
        cisla[8] = 287;
        cisla[9] = 49;

        min = max = cisla[0];
        for (int i = 1; i < 10; i++) {
            if (cisla[i] < min) min = cisla[i];
            if (cisla[i] > max) max = cisla[i];
        }

        System.out.println("Min. a max. hodnoty: " + min + " " + max);
    }
}

