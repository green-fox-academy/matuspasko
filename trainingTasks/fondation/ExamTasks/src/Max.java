import java.lang.reflect.Array;
import java.util.ArrayList;

public class Max {
    public static void main(String[] args) {
         int [] numbers= {1, 2, 5, 7 , 8, 12, 11} ;
         int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i] ){
                max = numbers[i];
                System.out.println(max);
        }





        }


    }
}
