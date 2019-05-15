package restauratn;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Employee {
    private String name;
    private int founded;
    List<Employee> employees = new ArrayList<>();


    public Restaurant(String name) {
        super(name);
    }

    public Restaurant(String name,   int founded) {
        super(name);
        this.founded = founded;

    }


    public void guestsArrived() {
        for (Employee employee : employees) {
            employee.work();

        }
    }

    public void hire(Employee employee) {
        employees.add(employee);

    }

    @Override
    void work() {

    }

}

