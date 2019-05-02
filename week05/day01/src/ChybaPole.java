public class ChybaPole {
    public static void main(String[] args) {
        int ukazka[] = new int[10];
        int i;

        //generuje preteceni pole
        for (i = 0; i < 100; i = i+1)   //ak by ti miesto 100 bola 10 tak to ide
            ukazka[i] = i;
    }
}
