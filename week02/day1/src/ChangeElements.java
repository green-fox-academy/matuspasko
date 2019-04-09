import java.util.Arrays;

public class ChangeElements {
    public static void main(String[] args) {
        // - Create an array variable named `s`
        int[] s =new int[6];
        //   with the following content: `[1, 2, 3, 8, 5, 6]`
        s [0]=1;
        s [1]=2;
        s [2]=3;
        s [3]=8;
        s [4]=5;
        s [5]=6;
        // - Change the 8 to 4
        for (int num : s) {
            if ( num == 8) {

            }
        }

        for (int i = 0; i < s.length; i++) {
            int num = s[i];
            if (num == 8) {
                s[i] = 4;
            }
        }
        System.out.println(Arrays.toString(s));
        // - Print the fourth element
        System.out.println("sum of the fourth element: " +  s[3] );
    }
}

