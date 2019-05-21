package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Employee {
    private String name;
    private int founded;

    List<Employee> employees = new ArrayList<>();


    public Restaurant(String name, int founded) {
        super(name);
        this.founded = founded;
    }

    @Override
    public void work() {

    }

    public void hire(Employee employee) {
        employees.add(employee);

    }

    public void guestsArrived() {
        for (Employee employee : employees) {
            employee.work();
        }
    }
}
