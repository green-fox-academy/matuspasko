import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {

        String example = "HujghJGkkggJHjhjgJH";

        // String example priradime ako charakter
        String upperCase = example.chars()
                // .filter vyberie z Character isUpperCase
                .filter(Character::isUpperCase)
                // .mapToObj objektovu hodnotu Stream pozostavajucu z aplikovania danej funkcie
                .mapToObj(jaj -> Character.toString((char) jaj))
                // collector vzdy pozbiera a vrati spat
                .collect(Collectors.joining());
        System.out.println(upperCase);
    }
}
// Write a Stream Expression to find the uppercase characters in a string!
