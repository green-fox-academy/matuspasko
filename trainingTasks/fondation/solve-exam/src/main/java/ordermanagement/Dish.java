package ordermanagement;

import java.util.HashMap;

public class Dish {
    private String name;
    private HashMap<String, Integer> ingredients;

    public Dish(String name, HashMap<String, Integer> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public HashMap<String, Integer> getIngredients() {
        return ingredients;
    }
}
