package ordermanagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("hermelin", 20);
        inventory.put("oil", 200);

        Restaurant awesomeHerminsByTojas = new Restaurant(inventory);

        HashMap<String, Integer> ingredients = new HashMap<>();
        ingredients.put("hermelin", 1);
        ingredients.put("oil", 10);

        HashMap<String, Integer> ingredients2 = new HashMap<>();
        ingredients2.put("hermelin", 2);
        ingredients2.put("oil", 15);
        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("pickled hermelin", ingredients));
        dishes.add(new Dish("big pickled hermelin", ingredients2));
        Order o1 = new OfflineOrder(dishes,4);

        awesomeHerminsByTojas.receiveOrder(o1);
    }
}
