public class TestFor {
    public static void main(String[] args)
            throws java.io.IOException {

        int i;

        System.out.println("Chceteli program zastavit, stlecte klavesu S.");

        for (i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Pruchod c. " + i);
    }

}

