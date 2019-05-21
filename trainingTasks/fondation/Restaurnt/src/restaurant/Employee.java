package restaurant;

abstract public class Employee {
    private String name;
    private int experience = 0;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;

    }

    abstract public void work();

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }
}
