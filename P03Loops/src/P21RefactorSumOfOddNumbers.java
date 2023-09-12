import java.util.Scanner;

public class P21RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;
        int oddNumber = 0;
        for (int i = 0; i < inputNumber; i++) {
            oddNumber = 2 * i + 1;
            System.out.printf("%d %n", oddNumber);
            totalSum += 2 * i + 1;
        }

        System.out.printf("Sum: %d%n", totalSum);
    }
}
