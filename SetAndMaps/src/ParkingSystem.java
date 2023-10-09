import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> parkingSystem = new LinkedHashMap<>();
        fillAndCompareElementsInParikngSystem(numberOfCommands, scanner, parkingSystem);
        printingTheResult(parkingSystem);
    }

    private static void fillAndCompareElementsInParikngSystem(int numberOfCommands, Scanner scanner, LinkedHashMap<String, String> parkingSystem) {
        for (int i = 0; i < numberOfCommands; i++) {
            String [] inputInformation = scanner.nextLine()
                    .trim()
                    .split("\\s+");
            String command = inputInformation[0];
            String user = inputInformation[1];
            if (command.equals("Register")){
                String carNumber = inputInformation[2];
                if (!parkingSystem.containsKey(user)){
                    parkingSystem.put(user, carNumber);
                    System.out.printf("%s registered %s successfully.%n", user, carNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s.%n", carNumber);
                }
            } else if (command.equals("Unregister")){
                if (parkingSystem.containsKey(user)){
                    parkingSystem.remove(user);
                    System.out.printf("%s unregistered successfully.%n", user);
                } else {
                    System.out.printf("ERROR: user %s not found.%n", user);
                }
            } else {
                System.out.println("The command is incorrect!");
            }
        }
    }

    private static void printingTheResult(LinkedHashMap<String, String> parkingSystem) {
        for (Map.Entry<String, String> information : parkingSystem.entrySet()) {
            String user = information.getKey();
            String carNumber = information.getValue();
            System.out.printf("%s => %s%n", user, carNumber);
        }
    }
}
