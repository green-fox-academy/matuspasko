public class GalNaLitTabulka {
    public static void main(String[] args) {
        double galony, litry;
        int citac;

        citac = 0;
        for (galony = 1; galony <= 100; galony++) {
            litry = galony * 3.7854;      // prevedieme hodnotu na litre
            System.out.println(galony + "galonu se rovna " + litry + " litru.");

            citac++;
            // po kazdem 10. radku vypise prazdny radek
            if (citac == 10) {
                System.out.println();
                citac = 0; // vynuluje citac radku
            }
        }
    }
}
