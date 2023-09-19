import java.util.Scanner;

public class StartUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vehicleSpecification = scanner.nextLine()
                .trim()
                .split(" ");
        double fuelConsumption = Double.parseDouble(scanner.nextLine());
        String type = vehicleSpecification[0];
        String model = vehicleSpecification[1];
        int power = Integer.parseInt(vehicleSpecification[2]);
        Engine engine = new Engine(power);
        double fuel = Double.parseDouble(vehicleSpecification[3]);
        Veehicle veehicle = new Veehicle(type, model, engine, fuel);
        veehicle.drive(fuelConsumption);
        veehicle.printFuelLeft();
    }

}
