package array;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        // food and prices
        HashMap<String, Integer> firstMap = new HashMap<>();

        firstMap.put("Burger", 140); //
        firstMap.put("Eggs", 5);
        firstMap.put("Ramen", 180);
        firstMap.put("Rericha", 20);

        //Food and producer
        HashMap<String, String> secondMap = new HashMap<>();
        secondMap.put("Burger", "MC");
        secondMap.put("Eggs", "Chicken");
        secondMap.put("Ramen", "RmapenPrague");
        secondMap.put("Rericha", "Krecek");

        //Student and strength
        HashMap<Student, Integer> thirdMap = new HashMap<>();
        thirdMap.put(new Student(78, "Spiderman", false), 78);

        // get the second item from the firstMap

        //Get value for a key: price of the "Ramen":

        int priceForRamen = firstMap.get("Ramen");  // volame key a dostaneme  value ( cize cenu)

        // calculate the avarege of the price
        int sum = 0;
        for (Integer price : firstMap.values()) {
            sum += price;



        // Get keys for a value
//        for (Map.Entry<String, Integer> item : firstMap.entrySet()){
//            if (item.getValue()) == 240);

        }
        System.out.println(sum);

    }
}
