public class Vozidlo {
    int cestujuci;
    double objemNadrze;
    double litryNa100km;

    void dojezd(){
        System.out.println("Dojezd vozidla je " + (100 * (objemNadrze / litryNa100km)) + "km");
    }
}

