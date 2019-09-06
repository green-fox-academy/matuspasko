package com.company;

public class NumberToWords {



    public static void numberToWords(int number) {
        reverse(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0){
            System.out.println("Zero");
        }
        for (int i = number; number > 0; ) {
            int lastNumber = number % 10;
            number = number / 10;

            switch (lastNumber) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int reverse(int number) {
        int revesedNumber = 0;
        int lastNumber = 0;
        for (int i = number; number != 0; ) {

            revesedNumber *= 10;
            lastNumber = (number % 10);
            revesedNumber += lastNumber;
            number /= 10;
        }
        return revesedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0){
            return 1;
        }
        int sum = 0;
        for (int i = number; number > 0; ) {
            if (number % 10 != 0 || number >= 10) {
                number /= 10;
                sum += 1;
            }
        }
        return sum;
    }
}

