import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;


public class CountLines {
    public static void main(String[] args) {
        numberOfLines("my-file.txt");
        System.out.println(numberOfLines("/Users/matuspasko/Desktop/matuspasko/week03/day1/day1.iml"));
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

    }

    public static int numberOfLines(String filename) {
        Path filePath = Paths.get(filename);
        try {
            List<String> lines = Files.readAllLines(filePath);
            return lines.size();
        } catch (IOException e) {
            return 0;
        }
    }
}



