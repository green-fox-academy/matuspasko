import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        //Vytvorime si Array List s listom integerov
        List<Integer> numbers = Arrays.asList(1, 9, -9, -32234, 8932489);

        //vytvorim si dalsi list integerov a priradim mu .stream  Array List numbers
        List<Integer> squeredNumbers = numbers.stream()
                // .filter ako for loop, prejde arrayom numbers ak je cislo vacsie ako tri
                // podmienka pokracuje
                .filter(i -> i > 3)
                // .map zobere hodnotu i ( je to cislo z mapy) a vynasoby ju rovnakou hodnotou
                .map(i -> i * i)
                // .cllect(Collectors.toList();
                .collect(Collectors.toList());
        // vytlacime stream funkciu
        System.out.println(squeredNumbers);
    }
}