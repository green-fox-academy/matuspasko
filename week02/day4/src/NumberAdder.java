import java.util.ArrayList;

public class NumberAdder {

    public static void main (String[] arg){
       System.out.println(factorial(4));
    }

    public static int factorial(int n) {

       if (n <= 1){
           return 1;
        }
       return n + factorial( n -1);

    }

}
