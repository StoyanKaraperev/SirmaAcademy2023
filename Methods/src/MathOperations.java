import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNumber = Double.parseDouble(scanner.nextLine());
        printAndCalculateResultOfTwoDigits(firstNumber, operator, secondNumber);
    }

    public static void printAndCalculateResultOfTwoDigits(double firstDigit, String operator, double secondDigit){
        double result = 0;
        String errorMessage = "Invalid operator!";
        if (operator.equals("/")){
            result = firstDigit / secondDigit;
        } else if (operator.equals("*")){
            result = firstDigit * secondDigit;
        } else if (operator.equals("-")){
            result = firstDigit - secondDigit;
        } else if (operator.equals("+")){
            result = firstDigit + secondDigit;
        } else {
            System.out.println(errorMessage);
            return;
        }

        System.out.printf("%.2f", result);
    }
}
