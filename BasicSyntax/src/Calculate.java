import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int sumOfNumbers = Math.abs(firstNumber + secondNumber);
        int diffrence = Math.abs(firstNumber - secondNumber);
        int multiplication = firstNumber * secondNumber;
        double average = (double)sumOfNumbers / 2;
        System.out.printf("The sum is: %d%n", sumOfNumbers);
        System.out.printf("The difference is: %d%n", diffrence);
        System.out.printf("The product is: %d%n", multiplication);
        System.out.printf("The average is: %f", average);
    }
}
