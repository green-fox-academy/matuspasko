import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] inputMatrix = {{1, 3, 6, 2},
                {4, 5, 6, 1},
                {3, 3, 1, 5},
                {9, 0, 5, 2}};

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
                for (int i = 0; i < inputMatrix.length; i++) {
                    if (inputMatrix[row][i] % 2 != 0) {
                        System.out.print(inputMatrix[row][i] + " ");
                    } else if (inputMatrix[row][i] % 2 == 0) {
                        inputMatrix[row][i] *= 2;
                        System.out.print(inputMatrix[row][i] + " ");
                    }
                }
                System.out.println();
            }
        }
        return inputMatrix;
    }
}


