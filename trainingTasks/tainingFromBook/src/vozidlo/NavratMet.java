package vozidlo;

public class NavratMet {
    public static void main(String[] args) {
        Vozidlo minivan = new Vozidlo();
        Vozidlo sportak = new Vozidlo();

        double dojezd1, dojezd2;

        //priradi hodnotu polim v objektu minivan
        minivan.cestujuci = 7;
        minivan.litryNa100km = 10;
        minivan.objemNadrze = 60;

        // priradi hodnoti polim v objektu sportak
        sportak.objemNadrze = 50;
        sportak.litryNa100km = 20;
        sportak.cestujuci = 2 ;

        //zjisti hodnoty dojezdu
        dojezd1 = minivan.dojezd();
        dojezd2 = sportak.dojezd();

        System.out.println("Minivan muze prepravit" + minivan.cestujuci + " osob na vzdalenost" + dojezd1 + " Km.");
        System.out.println("Sportak muze prepravit" + sportak.cestujuci + " osob na vzdalenost" + dojezd2 + " Km.");
    }
}
