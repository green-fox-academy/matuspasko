package matrix;

public class Matrix {
    public static void main(String[] args) {


        int[][] matrix = {

                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };

        int[][] newMatrix = rotateMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int[][] rotateMatrix(int[][] matrix) {

        int[][] rotate = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {


                rotate[j][matrix.length - 1 - i] = matrix[i][j];


            }

        }

        return rotate;
    }

}
