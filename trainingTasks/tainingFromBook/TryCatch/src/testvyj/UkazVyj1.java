package testvyj;

//tohle je ukazka zpracovani vyjimek
public class UkazVyj1 {
    public static void main(String[] args) {
        int cisla[] = new int[4];

        try {
            System.out.println("Pred generovanim vyjimky");

            //Generuje vyjimku prekroceni hranic indexu
            cisla[7] = 10;
            System.out.println("Tento text se neyobrazi. ");
        } catch (ArrayIndexOutOfBoundsException vyj) {
            //zachyti vyjimku
            System.out.println("Index je mimo rozsah!");
        }
        System.out.println("Za prikladem catch");
    }
}

