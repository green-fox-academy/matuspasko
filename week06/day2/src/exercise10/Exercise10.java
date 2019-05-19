package exercise10;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise10 {
    public static void main(String[] args) {

        // vytvorili sme si list foxies s miesto datatypu sme tam vlozili class fox
        // a dali sme to rovne initilizeZoo (na to sme si tu metodu museli vytvorit)
        List<Fox> foxies = initilizeZoo();

        List<Fox> greenFox = foxies.stream()
                .filter(i -> i.getColor() == "green")
                .collect(Collectors.toList());
        System.out.println(greenFox);

        List<Fox> greenFoxUnder5 = foxies.stream()
                // .filter prejdeme cez list, najdeme green a (&&) najdeme mensie ako 5
                .filter(i -> i.getColor() == "green" && i.getAge() < 5)
                // da sa na to pouzit aj tato metoda ale je to viac kodu
                //   .filter(i -> i.getAge() < 5)
                .collect(Collectors.toList());
        System.out.println(greenFoxUnder5);

        Map<String, Integer> frequencyOfFoxes = foxies.stream()
                // jak to funguje ? Fox::getColor
                .collect(Collectors.groupingBy(Fox::getColor, Collectors.summingInt(c -> 1)));
        System.out.println(frequencyOfFoxes);
    }

    private static List<Fox> initilizeZoo() {

        List<Fox> listOfFoxes = new ArrayList<Fox>();

        Fox fox1 = new Fox("John", "green", 2);
        Fox fox2 = new Fox("Martin", "blue", 9);
        Fox fox3 = new Fox("Jozef", "ppurple", 3);
        Fox fox4 = new Fox("Petr", "green", 6);
        Fox fox5 = new Fox("Dan", "pink", 2);

        listOfFoxes.add(fox1);
        listOfFoxes.add(fox2);
        listOfFoxes.add(fox3);
        listOfFoxes.add(fox4);
        listOfFoxes.add(fox5);

        return listOfFoxes;
    }
}
