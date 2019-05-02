public class MinMax2 {
    public static void main(String[] args) {
        int cisla[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int min, max;

        min = max =cisla[0];

        for (int i = 1; i < 10; i++){
            if (cisla[i] < min) min = cisla[i];
            if (cisla[i] > max) max = cisla[i];
        }
        System.out.println("Min. a max. hodnoty: " + min + " " + max);
    }
}
