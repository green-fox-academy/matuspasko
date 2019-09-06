package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    private static Scanner scanner = new Scanner(System.in); // dont forget private static

    public static void main(String[] args) {

        int count ;
        System.out.println("Enter coun number : ");
        count = scanner.nextInt();
        findMin(readIntegers(count));
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + (i + 1) + " number");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] findMin(int[] array) {
        int[] minArray = new int[array.length]; // we passing array so we ned specifide lenght
        for (int i = 0; i < array.length; i++) {   // just coppy array
//            if (minArray[i] < array[i]) {
                minArray[i] = array[i];
//            }
        }

        int min = minArray[0];
        for (int i = 0; i < minArray.length; i++) {
            if (min > minArray[i]) {
                min = minArray[i];
            }
        }
        System.out.println(Arrays.toString(minArray));
        System.out.println("min is= " + min);

        return minArray;
    }
}
