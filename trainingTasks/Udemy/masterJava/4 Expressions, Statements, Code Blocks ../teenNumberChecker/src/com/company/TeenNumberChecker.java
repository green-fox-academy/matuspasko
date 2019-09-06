package com.company;

public class TeenNumberChecker {

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber  >= 13 && firstNumber <= 19) {
            return true;
        } else if (secondNumber >= 13 && secondNumber <= 19) {
            return true;
        } else return thirdNumber >= 13 && thirdNumber <= 19;
    }

    public static boolean isTeen(int firstNumber) {
        return firstNumber >= 13 && firstNumber <= 19;
    }
}
