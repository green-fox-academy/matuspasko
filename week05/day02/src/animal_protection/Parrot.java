package animal_protection;

import java.util.Random;

public class Parrot extends Animal {


    public Parrot(String ownerName, boolean isHealthy, int healCost) {
        super(ownerName, isHealthy, healCost);
        healingCost();
    }

    public void healingCost() {

        int max = 10;
        int min = 4;
        Random random = new Random();
        this.healCost = random.nextInt((max - min) + 1) + min;
    }
}
