import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split(","))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int totalSum = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0) {
                totalSum += numbers[i];
            }
        }

        System.out.printf("%d", totalSum);
    }
}
