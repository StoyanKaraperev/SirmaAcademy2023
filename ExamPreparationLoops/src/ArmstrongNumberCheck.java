import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String [] numbers = number
                .split("");
        double totalSum = 0;
        int power = number.length();
        for (int i = 0; i < numbers.length; i++) {
            int currentNum = Integer.parseInt(numbers[i]);
            totalSum += Math.pow(currentNum, power);
        }

        int equal = Integer.parseInt(number);
        if (totalSum == equal){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
