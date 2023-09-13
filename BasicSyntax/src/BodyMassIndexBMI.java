import java.util.Scanner;

public class BodyMassIndexBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble((scanner.nextLine()));
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("BMI: %.2f", bmi);
    }
}
