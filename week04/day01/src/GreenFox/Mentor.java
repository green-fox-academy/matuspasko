package GreenFox;

public class Mentor extends Person {
    String level;   // junior / intermediate / senior

    public Mentor(String name, int age, String gender, String level) {
        super(age, name, gender);
        this.level = level;
    }

    public Mentor() {
        super();
        level = "intermediate";
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers");
    }

    public void introduce() {
        System.out.println("Hi, I am " + "a " + age + "year old " + gender + " " + level + " mentor.");
    }

}