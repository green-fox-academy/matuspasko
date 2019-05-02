public class MatrixRotate {


    public static void main(String[] args) {

        int[][] symmetricMatrix = {{1, 0, 1},
                {0, 2, 2},
                {1, 2, 5}};
        int[][] nonSymmetricMatrix = {{7, 7, 7},
                {6, 5, 7},
                {1, 2, 1}};
//        System.out.println(MatrixRotate((symmetricMatrix)));
//        System.out.println(MatrixRotate(nonSymmetricMatrix));

        for (int i = 0; i < symmetricMatrix.length; i++) {
            for (int j = 0; j < symmetricMatrix.length ; j++) {
                symmetricMatrix[j][symmetricMatrix.length - 1 - symmetricMatrix.length] = symmetricMatrix[i][j];

             //   symmetricMatrix[i][j] = (i * 3) + j + 1;
                System.out.print(symmetricMatrix[i][j]);
            }
        }

//        static int[][] rotateCW(int[][] mat) {
//            final int M = mat.length;
//            final int N = mat[0].length;
//            int[][] ret = new int[N][M];
//            for (int r = 0; r < M; r++) {
//                for (int c = 0; c < N; c++) {
//                    ret[c][M-1-r] = mat[r][c];
//                }
//            }
//            return ret;
//        }




//    }


//
//    public static boolean MatrixRotate(int[][] inputMatrix) {
//

//        for (int i = 0; i < inputMatrix.length; i++) {//tunamamepocetzavoriek
//            for (int j = 0; j < inputMatrix[i].length; j++) {//tunamamekolkojecisielvzavorke
//                if (inputMatrix[i][j] != inputMatrix[j][i]) {
//                    return false;
//                }
//            }
//
//
//        }
//        return true;
    }
}

