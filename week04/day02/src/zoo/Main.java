package zoo;

import sk.matuspasko.sk.matuspasko.daco.*;

public class Main {

    public static void main(String[] args) {
        Ruka ruka = new Ruka(5);

        ruka = new  Ruka(3);
        int cislo = 10;
        cislo = 5;
        //vybral som sa pilit drevo

        System.out.println(ruka.getPocetPrstov());
        ruka.postupneOdstranujPrsty();
        System.out.println(ruka.getPocetPrstov());

        for (int i = 0; i < 10; i++){
            if (i % 2 ==  0) {
                continue;
            }
            System.out.println(i);
            }
        Cicavec cicavec1 = new Medved();
        Cicavec cicavec2= new Lev();

        if (cicavec1 instanceof Medved) {
            System.out.println("toto je medved cicavec 1");
        }
        if (cicavec1 instanceof Lev) {
            System.out.println("toto je lev cicavec 1");
        }

            }
            }

