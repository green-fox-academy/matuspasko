

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ToDoApp {

    public static void main(String[] args) {
        Path pathTasks = Paths.get("/Users/matuspasko/Desktop/matuspasko/week04/day04/tasks.txt");

        if (args.length == 0) {
            System.out.println("Command Line Todo apllication");
            System.out.println("==============================");
            System.out.println("");
            System.out.println("Comand line arguments:");
            System.out.println("-l List all the tasks");
            System.out.println("-a Adds a new task");
            System.out.println("-r Remove a task");
            System.out.println("-c Completes a task");

        }
        if (args[0].equals("-l")) {
            try {
                List<String> lines = Files.readAllLines(pathTasks);

                if (lines.isEmpty()) {
                    System.out.println("Not todo list for today.");
                } else {

                    for (int i = 0; i < lines.size(); i++) {
                        System.out.println((i + 1) + " - " + lines.get(i));
                    }
                }
            } catch (IOException e) {
                System.out.println("Error file");
            }

        }

    }
}
