public class DruhaOdm {
    public static void main(String[] args) {
        double cislo, dodm , zchyba;

        for (cislo = 1.0; cislo < 100.0; cislo++){
            dodm = Math.sqrt(cislo);
            System.out.println("Druha odmocnina cisla " + cislo + " se rovna " + dodm);

            // vypocita zaokrouhlovaci chybu
            zchyba = cislo - (dodm * dodm);
            System.out.println("Zaokrouhlovaci chyba je " + zchyba);
            System.out.println();
        }
    }
}
