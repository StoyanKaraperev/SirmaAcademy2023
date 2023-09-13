import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputMinutes = Integer.parseInt(scanner.nextLine());
        int hours = inputMinutes / 60;
        int minutes = inputMinutes % 60;
        System.out.printf("The time is: %02d:%02d", hours, minutes);
    }
}
