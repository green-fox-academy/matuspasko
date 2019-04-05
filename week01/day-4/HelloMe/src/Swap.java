public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        System.out.println("Before:a = "+a+"\tb = "+b);

        //swap
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After: a = "+a+"\tb = "+b);
    }
}
