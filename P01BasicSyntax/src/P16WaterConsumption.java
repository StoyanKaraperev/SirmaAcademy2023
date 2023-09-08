import java.util.Scanner;

public class P16WaterConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalWaterConsumption = Double.parseDouble(scanner.nextLine());
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        double consumptionPerPerson = totalWaterConsumption / (7 * numberOfPeople);
        System.out.printf("Daily consumption per person is: %.2f", consumptionPerPerson);
    }
}
