public class MatrixDuplicate {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},};
        int[][] duplicated = duplicateEvenNumbers(matrix);
        printMatrix(duplicated);
    }
    public static int[][] duplicateEvenNumbers(int[][] input){
        int[][] duplicated = new int[input.length][input.length];
        for (int i = 0; i < input.length ; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j]  % 2 == 0){
                    duplicated[i][j] = input[i][j]*2;
                } else {
                    duplicated[i][j] = input[i][j];
                }
            }
        }
        return duplicated;
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}