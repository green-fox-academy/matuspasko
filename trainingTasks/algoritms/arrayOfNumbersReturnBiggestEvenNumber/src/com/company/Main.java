package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        int[] numbers = {2, 3, 8, 4, 5, 6};

        System.out.println(evenNumber(numbers));
    }

    public static int evenNumber(int[] numbers) {

        int biggestEven = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] > biggestEven) {
                biggestEven = numbers[i];
            }
        }
        return biggestEven;
    }
}

