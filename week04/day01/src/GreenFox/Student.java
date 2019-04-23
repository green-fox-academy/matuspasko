package GreenFox;

public class Student extends Person {
    String previosOrganization;
    int skippedDays;


    public Student(String name, int age, String gender, String previosOrganization) {
        super(age, name, gender);
        this.previosOrganization = previosOrganization;
        skippedDays = 0;


    }
    public Student(){
        super();
    }

    public void getGoal() {
        System.out.println("Be a junior software deweloper");
    }

    public void introduce() {
        System.out.println("Hi, I am " + name + ", a " + age + "year old" + gender + "from " + previosOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfdays) {
        skippedDays += numberOfdays;
    }


}
