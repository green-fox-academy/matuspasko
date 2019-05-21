package testvyj;

public class UkazVyj2 {

    public static void main(String[] args) {

        try {
            TestVyj.genVyjimku();
        } catch (ArrayIndexOutOfBoundsException vyj) {
            //zachyti vyjimku
            System.out.println("Index je mimo rozsah!");
        }
        System.out.println("Za prikazem catch");
    }
}

