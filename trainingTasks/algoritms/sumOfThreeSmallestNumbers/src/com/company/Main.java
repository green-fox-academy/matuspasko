package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {4, 6, 7, 23, 87, 9};


        System.out.println("Sum of 3 biggest numbers : " + sumOfThreeBigest(numbers));
        System.out.println("Sum of 3 smallest :" + sumOfThreeSmallest(numbers));
    }

    public static int sumOfThreeBigest(int[] array) {
        int sum = 0;
        int temp = 0;
        int temp1 = 0;
        int temp2 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > temp) {
                temp = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > temp1 && (array[i] != temp)) {
                temp1 = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > temp1 && (array[i] != temp) || (array[i] != temp1)) {
                temp2 = array[i];
            }
        }

        sum = temp + temp1 + temp2;
        return sum;
    }

    public static int sumOfThreeSmallest(int[] array) {
        int sum = 0;
        int temp = 0;
        int temp1 = 0;
        int temp2 = 0;


        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            for (int j = 0; j < array.length; j++) {
                if (array[j] < temp) {
                    temp = array[j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            temp1 = array[i];
            for (int j = 0; j < array.length; j++) {
                if (array[j] < temp1 && array[j] != temp) {
                    temp1 = array[j];
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            temp2 = array[i];
            for (int j = 0; j < array.length; j++) {
                if (array[j] < temp2 && (array[j] != temp && array[j] != temp1)) {
                    temp2 = array[j];


                }

            }
        }

        sum = temp + temp1 + temp2;

        return sum;
    }
}


