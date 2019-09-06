package com.company;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int evenNumber = 0;
        int isEvenNuber = 0;

        for (int i = number; i > 0; ) {
           isEvenNuber = number % 10;
            number /= 10;
            if (isEvenNuber % 2 == 0) {
                evenNumber += isEvenNuber;
                if (number == 0){
                    return evenNumber;
                }
            }
        }
        return evenNumber;
    }
}
