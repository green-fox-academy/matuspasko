package restaurant;

public class Waiter extends Employee {
    private int tips = 0;

    public Waiter(String name, int experience) {
        super(name, experience);
    }

    public Waiter(String name){
        super(name);
    }

    @Override
    public void work() {
        this.tips += 1;
        this.setExperience(getExperience()+ 1);
    }
}
