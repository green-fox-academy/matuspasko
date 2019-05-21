import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] input = {{1, 3, 6, 2},
                {7, 5, 6, 1},
                {3, 3, 1, 5},
                {10, 0, 5, 3}};
        duplicateMatrix(input);
        printMatrix(input);
    }

    public static int[][] duplicateMatrix(int[][] inputMatrix) {
        for (int row = 0; row < inputMatrix.length; row++) {
            for (int columm = 0; columm < inputMatrix.length; columm++) {
                if (inputMatrix[row][columm] % 2 == 0) {
                    inputMatrix[row][columm] *= 2;
                }
            }
        }
        return inputMatrix;
    }

    public static int[][] printMatrix(int[][] inputMatrix) {
        for (int row = 0; row < inputMatrix.length; row++) {
            System.out.println(Arrays.toString(inputMatrix[row]));
        }
        return inputMatrix;
    }
}
