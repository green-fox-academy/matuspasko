package ordermanagement;

import java.util.List;

public class OfflineOrder extends Order {
    private int table;

    public OfflineOrder(List<Dish> dishes, int table) {
        super(dishes);
        this.table = table;
    }
}

