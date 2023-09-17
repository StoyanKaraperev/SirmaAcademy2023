import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int wantedNumber = Integer.parseInt(scanner.nextLine());
        int iteration = Math.abs(firstNumber - secondNumber) + 1;
        int result = 0;
        int count = 0;
        for (int i = 1; i <= iteration; i++) {
            for (int y = 1; y <= iteration; y++) {
                count++;
                result = i + y;
                if (result == wantedNumber) {
                    System.out.printf("Combination %d - (%d + %d = %d) %n", count, i, y, wantedNumber);
                    return;
                }
            }
        }

        System.out.printf("%d Combination - neither equals %d %n",count, wantedNumber);
    }
}
