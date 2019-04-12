public class SumDigits {
    public static void main(String[] arg) {
        // int lastnumber = lastNumber();
        // System.out.println(lastnumber);
        // System.out.println(secondNumber());
        // System.out.println(secondNumber2());
        // System.out.println(firstNumber());
        System.out.println(doneNumber(568));


    }

    public static int lastNumber(int input) {
        return input % 10;
    }

    public static int secondNumber(int input) {
        return input / 10;
    }

    public static int secondNumber2(int input) {
        return secondNumber(input) % 10;
    }

    public static int firstNumber(int input) {
        return secondNumber(input) / 10;
    }

    public static int doneNumber(int input) {
        return lastNumber(input) + secondNumber2(input) + firstNumber(input);
    }
}

