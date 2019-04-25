package sk.matuspasko.sk.matuspasko.daco;

public class Ruka {
    private int pocetPrstov = 4;
    char znak = 's';

    char[] znaky = {'a','b','c'};
    char[] znaky2 = new char[3];


    static long cislo = 76876557657867L;

    boolean pravdaNepravda = false;

    public Ruka(int pocetPrstov2) {
        this.pocetPrstov = pocetPrstov2;
    }

    private long dajMiCisloPlusSto(long cislo, long dalsieCislo){

        int cislo3;
        int cislo2;

        int cislo5 = 110, cislo6 = 10;

        return cislo + 100 + dalsieCislo;
    }
    public void  odstranPrstZRuky() {


        if (this.pocetPrstov > 0) {
            System.out.println("Auuu odstranil som si prst");
            this.pocetPrstov = this.pocetPrstov - 1;

        } else if (0 == 0){
            System.out.println("Uz nemam prsty mam 0");
        }
    }


    public void odstranPrstZRuky(String daco) {


    }

    public void odstranPrstZRuky(String daco, int i){

    }

    public void odstranPrstZRuky(int daco, String i){

    }
    public void postupneOdstranujPrsty() {
      //  while (this.pocetPrstov > 0) {
        //    odstranPrstZRuky();
      //  }
        do {
            odstranPrstZRuky();
        }
            while (this.pocetPrstov > 0) ;
    }

    public int getPocetPrstov() {
        return pocetPrstov;
    }

    public void setPocetPrstov(int pocetPrstov) {
        this.pocetPrstov = pocetPrstov;
    }
}
