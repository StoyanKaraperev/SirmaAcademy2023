import java.util.Scanner;

public class P12SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        switch (operator){
            case "add":
                result = firstNumber + secondNumber;
                break;
            case "subtract":
                result = firstNumber - secondNumber;
                break;
            case "divide":
                result = firstNumber / secondNumber;
                break;
            case "multiply":
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        System.out.printf("The result is: %.2f", result);

    }
}
