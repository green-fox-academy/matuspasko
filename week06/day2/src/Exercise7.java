import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise7 {
    public static void main(String[] args) {

        String startLether = "N";
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        // miesto List<String> pouzijeme Stream<String> (vdaka tomu mozeme zapista kod na
        // collect rovno to funkcie sout
        Stream<String> startWithN = cities.stream()
                // .startsWith stream nam poskytuje funkciu na zacanie s konkretnym stringom
                .filter(i -> i.startsWith(startLether));
        System.out.println(startWithN.collect(Collectors.toList()));
    }
}
//Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list: