import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputNumber = Double.parseDouble(scanner.nextLine());
        double numberToPow = Double.parseDouble(scanner.nextLine());
        printingAndReturnTheResultOfDigitToPower(inputNumber, numberToPow);
    }

    public static void printingAndReturnTheResultOfDigitToPower(double digitToPower, double power){
        double powerNumber = Math.pow(digitToPower, power);
        System.out.printf("%f", powerNumber);
    }

}
