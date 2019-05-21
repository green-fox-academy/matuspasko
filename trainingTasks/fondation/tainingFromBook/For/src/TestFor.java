import java.io.IOException;
// Cyklus probiha do zadami pismene S
public class TestFor {
    public static void main(String[] args) throws IOException {

        int i;

        System.out.println(" Cheteli program zastavit, stisknete klavesu S.");

        for (i = 0; (char) System.in.read() != 'S'; i++){
            System.out.println("Pruchod c. " + i);

        }
    }
}
