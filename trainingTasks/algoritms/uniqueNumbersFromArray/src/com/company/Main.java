package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] numbers = {3, 3, 3, 4, 4, 4, 5};

        System.out.println(uniqueNumber(numbers));

    }

    public static List<Integer> uniqueNumber(int[] numbers) {

        List<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (!numbersList.contains(numbers[i])) {
                numbersList.add(numbers[i]);
            }
        }
        return numbersList;
    }
}


