package restauratn;

public class Manager extends Employee{
    private int moodLevel = 400;

    public Manager(String name){
        super(name);
    }

    public Manager(String name, int experience, int moodLevel) {
        super(name, experience);
        this.moodLevel = moodLevel;
    }

    public Manager(String name, int moodLevel) {
        super(name);
        this.moodLevel = moodLevel;
    }

    @Override
    void work() {
        this.setExperience(getExperience() + 1);
        haveAmeeting();
    }

    public void haveAmeeting(){
        this.moodLevel -= this.getExperience();

    }

}
