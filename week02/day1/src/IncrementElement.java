public class IncrementElement {
    public static void main(String[] args) {
        //- Create an array variable named `t`
        int[] t = new int[5];
        //     with the following content: `[1, 2, 3, 4, 5]`
        t[0] = 1;
        t[1] = 2;
        t[2] = 3;
        t[3] = 8;
        t[4] = 5;
        //- Increment the third element
        ++t[2];
        //- Print the third element
        System.out.println(t[2]);
    }
}