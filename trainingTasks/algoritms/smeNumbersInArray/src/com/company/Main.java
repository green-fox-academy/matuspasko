package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // dvě number arrays a vyhodit array se společnými čísly

        int[] numberFirst = {2, 4, 6, 2};
        int[] numbersSecond = {3, 7, 4, 8};

        test();

        System.out.println(Arrays.toString(sameNumbers(numberFirst, numbersSecond)));
    }

    public static int[] sameNumbers(int[] numbersFirst, int[] numbersSecond) {

        int count = 1;
        int[] sameN = new int[count];

        for (int i = 0; i < numbersFirst.length; i++) {
            for (int j = 0; j < numbersSecond.length; j++) {
                if (numbersFirst[i] == numbersSecond[j]) {
                    count++;
                }
            }
        }

        for (int i = 0; i < numbersFirst.length; i++) {
            for (int j = 0; j < numbersSecond.length; j++) {
                if (numbersFirst[i] == numbersSecond[j]) {
                    for (int k = 0; k < sameN.length; k++) {
                        sameN[k] = numbersFirst[i];
                    }
                }
            }
        }
        return sameN;
    }


    public static void test() {

        int count = 0;
        int number = 9;
        int[] arrayNumbers = new int[number];

        for (int i = 0; i < number; i++) {
            count++;
            for (int j = 0; j < arrayNumbers.length; j++) {
                arrayNumbers[i] = count;
                break;
            }
        }
        System.out.println(Arrays.toString(arrayNumbers));
    }
}
