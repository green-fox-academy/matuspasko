package com.company;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 0 || number == 1) {
            return -1;
        }
        int primeNumber = 0;
        int value = 0;
        for (int i = 2; i < number; i++) {
            value = number % i;
            if (value == 0) {

                if (primeNumber * primeNumber == number) {
                    return primeNumber;

                }

                primeNumber = i;
            }
            if (primeNumber == 0) {
                primeNumber = number;
            }

        }
        return primeNumber;
    }

}

