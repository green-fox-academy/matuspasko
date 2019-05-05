//package matrix;
//
//public class SymetricMatrix {
//    public static void main(String[] args) {
//        int[][] symmetricMatrix = {{1, 0, 1},
//                {0, 2, 2},
//                {1, 2, 5}};
//
//        int[][] notSymmetricMatrix = {{7, 7, 7},
//                {6, 5, 7},
//                {1, 2, 1}};
//
//        int[][] anotherSymmetricMatrix = {{6, 7, 8},
//                {2, 5, 7},
//                {1, 2, 6}};
//
//        System.out.println(“TestingisSymmetric”);
//        System.out.println(isSymmetric(symmetricMatrix)); //return true
//        System.out.println(isSymmetric(notSymmetricMatrix)); //return false
//        System.out.println(isSymmetric(anotherSymmetricMatrix)); //return false
//
//        System.out.println(“Testing anotherIsSymmetric”);
//        System.out.println(anotherIsSymmetric(symmetricMatrix)); //return false
//        System.out.println(anotherIsSymmetric(notSymmetricMatrix)); //return false
//        System.out.println(anotherIsSymmetric(anotherSymmetricMatrix)); //return true
//    }
//
//    public static boolean isSymmetric (int[][] inputMatrix) {
//        for (int i = 0; i < inputMatrix.length; i++) {
//            for (int j = 0; j < inputMatrix[i].length; j++) {
//                if (inputMatrix[i][j] != inputMatrix[j][i]) {
//                    System.out.println( “The_first_indexes_where_matrix_is not_symmetric ” + i + ” and ” + j);
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    public static boolean anotherIsSymmetric (int[][] inputMatrix) {
//        int lastIndex = inputMatrix.length - 1;
//        for (int i = 0; i < inputMatrix.length; i++) {
//            for (int j = 0; j < inputMatrix[i].length; j++) {
//                if (inputMatrix[lastIndex - i][lastIndex - j] != inputMatrix[j][i]) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}
