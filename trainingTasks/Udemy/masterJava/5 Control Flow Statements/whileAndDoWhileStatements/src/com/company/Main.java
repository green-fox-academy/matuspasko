package com.company;

public class Main {


    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int totalNumber = 0;
        int countNumber = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            totalNumber += number;
            countNumber++;
            System.out.println("Even number = " + number);
            if (countNumber == 5){
                System.out.println("Total number = " + totalNumber);
            }

        }


//        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for (
//                int i = 1;
//                i < 7; i++) {
//            System.out.println("Count value is " + i);
//        }
//
//        for (count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }
//
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count != 6);

//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
