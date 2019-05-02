package array;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> nameOfStudents = new ArrayList<>(); // vytvorime listy
        List<Student> students = new ArrayList<>();

        students.add(new Student(26, "Peter", true));  // pridavame studentov
        students.add(new Student(27, "Natz", true));
        students.add(new Student(23, "Skywalker", false));
        students.add(new Student(33, "IDontKnow", true));

        boolean natyIsHappy = students.get(1).getisHappy();

        for (Student student : students) {
            int age = student.getAge();
            System.out.println(age);
        }
        // avarege age
        double count = 0;                     //musime urcit kde sa nam to bude napocitava
        for (Student student : students) {        //
            int age = student.getAge();
            count += age;
        }
        double average = count / students.size();
        System.out.println("This is avarege age of students: " + average);


    }
}
