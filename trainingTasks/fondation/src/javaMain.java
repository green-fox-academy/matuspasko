
    import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
    public class javaMain {
        public static void main(String[] args) {
            //https://github.com/green-fox-academy/exam-trial-basics
            int[][] symmetricMatrix = {{1, 0, 1},
                    {0, 2, 2},
                    {1, 2, 5}};
            int[][] notSymmetricMatrix = {{7, 7, 7},
                    {6, 5, 7},
                    {1, 2, 1}};
            int[][] anotherSymmetricMatrix = {{6, 7, 8},
                    {2, 5, 7},
                    {1, 2, 6}};
            System.out.println("Testing isSymmetric: ");
            System.out.println(isSymmetric(symmetricMatrix));        // must return true
            System.out.println(isSymmetric(notSymmetricMatrix));      // must return false
            System.out.println(isSymmetric(anotherSymmetricMatrix));    // must return false
            System.out.println("Testing anotherIsSymmetric: ");
            System.out.println(anotherIsSymmetric(symmetricMatrix));      // must return false
            System.out.println(anotherIsSymmetric(notSymmetricMatrix));     // must return false
            System.out.println(anotherIsSymmetric(anotherSymmetricMatrix));   // must return true
            try {
                HashMap<Character, Integer> result = mostCommonCharacter("countchar.txt");
                System.out.println(result);
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        //region Description for isSymmetric
        // Create a function named isSymmetric that takes an n×n integer matrix
        // (two dimensional array/list) as a parameter and returns true if
        // the matrix is symmetric or false if it is not.
        // Symmetric means it has identical values along its diagonal axis
        // from top-left to bottom-right, as in the first example.
        //endregion
        public static boolean isSymmetric(int[][] inputMatrix) {
            for (int i = 0; i < inputMatrix.length; i++) {
                for (int j = 0; j < inputMatrix.length; j++) {
                    if (inputMatrix[i][j] != inputMatrix[j][i]) {
                        // System.out.println("The first indexes where matrix is not symmetric: " + i + " and " + j);
                        return false;
                    }
                }
            }
            return true;
        }
        //region Description for anotherIsSymmetric
        // Exactly the same but symmetric means being symmetric to the another axis
        // see anotherSymmetricMatrix as an example for symmetry
        //endregion
        public static boolean anotherIsSymmetric(int[][] inputMatrix) {
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
        //region Description for getMostCommonCharacters
        // Write a function that takes a filename as a parameter. Return the 2
        // most common characters and their occurrences in the file's content.
        // If the file does not exist throw an exception with the following message:
        // "File does not exist!"
        //endregion
        public static HashMap<Character, Integer> mostCommonCharacter (String fileName) throws IOException {
            // read the file
            Path path = Paths.get(fileName);
            String allLetters = "";
            try {
                // get the content from the file
                List<String> fileData = Files.readAllLines(path);
                for (String line : fileData) {
                    allLetters = allLetters + line;
                }
            } catch (IOException e){
                // throw exception if it does not exist
                throw new IOException("File does not exist!");
            }
            return getMostCommon(allLetters);
        }
        public static HashMap<Character, Integer> getMostCommon(String allLetters){
            HashMap<Character, Integer> map = new HashMap<>();
            int maximumOccurrence = 0;
            char mostCommonCharacter = 'u\0000';
            // Build a HashMap that stores characters and occurrences
            // process the content
            for (int i = 0; i < allLetters.length(); i++) {
                char countedCharacter = allLetters.charAt(i);
                int occurrenceOfCounted = getOccurrence(allLetters, countedCharacter);

                if (occurrenceOfCounted > maximumOccurrence){
                    maximumOccurrence = occurrenceOfCounted;
                    mostCommonCharacter = countedCharacter;
                }
            }
            return map;
        }
        public static Integer getOccurrence(String allLetters, char countedCharacter){
            int occurrenceOfCounted = 0;
            // another loop four counting occurrences of countedCharacter:
            for (int j = 0; j < allLetters.length(); j++) {
                if (countedCharacter == allLetters.charAt(j)) {
                    occurrenceOfCounted++;
                }
            }
            return occurrenceOfCounted;
        }
    }

