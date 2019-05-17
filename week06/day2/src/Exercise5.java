import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Exercise5 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

        IntSummaryStatistics sumOfOddNumbers = numbers.stream()
                .filter(i -> i % 2 != 0)
                // co ideme convertovat
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        // za sumOfOddNumbers mozeme pouzit vela roznych funkcii
        System.out.println(sumOfOddNumbers.getSum());
    }
}

// Write a Stream Expression to get the sum of the odd numbers in the following list:
