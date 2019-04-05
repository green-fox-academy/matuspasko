import java.util.Scanner;

public class MileTomConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter distance in Km");
        int Km = in.nextInt();


        // then it converts that value to miles and prints it
        double miles = 0.621371;



        System.out.println(Km * miles);

    }
}
