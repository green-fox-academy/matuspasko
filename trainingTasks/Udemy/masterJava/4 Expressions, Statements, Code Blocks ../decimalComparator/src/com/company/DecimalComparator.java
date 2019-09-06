package com.company;

import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        double myFirstNumber = firstNumber * 1000;
        double mySecondNumber = secondNumber * 1000;

        int myFirstNumberInt = (int) (myFirstNumber);
        int mySecondNumberInt = (int) Math.round(mySecondNumber);

        System.out.println(myFirstNumberInt);
        System.out.println(mySecondNumberInt);

        if (myFirstNumberInt == mySecondNumberInt) {
            return true;
        } else
            return false;
    }
}
