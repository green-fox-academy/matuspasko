package com.company;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            int currentRow = number;

            for (int row = 0; row < number; row++) {
                currentRow--;
                System.out.println("");

                for (int column = 0; column < number; column++) {
                    if (row == 0 || row == number - 1) {
                        System.out.print("*");
                    } else if (column == 0 || column == number - 1) {
                        System.out.print("*");
                    } else if (row == column) {
                        System.out.print("*");

                    } else if (currentRow == column) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}

