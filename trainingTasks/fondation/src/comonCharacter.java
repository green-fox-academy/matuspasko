

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class comonCharacter {
    public static void main(String[] args) {

        try {
            mostCommonCharakter("/Users/matuspasko/Desktop/matuspasko/trainingTasks/src/comonchar");
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static HashMap<Character, Integer> mostCommonCharakter(String fileName) throws IOException {
        //read file
        Path path = Paths.get(fileName);
        String allLetters = "";

        try {
            //get the content from tne file
            List<String> fileData = Files.readAllLines(path);
            for (String line : fileData) {
                allLetters = allLetters + line;
            }

        } catch (IOException e) {
            //throw exception if it does not exist
            throw new IOException("File does not exist!");
        }

        HashMap<Character, Integer> map = new HashMap<>();


        //process the content
        // build the hash map that stores characters and occurences

        for (int i = 0; i < allLetters.length(); i++) {
            char countedCharacter = allLetters.charAt(i);
            int occurrenceOfCounted = 0;
            // another loop four counting occurrences of countedCharacter:
            for (int j = 0; j < allLetters.length(); j++) {
                if (countedCharacter == allLetters.charAt(j)) {
                    occurrenceOfCounted++;
                }

            }
            map.put(countedCharacter, occurrenceOfCounted);
        }
        return new HashMap<>();
    }

}

