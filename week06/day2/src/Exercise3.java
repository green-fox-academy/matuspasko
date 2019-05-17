import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {

    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(3, 9, 2, 8, 6, 5);

        List<Integer> squeredNumbers = listNumbers.stream()
                // funkcia .filter prejde arryom vynasoby cislo vlastnou hodnotou
                // a ak je cislo vaccsie ako 20 tak ho zapise do Listu
                .filter(number -> number * number > 20)
                .collect(Collectors.toList());
        System.out.println(squeredNumbers);
    }
}
