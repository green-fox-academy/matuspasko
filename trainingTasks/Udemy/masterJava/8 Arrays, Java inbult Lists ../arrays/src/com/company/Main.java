package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArray = new int[25]; //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

       myIntArray[5] = 50;
        double[] mydoubleArray = new double[10];
        System.out.println(myIntArray[5]);
        System.out.println(myIntArray[0]);

//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//
//        }
//        printArray(myIntArray);
//
//    }
//
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + ", value is " + array[i]);
//
//        }
//    }

        int sum = 0;
        int[] myIntegers = getIntegeers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            sum += myIntegers[i];
            System.out.println("Element " + i + " , typed values was " + myIntegers[i]);


        }
        System.out.println("Sum = " + sum);
        System.out.println("Average is " + sum/myIntegers.length);


    }

    public static int[] getIntegeers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();

        }
        return values;
    }
}
