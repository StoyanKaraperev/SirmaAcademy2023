import java.util.Scanner;

public class AverageSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = Double.parseDouble(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());
        double averageSpeed = distance / hours;
        System.out.printf("Average speed is: %.2f", averageSpeed);
    }
}
