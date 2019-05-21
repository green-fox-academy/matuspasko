import java.util.Arrays;
class MultiplyMatrix {
    public static void main(String[] args) {
        int array[][] = {{1, 3, 6, 2},
                {7, 5, 6, 1},
                {3, 3, 1, 5},
                {9, 0, 5, 3}};
        multiply(array);
        printMatrix(array);
        System.out.print(Arrays.toString(multiply(array))); // Arrays.toString(multiply(array))) - tato funkcia funkcia na to pravedie na string
    }
    public static int[][] multiply(int[][] inputMatrix) { // public static int[][] vraciam datatyp ktory som tam vlozil
        for (int row = 0; row < inputMatrix.length; row++) {
            for (int column = 0; column < inputMatrix.length; column++) {
                if (row % 2 == 0 && inputMatrix[row][column] % 2 == 0) {
                    inputMatrix[row][column] *= 2; // *= tento znak vynasoby aj prepise hodnotu inputMatrix[row][column] *2
                } else if (row % 2 != 0 && inputMatrix[row][column] % 2 != 0) {
                    inputMatrix[row][column] *= 2;
                }
            }
        }
        return inputMatrix; //
    }
    public static void printMatrix(int[][] inputMatrix) {
        for (int row = 0; row < inputMatrix.length; row++) {
            for (int i = 0; i < inputMatrix.length; i++) {
                System.out.println(inputMatrix[row][i]);
            }
        }
    }
}
