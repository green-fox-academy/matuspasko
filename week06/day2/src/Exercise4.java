import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {

        // vytvorime array List
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        // pouzijem IntSummaryStatic lebo potrebujeme vypocitat statistyku z streamu
        IntSummaryStatistics avaregeOddNumbers = numbers.stream()
                .filter(i -> i % 2 != 0)
                // convertujeme Integer do int
                .mapToInt(Integer::intValue)
                // sluzi na vratenie hodnoty
                .summaryStatistics();
        // stream v static nam ponuka moznost vypocitat rovno Average
        System.out.println(avaregeOddNumbers.getAverage());
    }
}
//Write a Stream Expression to get the average value of the odd numbers from the following list: