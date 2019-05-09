import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] inputMatrix = {{1, 3, 6, 2},
                {7, 5, 6, 1},
                {3, 3, 1, 5},
                {9, 0, 5, 3}};
        multiplyMatrix(inputMatrix);
        printMatrix(multiplyMatrix(inputMatrix));

    }

    public static int[][] multiplyMatrix(int[][] inputMatrix) {
        int[][] multipliedMatrix = new int[inputMatrix.length][inputMatrix[0].length];
        for (int x = 0; x < inputMatrix.length; x++) {
            int[] row = inputMatrix[x];
            for (int y = 0; y < row.length; y++) {
                boolean isRowOdd = x % 2 != 0 ;
                boolean isRowEven = !isRowOdd;
                boolean isNumberOdd = inputMatrix[x][y] % 2 != 0;
                boolean isNumberEven = !isNumberOdd;
                if ((isRowOdd && isNumberOdd) || (isRowEven && isNumberEven) ) {
                    multipliedMatrix[x][y] = inputMatrix[x][y] * 2;
                }else {
                    multipliedMatrix[x][y] = inputMatrix[x][y];
                }
            }
        }
        return multipliedMatrix;
    }
    public static void printMatrix(int[][] inputMatrix){
        for (int i = 0; i < inputMatrix.length; i++) {
            System.out.println(Arrays.toString(inputMatrix[i]));
        }
    }
}


//### Multiply items in a matrix
//
//Write a method that takes a matrix as a parameter.
//
//The function should:
//
//- multiply each even number by 2 in each even indexed row
//- multiply each odd number by 2 in each odd indexed row
//
//Write at least 2 different test cases.
//
//#### Example
//
//Input
//
//```
//[
//  [1, 3, 6, 2],
//  [7, 5, 6, 1],
//  [3, 3, 1, 5],
//  [9, 0, 5, 3]
//]
//```
//
//Output
//
//```
//[
//  [1,  3,  12, 4],
//  [14, 10, 6,  2],
//  [3,  3,  1,  5],
//  [18, 0,  10, 6]
//]
//```