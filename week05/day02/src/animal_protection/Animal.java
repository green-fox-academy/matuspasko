package animal_protection;


public class Animal {
    private String ownerName;       //owner name
    private boolean isHealthy;      // health state (true or false)
    protected int healCost;           // heal cost  , tym ze sme to dali protected mozu to vidiet aj children
    private String name;            // name of animal

    public Animal(String ownerName, boolean isHealthy, int healCost) {
        this.ownerName = ownerName;
        this.isHealthy = isHealthy;
        this.healCost = healCost;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void heal() {

        isHealthy = true;

    }


    public boolean isAdoptable() {

        if (isHealthy == true) {    // mozeme piuzot return is healthz
            return true;
        } else {
            return false;
        }
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public int getHealCost() {
        return healCost;
    }

    @Override
    public String toString() {   //vzdy vy zera takto nedava sa tam parameter
        String animalClassName = this.getClass().getSimpleName();
        if (isHealthy == false) {
            return name + " is not healthy " + healCost + " € " + " , and not adoptable";
        } else {
            return name + " is healthy, and adoptable";
        }
    }
}




