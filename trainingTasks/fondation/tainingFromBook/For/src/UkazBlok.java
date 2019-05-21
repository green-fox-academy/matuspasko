public class UkazBlok {
    public static void main(String[] args) {
        double i, j, d;

        i = 5;
        j = 10;

        // cilem tohoto prikazu je blok
        if (i != 0) {
            System.out.println("Promenna i se nerovna nule.");

            d = j / i;
            System.out.println("Podil j /i se rovna " + d);
        }
    }
}

