package animal_protection;

import java.util.Random;

public class Cat extends Animal {   /// need constructor asi vyzdy inak by to bolo cervene


    public Cat(String ownerName, boolean isHealthy, int healCost) {  // toto je construcktor
        super(ownerName, isHealthy, healCost);
        sethealingCost();              //tymto spustame healingCost
    }

    // will set random number for healingCost 0 - 6
    public void sethealingCost() {
        Random random = new Random();
        this.healCost = random.nextInt(7); //toto je na vytvorenia random number
    }
}


