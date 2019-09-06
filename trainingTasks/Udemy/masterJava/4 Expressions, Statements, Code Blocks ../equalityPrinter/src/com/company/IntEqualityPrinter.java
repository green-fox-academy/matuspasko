package com.company;

public class IntEqualityPrinter {

    public static void prinEqual(int firstnumber, int secondnumber, int thirdNumber) {
        if (firstnumber < 0 || secondnumber < 0 || thirdNumber < 0) {
            System.out.println("Invalid Value");
        } else if (firstnumber == secondnumber && secondnumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstnumber != secondnumber && secondnumber != thirdNumber & thirdNumber != firstnumber) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
