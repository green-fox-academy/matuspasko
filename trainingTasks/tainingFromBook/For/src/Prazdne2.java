// Dalsi redukce cyklu for
public class Prazdne2 {
    public static void main(String[] args) {
        int i;

        i = 0; //presunuje inicializaci mimo cyklus
        for (; i < 10; ) {
            System.out.println("Pruchos c. " + i);
            i++; // inkrementuje ridici promennou cyklu
        }
    }
}

// for ( ;; ) // bude to nekonecny cyklus