package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = {{2, 4, 5, 2},
                {8, 2, 0, 3},
                {7, 2, 4, 3},
                {0, 2, 4, 1}};


//        matrixMultiply(matrix);
        System.out.println();
//        evenOdd(matrix);

        diagonalMultiply(matrix);
    }


    public static int[][] matrixMultiply(int[][] inputMatrix) {

        int[][] matrixMulti = inputMatrix;

        for (int row = 0; row < matrixMulti.length; row++) {
            for (int column = 0; column < matrixMulti.length; column++) {
                matrixMulti[row][column] *= 2;
            }
            System.out.println(Arrays.toString(matrixMulti[row]));
        }
        return matrixMulti;
    }


    public static int[][] evenOdd(int[][] inputMatrix) {

        int countRow = 0;
        int countColumn = 0;

        int[][] matrix = inputMatrix;

        for (int row = 0; row < matrix.length; row++) {
            if (row % 2 == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    if (matrix[row][i] % 2 != 0) {
                        matrix[row][i] *= 10;
                    }
                }
            }
            System.out.println(Arrays.toString(matrix[row]));
        }
        return matrix;
    }

    public static int[][] diagonalMultiply(int[][] inputMatrix) {


        for (int row = 0; row < inputMatrix.length; row++) {
            for (int column = 0; column < inputMatrix.length; column++) {
                if (column == inputMatrix[row].length - 1 - row) {
                    inputMatrix[row][column] *= 2;
                }
            }
            System.out.println(Arrays.toString(inputMatrix[row]));
        }
        return inputMatrix;
    }
}
