import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {

        List<String> randomStrings = Arrays.asList("J", "K");
        // vytvorime string kde chceme spojit znaky z array
        String concanate = randomStrings.stream()
                // asi ideme cez mapu a pridelime jej hodnotu
                .map(String::valueOf)
                // .joining spoji znaky
                .collect(Collectors.joining());
        System.out.println(concanate);
    }
}
// Write a Stream Expression to concatenate a Character list to a string!