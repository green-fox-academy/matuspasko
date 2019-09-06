package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] numbers = {4, 2, 5, 1, 32, 5};

        System.out.println("This is smallest: " + small(numbers));
        System.out.println(sumOfThreeSmallest(numbers));
    }

    public static int sumOfThreeSmallest(int[] numbers) {

        int sum = 0;
        int smallest = 100;
        int second = 100;
        int third = 100;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }


        for (int j = 0; j < numbers.length; j++) {

            if (numbers[j] < second && numbers[j] != smallest) {
                second = numbers[j];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < third && numbers[i] != smallest && numbers[i] != second) {
                third = numbers[i];
            }
        }
        sum = smallest + second + third;
        return sum;
    }

    public static int small(int[] numbers) {
        int count = 0;

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (i <= 2) {
                count += numbers[i];
            }
        }
        return count;
    }

}

