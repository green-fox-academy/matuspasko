import java.util.*;

public class FunctionPractive {
    // Create an function that requaires an integer list as
    // a parameter and returns
    // the biggest value from that list
    // print that value from the main method
    public static void main(String[] args) {
        // The list is:
        ArrayList<Integer> input = new ArrayList<>();
        input.add(25);
        input.add(5);
        input.add(7);
        System.out.println(biggestValue(input));
        System.out.println(getAverege(input));
        //The print resoult:
        // 25
        // Print average

    }

    public static double getAverege(ArrayList<Integer> list) {
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









