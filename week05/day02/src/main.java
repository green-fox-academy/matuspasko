public class main {


    public static void main(String[] args) {

        int[][] symmetricMatrix = {{1, 0, 1},
                {0, 2, 2},
                {1, 2, 5}};
        int[][] nonSymmetricMatrix = {{7, 7, 7},
                {6, 5, 7},
                {1, 2, 1}};
        System.out.println(isSymmetric((symmetricMatrix)));
        System.out.println(isSymmetric(nonSymmetricMatrix));
    }


    public static boolean isSymmetric(int[][] inputMatrix) {


        for (int i = 0; i < inputMatrix.length; i++) {            //tunamamepocetzavoriek
            for (int j = 0; j < inputMatrix[i].length; j++) {     //tunamamekolkojecisielvzavorke
                if (inputMatrix[i][j] != inputMatrix[j][i]) {
                    return false;
                }
            }


        }
        return true;
    }
}
