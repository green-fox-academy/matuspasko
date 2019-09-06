package com.company;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = {{3, 4, 5, 6},
                {7, 2, 6, 3},
                {2, 8, 4, 6},
                {7, 2, 6, 3},};

        System.out.println("Matrix diagonal average : " + average(matrix));
        System.out.println("Matrix diagonal oposite :  " + averageOposite(matrix));
    }

    public static double averageOposite(int[][] inputMatrix) {

        int howManyRows = 0;
        double countrow = 0;
        int countColumn = 0;
        double sum = 0;
        double average = 0;

        for (int row = 0; row < inputMatrix.length; row++) {
            howManyRows++;
        }

        for (int row = 0; row < inputMatrix.length; row++) {
            countrow++;
            for (int column = 0; column < inputMatrix.length; column++) {
                countColumn++;
                if (countColumn == howManyRows) {
                    sum += inputMatrix[row][column];
                    howManyRows--;
                }
            }
            countColumn = 0;
        }
        average = sum / countrow;
        return average;
    }

    public static int average(int[][] inputMatrix) {

        int sum = 0;
        int average = 0;
        int countRow = 0;
        int countColumn = 0;
        for (int row = 0; row < inputMatrix.length; row++) {
            countRow++;
            for (int column = 0; column < inputMatrix.length; column++) {
                countColumn++;
                if (countRow == countColumn) {

                    sum += inputMatrix[row][column];
                }
            }
            countColumn = 0;
        }
        average = sum / countRow;
        return average;
    }
}
