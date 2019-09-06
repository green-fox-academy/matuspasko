package com.company;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int threedNumber) {
        if ((firstNumber < 10 || firstNumber >= 1001) ||
                (secondNumber < 10 || secondNumber >= 1001) ||
                (threedNumber < 10 || threedNumber >= 1001)) {
            return false;
        }
        int lastDigitFirstNumber = firstNumber % 10;
        int lastDigitSecondNumber = secondNumber % 10;
        int lastDigitThreedNumber = threedNumber % 10;

        if ((lastDigitFirstNumber == lastDigitSecondNumber || lastDigitFirstNumber == lastDigitThreedNumber) || (lastDigitSecondNumber == lastDigitThreedNumber)) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}
