import java.util.Arrays;

public class MultiplyMatrix {
    public static void main(String[] args) {
        int[][] inputMatrix = {{1, 3, 6, 2},
                {7, 5, 6, 1},
                {3, 3, 1, 5},
                {9, 0, 5, 3}};
        multiplyMatrix(inputMatrix);
        printMatrix(inputMatrix);

//        System.out.println(Arrays.toString(multiplyMatrix(inputMatrix))); // v tomto pripade zbytocne
    }

    public static int[][] multiplyMatrix(int[][] inputMatrix) {
        for (int row = 0; row < inputMatrix.length; row++) {
            for (int columm = 0; columm < inputMatrix.length; columm++) {
                if (row % 2 == 0 && inputMatrix[row][columm] % 2 == 0) {
                    inputMatrix[row][columm] *= 2;
                } else if (row % 2 != 0 && inputMatrix[row][columm] % 2 != 0) {
                    inputMatrix[row][columm] *= 2;
                }

            }

        }
        return inputMatrix;

    }

    public static int[][] printMatrix(int[][] inputMatrix) {
        for (int row = 0; row < inputMatrix.length; row++) {
//            for (int columm = 0; columm < inputMatrix.length; columm++) {   // nepotrebujeme dva for loopy iba jeden
            System.out.println(Arrays.toString(inputMatrix[row]));  // vdaka toString to vytlacime v tavare ako predtym

        }
        return inputMatrix;
    }
}

