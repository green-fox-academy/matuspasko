package restauratn;

public class Waiter extends Employee{

    private int tips = 0;

    public Waiter(String name){
        super(name);
    }




    @Override
    public void work() {
        this.tips = tips +1;
        this.setExperience(getExperience() + 1);
    }
}
