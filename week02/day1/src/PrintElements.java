import java.util.Arrays;

public class PrintElements {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[4, 5, 6, 7]`
        int[] numbers = { 4, 5, 6, 7 };
        int i;
        // - Print all the elements of `numbers`
            for (i = 0; i < 4; i = i+1){
                System.out.println("numbers[" + i + "]:"+ numbers[i]);
        }
    }
}