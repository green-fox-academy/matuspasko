import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostRainyDays {
    public static void main(String[] args) throws Exception{
        int numberOfRemovals = 0;
        String [] tobeFiltered = {"Gyor"};
        String theContent =
                readFileAsString("/Users/matuspasko/Desktop/matuspasko/week05/Normal Exam/src/main/java/rainydays.txt");
        String[] listOfWord = theContent.split("[ Gyor,RAINY]");
        //System.out.println(Arrays.toString(listOfWord));

        for(int i = 0; i< listOfWord.length;i++){
            for(int j = 0; j < tobeFiltered.length; j++){
                if(listOfWord[i].toLowerCase().equals(tobeFiltered[j])){
                    //theContent.replace(listOfWord[i], "");
                    System.out.println(listOfWord[i]);
                    numberOfRemovals++;

                }
            }
        }
        System.out.println(numberOfRemovals);
    }
    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

}