public class isSymmetric {


    public static void main(String[] args) {

        int[][] symmetricMatrix = {{1, 0, 1},
                {0, 2, 2},
                {1, 2, 5}};
        int[][] nonSymmetricMatrix = {{7, 7, 7},
                {6, 5, 7},
                {1, 2, 1}};
        int [][] anotherSymmetricMatrix = {{6, 7, 8},
                                            {2, 5, 6},
                                            {1, 2, 6}};
        System.out.println(isSymmetricOtherWay(symmetricMatrix));
        System.out.println(isSymmetricOtherWay(nonSymmetricMatrix));
        System.out.println(isSymmetricOtherWay(anotherSymmetricMatrix));
    }

//
//    public static boolean isSymmetric(int[][] inputMatrix) {
//
//
//        for (int i = 0; i < inputMatrix.length; i++) {   // tuna mame pocet zavoriek
//            for (int j = 0; j < inputMatrix[i].length; j++) {   // tuna mame kolko je cisiel v zavorke
//                if (inputMatrix[i][j] != inputMatrix[j][i]) {
//                    return false;
//                }
//            }
//
//
//        }
//        return true;
//    }

    public static boolean isSymmetricOtherWay(int[][] inToMatrix) {
        int lastIndex = inToMatrix.length -1;

        for (int i = 0; i < inToMatrix.length; i++) {
            for (int j = 0; j < inToMatrix[i].length; j++) {

                if (inToMatrix[lastIndex -j][lastIndex -j] != inToMatrix[j][i]) {
                    return false;
                }
            }

        }
        return true;
    }

}

