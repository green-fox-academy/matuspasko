package ordermanagement;

import java.util.List;
import java.util.Random;

public class Order {
    private int id;
    private String status;
    private List<Dish> dishes;

    public Order(List<Dish> dishes) {
        this.dishes = dishes;
        this.status = "created";

        Random rand = new Random();
        this.id = rand.nextInt(9000) + 1000;

        // other way would be:
        // this.id = (int)(Math.random() * 9000 + 1000);
    }

    public void delay() {
        status = "waiting";
    }

    public void deliver() {
        status = "delivered";
    }

    public void reject() {
        status = "rejected";
    }

    public List<Dish> getDishes() {
        return dishes;
    }
}
