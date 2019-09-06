package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        matrix(3);
        System.out.println();
        matrixRowMultiplyColumn(3);
    }

    public static int[][] matrixRowMultiplyColumn(int number) {

        int[][] matrix = new int[number][number];

        int countRow = 0;
        int countColumn = 0;

        for (int row = 0; row < matrix.length; row++) {
            countRow++;
            for (int column = 0; column < matrix.length; column++) {
                countColumn++;
                matrix[row][column] = countRow * countColumn;
            }
            countColumn = 0;
            System.out.println(Arrays.toString(matrix[row]));
        }
        return matrix;
    }


    public static int[][] matrix(int number) {

        int[][] myMatrix = new int[number][number];
        int countRow = 0;
        int coutNumber = 0;

        for (int i = 0; i < myMatrix.length; i++) {
            countRow++;
            for (int j = 0; j < myMatrix.length; j++) {
                coutNumber++;
                if (j == 0) {
                    myMatrix[i][j] = countRow;
//                    System.out.print(myMatrix[i][j] + " ");
                } else {
                    myMatrix[i][j] = coutNumber;
//                    System.out.print(myMatrix[i][j] + " ");
                }
            }
            System.out.println(Arrays.toString(myMatrix[i]));
        }
        return myMatrix;
    }
}



