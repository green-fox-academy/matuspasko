package vozidlo;

public class VypocetPaliva {
    public static void main(String[] args) {
        Vozidlo minivan = new  Vozidlo();
        Vozidlo sportak = new Vozidlo();
        double litry;
        double vzdal = 400;

        //priradi hodnoty polim v objektu minivan
        minivan.cestujuci = 7;
        minivan.litryNa100km = 10;
        minivan.objemNadrze = 60;

        //priradi hodnoty polim v objektu sportak
        sportak.cestujuci = 2;
        sportak.litryNa100km = 20;
        sportak.objemNadrze = 50;

        litry = minivan.potrebnePalivo(vzdal);

        System.out.println("Na ujeti " + vzdal + " km potrebuje minivan " + litry + " litru paliva.");

        litry = sportak.potrebnePalivo(vzdal);

        System.out.println("Na ujeti " + vzdal + " km potrebuje sportak " + litry + " litru paliva.");



    }
}
