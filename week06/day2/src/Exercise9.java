import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
        String character = "jhsdjfsd";

        // vytvorime Mapu do ktorej nahrame key string a value integer
        Map<Character, Integer> frequencyOfCharacters = character.chars()
                // prejdeme mapou a priradime char
                .mapToObj(i -> (char) i)
                //vsetko skolektujeme
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(i -> 1)));
        System.out.println(frequencyOfCharacters);
    }
}
// Write a Stream Expression to find the frequency of characters in a given string!