import java.util.*;

// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

public class DivideByZero {
    public static void main(String[] args) {
        double divider = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        String number = scanner.nextLine();
        double numberInput = Double.parseDouble(number);
        double toCompare = (numberInput / divider);
        if (toCompare == 0)
            System.out.println("fail");
        else
            System.out.println("Resault is: " + toCompare);
    }
}

