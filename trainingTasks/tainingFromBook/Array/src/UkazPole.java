// Toto je ukazka jednorozmerneho pole
public class UkazPole {
    public static void main(String[] args) {

        int ukazka[] = new int[10];
        int i;

        for (i = 0; i < 10; i++) {
            ukazka[i] = i;
        }
        for (i = 0; i < 10; i++) {
            System.out.println("Toto je prvek ukazka [" + i + "] " + ukazka[i]);
        }
    }
}

