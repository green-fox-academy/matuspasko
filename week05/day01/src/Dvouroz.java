public class Dvouroz {
    public static void main(String[] args) {
        int t, i;
        int tabulka[][] = new int[3][4];

        for (t = 0; t < 3; ++t){
            for (i = 0; i < 4; ++i){
                tabulka[t][i] = (t * 4) + i + 1;
                System.out.print(tabulka[t][i] + "  ");
            }
            System.out.println();
        }
    }
}
