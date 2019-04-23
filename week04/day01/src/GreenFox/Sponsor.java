package GreenFox;

public class Sponsor extends Person {
    String company;
    int hiredStudents;
    int hire;

    public Sponsor(String name, int age, String gender, String company) {
        super(age, name, gender);
        this.company = company;
    }

    public Sponsor() {
        super();
        company = "Google";
        hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi I am " + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired " + " hiredStudents " + "students so far.");
    }


    public void getGoal() {
        System.out.println("Hire brilliant junior sofrware dewelopers");
    }

    public int hire() {
        return hiredStudents++;

    }
}
