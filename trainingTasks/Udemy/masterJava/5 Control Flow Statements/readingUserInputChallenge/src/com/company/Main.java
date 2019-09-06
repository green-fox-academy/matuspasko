package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = 1;

        while (number <= 10) {
            System.out.println("Enter number #" + number + " :");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int enteredNumber = scanner.nextInt();
                sum += enteredNumber;
                number++;
            }
            else   {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of the number is " + sum);
        scanner.close();
    }
}

