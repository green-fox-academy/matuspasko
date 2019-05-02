package animal_protection;

import java.util.Random;

public class Dog extends Animal {

    public Dog(String ownerName, boolean isHealthy, int healCost) {
        super(ownerName, isHealthy, healCost);
        healingCost();
    }

    public void healingCost() {
        int max = 8;
        int min = 1;
        Random random = new Random();
        this.healCost = random.nextInt((max - min) + 1) + min;

    }
}
