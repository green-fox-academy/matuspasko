package ordermanagement;

import java.util.List;

public class OnlineOrder extends Order {
    private String address;

    public OnlineOrder(List<Dish> dishes, String address) {
        super(dishes);
        this.address = address;
    }
}
