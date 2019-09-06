package com.company;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        if (first > second) {
            for (int i = first; i > 0; i--) {
                int number = first % i;
                if (number == 0) {
                    if (second % i == 0) {
                        return i;
                    }
                }
            }

        } else {
            for (int i = second; i > 0; i--) {
                int number = second % i;
                if (number == 0) {
                    if (first % i == 0) {
                        return i;

                    }
                }
            }
        }
        return -1;
    }
}
