package vozidlo;

public class PridejMetodu {
    public static void main(String[] args) {
        Vozidlo minivan = new Vozidlo();
        Vozidlo sportak = new Vozidlo();

        double dojezd, dojezd2;

        //priradi hodnoty polim v objektu minivan
        minivan.cestujuci = 7;
        minivan.litryNa100km = 10;
        minivan.objemNadrze = 60;

        //priradi hodnoty polim v objektu sportak
        sportak.cestujuci = 2;
        sportak.litryNa100km = 20;
        sportak.objemNadrze = 50;

        System.out.println("Minivan moze prepravit " + minivan.cestujuci + " osob. ");

        minivan.dojezd(); // zobrazi dojezd minivanu

        System.out.println("Sportak muze prepravit " + sportak.cestujuci + " osob. ");
        sportak.dojezd(); // zobrazi dojazd sportaku

    }
}
