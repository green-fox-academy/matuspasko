package com.company;

public class Main {

    public static void main(String[] args) {

        int[][] inputMatrix = {{1, 4, 5, 8},
                {4, 7, 1, 0},
                {9, 5, 3, 7},
                {4, 7, 2, 8}};

        matrix(inputMatrix);

    }

    public static int[][] matrix(int[][] inputMatrix) {
        int evenNumber = 0;
        for (int row = 0; row < inputMatrix.length; row++) {
            if (row % 2 == 0) {
                for (int i = 0; i < inputMatrix.length; i++) {
                    System.out.print(inputMatrix[row][i] + " ");
                }
                System.out.println();
            } else if (row % 2 != 0) {
                for (int column = 0; column < inputMatrix.length; column++) {
                    if (inputMatrix[row][column] % 2 == 0) {
                        inputMatrix[row][column] *= 2;
                        System.out.print(inputMatrix[row][column] + " ");
                    } else if (inputMatrix[row][column] % 2 != 0) {
                        System.out.print(inputMatrix[row][column] + " ");
                    }
                }
                System.out.println();
            }
        }
        return inputMatrix;
    }
}


