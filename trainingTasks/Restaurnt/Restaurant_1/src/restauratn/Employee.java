package restauratn;

abstract public class Employee {
    private String name;
    private int experience = 0;

    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;

    }
    abstract void work();

    public Employee(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}

