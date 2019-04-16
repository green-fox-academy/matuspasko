import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.rmi.server.ExportException;
import java.util.List;
import java.io.IOException;

public class PrintEachLine {
    public static void main(String[] args) {
        calledFile("my-file.txt");

    }
    // Write a program that opens a file called "my-file.txt", then prints
    // each line from the file.
    // If the program is unable to read the file (for example it does not exist),
    // then it should print the following error message: "Unable to read file: my-file.txt"

    public static void calledFile(String file) {

        try {
            Path filePath = Paths.get("/Users/matuspasko/Desktop/matuspasko/week03/day1/day1.iml");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.get(0));
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}