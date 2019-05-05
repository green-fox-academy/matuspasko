package matrix;

public class isSymmetric{


        public static void main(String[]args){
//
//        int[][]symmetricMatrix={{1,0,1},
//                                {0,2,2},
//                                {1,2,5}};
//        int[][]nonSymmetricMatrix={{7,7,7},
//        {6,5,7},
//        {1,2,1}};
        int[][]anotherSymmetricMatrix={{6,2,8},
                                       {2,5,2},
                                       {8,2,6}};
//        System.out.println(isSymmetricOtherWay(symmetricMatrix));
//        System.out.println(isSymmetricOtherWay(nonSymmetricMatrix));
        System.out.println(isSymmetricOtherWay(anotherSymmetricMatrix));
        }


    //    public static boolean isSymmetric(int[][]inputMatrix){


//        for(int i=0;i<inputMatrix.length;i++){//tunamamepocetzavoriek
//        for(int j=0;j<inputMatrix[i].length;j++){//tunamamekolkojecisielvzavorke
//        if(inputMatrix[i][j]!=inputMatrix[j][i]){
//        return false;
//        }
//        }
//
//
//        }
//        return true;
//        }

    public static boolean isSymmetricOtherWay(int[][] inputMatrix) {
        int lastIndex = inputMatrix.length - 1;
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                if (inputMatrix[lastIndex - i][lastIndex - j] != inputMatrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}