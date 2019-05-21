package restauratn;

import java.util.HashMap;

public class Chef extends Employee {
    HashMap<String, Integer> meals = new HashMap<>();

    public Chef(String name) {
        super(name);
    }


    @Override
    void work() {
        this.setExperience(getExperience() + 1);
    }

    public void cook(String food) {
        if (meals.equals(food)) {
            food = food.replace(food, (food + 1));

        } else {
            meals.put(food, 1);
        }

    }
}
