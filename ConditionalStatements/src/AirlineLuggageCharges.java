import java.util.Scanner;

public class AirlineLuggageCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = Integer.parseInt(scanner.nextLine());
        int sumOfAllDimensions = Integer.parseInt(scanner.nextLine());
        int dimentions = 0;
        int totalCharger = 0;
        if (weight > 50){
            totalCharger += 100;
        }
        if (sumOfAllDimensions > 158){
            dimentions = sumOfAllDimensions - 158;
            if (dimentions > 0 && dimentions <= 20){
                totalCharger += 50;
            } else if (dimentions <= 50){
                totalCharger += 100;
            } else {
                totalCharger += 200;
            }
        }
        if (weight > 50 && sumOfAllDimensions > 158){
            dimentions = sumOfAllDimensions - 158;
            if (!(dimentions > 0 && dimentions <= 20)){
                totalCharger += 50;
            }
        }

        System.out.printf("%d", totalCharger);
    }
}
