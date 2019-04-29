package testvyj;

public class TestVyj {
    static void genVyjimku() {
        int cisla[] = new int[4];
        System.out.println("Pred generovani vyjimky");

        //generuje vyjimku prekrocenim hrenic indexu
        cisla[7] = 10;
        System.out.println("Tento text se nezobrazi. ");
    }
}


