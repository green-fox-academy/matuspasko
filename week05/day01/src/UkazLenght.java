public class UkazLenght {
    public static void main(String[] args) {
        int seznam[] = new int[10];
        int cisla[] = {1, 2, 3};
        int tabulka[][] = {  // tabulka s promennou delkou
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        System.out.println("Hodnota lenght pole seznam: " + seznam.length);
        System.out.println("Hodnota lenght pole cisla: " + cisla.length);
        System.out.println("Hodnota lenght pole tabulka: " + tabulka.length);
        System.out.println("Hodnota lenght prvku tabulka: " + tabulka[0].length);
        System.out.println("Hodnota lenght prvku tabulka: " + tabulka[1].length);
        System.out.println("Hodnota lenght prvku tabulka: " + tabulka[2].length);
        System.out.println();

        // inicializuje seznam pomaci promenne lenght
        for (int i = 0; i < seznam.length; i++)
            seznam[i] = i * i;

        System.out.print("Pole seznam: ");
        // nyni pomoci promenne lenght zobrazi pole seznam
        for (int i = 0; i < seznam.length; i++)
            System.out.print(seznam[i] + " ");
        System.out.println();
    }

}
