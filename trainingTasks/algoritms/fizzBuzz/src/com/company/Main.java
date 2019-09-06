package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fizBuz(20)));
    }

    public static int[] fizBuz(int number) {
        // delitelne 3 a 5
        int count1 = 0;
        int count = 0;

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        int[] numbers = new int[count];

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                for (int j = 0; j < numbers.length; j++) {
                    numbers[count1] = i;
                    count1++;
                    break;
                }
            }
        }
        return numbers;
    }
}
