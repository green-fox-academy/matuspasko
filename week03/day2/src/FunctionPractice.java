import java.util.*;

public class FunctionPractice {
    // Create an function that requires an integer list as
    // a parameter and returns
    // the biggest value from that list
    // print that value from the main method
    public static void main(String[] args) {
        // The list is:
        ArrayList<Integer> input = new ArrayList<>();
        input.add(25);
        input.add(5);
        input.add(7);
        System.out.println(biggestValue(input) + " is the biggest number ");
        System.out.println(getAverage(input) + " is the average of numbers");
        //The print result:
        // 25
    }

    public static double getAverage(ArrayList<Integer> list) {
        int addList = 0;
        for (int i = 0; i < list.size(); i++) {
            addList = list.get(i) + addList;
        }
        double averege = addList / list.size();
        return averege;
    }

    public static Integer biggestValue(ArrayList<Integer> list) {
        Integer biggest = list.get(0);
        for (Integer number : list) {
            if (number > biggest) {
                biggest = number;
            }
        }
        return biggest;
    }
}
