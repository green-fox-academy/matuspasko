public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10 || number1 >= 100) || (number2 < 10 || number2 >= 100)) {
            return false;
        }
        int firstNumber1d = number1 / 10;
        int firstNumber2d = number1 % 10;

        int secondNumber1d = number2 / 10;
        int secondNumber2d = number2 % 10;

        if ((firstNumber1d == secondNumber1d || firstNumber1d == secondNumber2d) ||
                (firstNumber2d == secondNumber1d || firstNumber2d == secondNumber2d)) {
            return true;
        }
        return false;
    }
}
