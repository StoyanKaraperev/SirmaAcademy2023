import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<String> carNumbers = new ArrayList<>();
        while (!input.equals("END")){
            String [] splitInput = input
                    .trim()
                    .split(",\\s+");
            String direction = splitInput[0];
            String carNumber = splitInput[1];
            if (direction.equals("IN")){
                carNumbers.add(carNumber);
            } else if (direction.equals("OUT")){
                if (carNumbers.contains(carNumber)){
                    carNumbers.remove(carNumber);
                } else {
                    System.out.println("The car number not exist!");
                }
            } else {
                System.out.println("Direction invalid!");
            }

            input = scanner.nextLine();
        }

        if (carNumbers.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for (int i = 0; i < carNumbers.size(); i++) {
                System.out.println(carNumbers.get(i));
            }
        }
    }
}
