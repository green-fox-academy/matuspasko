package array;

public class Student {
    private int age;                //this are fields
    private String name;
    private boolean isHappy;

    public Student(int age, String name, boolean isHappy) {
        this.age = age;
        this.name = name;
        this.isHappy = isHappy;
    }

    public boolean getisHappy() {
        return isHappy;
    }

    public int getAge() {
        return age;
    }
}
