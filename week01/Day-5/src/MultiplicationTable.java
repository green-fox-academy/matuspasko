import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        int n;
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Multiplication table");

        for (int c = 1; c <= 10; c++)
            System.out.println(n + "*" + c + " = " + (n*c));

    }
}
