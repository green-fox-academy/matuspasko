package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("The value ot the digits in number 125 is " + sumDigits(125));
        System.out.println("The value ot the digits in number 300 is " + sumDigits(300));
        System.out.println("The value ot the digits in number 5643 is " + sumDigits(5643));
        System.out.println("The value ot the digits in number 1 is " + sumDigits(1));
        System.out.println("The value ot the digits in number 0 is " + sumDigits(0));

    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int devidedNumbers;
        int value = 0;
        while (number > 0) {
            devidedNumbers = number % 10;
            value += devidedNumbers;

            number /= 10;
        }
        return value;
    }
}



