package com.company;

public class Main {

    public static void main(String[] args) {

        int[] test = {2, 3, 46, 2, 7};

        System.out.println(seconDbigest(test));
    }

    public static int seconDbigest(int[] numbers) {

        int biggest = 0;
        int secondBig = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggest) {
                biggest = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > secondBig && numbers[i] < biggest) {
                secondBig = numbers[i];
            }
        }
//        System.out.println(biggest);
//        System.out.println(secondBig);
        return secondBig;
    }
}
