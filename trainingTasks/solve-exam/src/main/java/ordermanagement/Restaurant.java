package ordermanagement;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private HashMap<String, Integer> inventory;

    public Restaurant(HashMap<String, Integer> inventory) {
        this.inventory = inventory;
    }

    public Order receiveOrder(Order order) {
        HashMap<String, Integer> needs = new HashMap<>();
        needs.put("hermelin", 0);
        needs.put("oil", 0);

        for (Dish currentDish : order.getDishes()) {
            HashMap<String, Integer> ingredientsOfOrder = currentDish.getIngredients();
            for (Map.Entry<String, Integer> ingredient : ingredientsOfOrder.entrySet()) {
                String name = ingredient.getKey();
                needs.put(name, needs.get(name) + ingredient.getValue());
            }
        }
        System.out.println(needs);
        for (Map.Entry<String, Integer> ingredient : inventory.entrySet()) {
            if (ingredient.getValue() < needs.get(ingredient.getKey())) {
                System.out.println("FUUUCK");
            }
        }


        return order;
    }
}
