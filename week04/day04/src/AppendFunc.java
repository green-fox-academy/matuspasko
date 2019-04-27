public class AppendFunc {
    //  Create the usual class wrapper
    //  and main method on your own.
    public static void main(String[] args) {
        // - Create a string variable named `typo` and assign the value `Chinchill` to it
        String typo = "Chinchill";
        // - Print the result of `appendAFunc(typo)`
        System.out.println(appendFunc(typo));
    }

    // - Write a function called `appendAFunc` that gets a string as an input,
    public static String appendFunc(String inputParameter) {

        //   appends an 'a' character to its end and returns with a string
        String b = "a";
        return inputParameter + b;

    }
}
