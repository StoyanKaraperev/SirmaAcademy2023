import java.util.Scanner;

public class FuelEfficiency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = Double.parseDouble(scanner.nextLine());
        double totalFuelConsumed = Double.parseDouble(scanner.nextLine());
        double fuelEfficiency = distance / totalFuelConsumed;
        System.out.printf("Average speed is: %.2f", fuelEfficiency);
    }
}
