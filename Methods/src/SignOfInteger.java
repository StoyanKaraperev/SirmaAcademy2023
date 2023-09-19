import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        printSignOfIntegerNumber(inputNumber);

    }

    public static void printSignOfIntegerNumber(int digit){
        if (digit == 0) {
            System.out.printf("The number %d is zero", digit);
        } else if (digit < 0){
            System.out.printf("The number %d is negative", digit);
        } else {
            System.out.printf("The number %d is positive", digit);
        }
    }
}
