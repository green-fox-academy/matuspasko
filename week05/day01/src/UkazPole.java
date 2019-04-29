public class UkazPole {
    public static void main(String[] args) {
        int ukazka[] = new int[10];
        int i;

        for (i = 0; i < 10; i = i + 1) {
            ukazka[i] = i;
        }
        for (i = 0; i < 10; i = i + 1) {
            System.out.println("Toto je prvek ukazka[" + i + "]:" + ukazka[i]);
        }
    }
}
