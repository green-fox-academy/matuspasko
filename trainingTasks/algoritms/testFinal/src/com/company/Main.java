package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        generateMultiplicationTable(number);
    }

    public static int[][] generateMultiplicationTable(int number) {
        int[][] matrix = new int[number][number];
        int countRow = 0;
        int countColumn = 0;

        for (int row = 0; row < matrix.length; row++) {

            countRow = countRow + 1;


            for (int column = 0; column < matrix.length; column++) {
                countColumn++;

                matrix[row][column] = countRow * countColumn;
            }

            countColumn = 0;
            System.out.println(Arrays.toString(matrix[row]));
        }
        return matrix;
    }
}

