package com.company;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastNumber = 0;
        int firstNumber = number % 10;
        if (number < 10){
            firstNumber = number;
        }
        int sum = 0;
        for (int i = number; i != 0; ) {
            if (number < 10) {
                lastNumber = number;
                sum = lastNumber + firstNumber;
                return sum;
            }else {
                number /= 10;
            }
        }
        return 0;
    }
}



