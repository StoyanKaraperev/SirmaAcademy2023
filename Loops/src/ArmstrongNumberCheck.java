import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();
        int expectedNumber = Integer.parseInt(inputNumber);
        int originalNumber = Integer.parseInt(inputNumber);
        int power = inputNumber.length();
        int reminder = 0;
        int result = 0;
        while (originalNumber != 0){
            reminder = originalNumber % 10;
            result += Math.pow(reminder, power);
            originalNumber /= 10;
        }

        if (result == expectedNumber){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
