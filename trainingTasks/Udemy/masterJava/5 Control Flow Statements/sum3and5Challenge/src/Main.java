public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (diveded3And5(i)) {
                System.out.println("Number " + i + " is devided with 3 and 5");
                sum = sum + i;
                count++;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }

    public static boolean diveded3And5(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return true;
        }
        return false;
    }
}
