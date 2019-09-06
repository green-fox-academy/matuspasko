package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int count = array.length - 1;
        int numberI = array;
        for (int i = 0; i < array.length; i++) {
            array[i] = numberI;
            array[i] = array[count];
            count--;
            System.out.println(Arrays.toString(array));
        }
    }
}


