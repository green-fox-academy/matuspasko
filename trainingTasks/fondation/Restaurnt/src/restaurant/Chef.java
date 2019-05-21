package restaurant;

import java.util.HashMap;

public class Chef extends Employee {
    private int moodLevel;


    HashMap<String, Integer> mealsList = new HashMap<>();

    public Chef(String name) {
        super(name);
    }

    public Chef(String name, int experience) {
        super(name, experience);
    }

    @Override
    public void work() {
        this.setExperience(getExperience() + 1);
    }

    public void cook(String food) {
        if (mealsList.containsKey(food)) {
            mealsList.replace(food, mealsList.get(food) + 1);
        } else {
            mealsList.put(food, 1);
        }
    }
}
