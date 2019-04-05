public class SecondsInAday {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        int currentIntHours;
        int currentIntMinutes;

        currentIntHours = currentHours * 60 * 60;
        currentIntMinutes = currentMinutes * 60;

        System.out.println(currentIntHours + currentIntMinutes + currentSeconds);

        // day if the current time is represented by the variables
        System.out.print(currentHours);
        System.out.print(":");
        System.out.print(currentMinutes);
        System.out.print(":");
        System.out.print(currentSeconds);

    }
}
