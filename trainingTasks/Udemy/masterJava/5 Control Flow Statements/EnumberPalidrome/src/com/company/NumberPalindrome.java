package com.company;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
//        return reverseNumber(number) == number;

        int reverse = 0;
        int lastDigit = 0;
        int number1 = number;

        while (number1 != 0) {
            lastDigit = number1 % 10;
            number1 /= 10;
            reverse *= 10;
            reverse += lastDigit;
        }
        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }
}


//    public static int reverseNumber(int number) {
//        int reverse = 0;
//        int lastDigit = 0;
//        while (number != 0) {
//            lastDigit = number % 10;
//            number /= 10;
//            reverse *= 10;
//            reverse += lastDigit;
//        }
//        return (reverse);
//    }
