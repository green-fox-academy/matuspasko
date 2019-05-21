package vozidlo;

public class Vozidlo {
    int cestujuci;         //pocet cestujucich
    double objemNadrze;     //objem palova v nadrzi
    double litryNa100km;    //spotreba paliva na 100 km

    //Toto je konstruktor tridy Vozidlo
    Vozidlo(int c, double o, double l){
        cestujuci = c;
        objemNadrze = o;
        litryNa100km = l;
    }

    //metoda vrati dojazd
    double dojezd(){
        return 100 * (objemNadrze / litryNa100km);
    }
    //vypocita palivo potrevne k prekonani istej vzdialenosti
    double potrebnePalivo(double kilometry){
        return litryNa100km * (kilometry / 100);
    }
}

