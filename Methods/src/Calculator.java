import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double firstDigit = Double.parseDouble(scanner.nextLine());
        double secondDigit = Double.parseDouble(scanner.nextLine());
        printingTheResultOfCalculation(command, firstDigit, secondDigit);
    }

    public static void printingTheResultOfCalculation(String action, double firstNumber, double secondNumber){
        double result = 0;
        String errorMessage = "Invalid action!";
        if (action.equals("add")){
            result = firstNumber + secondNumber;
        } else if (action.equals("subtraction")){
            result = firstNumber - secondNumber;
        } else if (action.equals("multiply")){
            result = firstNumber * secondNumber;
        } else if (action.equals("divide")){
            result = firstNumber / secondNumber;
        } else {
            System.out.printf("%s", errorMessage);
        }

        System.out.printf("%.2f ", result);
    }
}
