import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] inputNumbers = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split(""))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        printsAndCalculatesMultiplicationOfEvenAndOddNumbers(inputNumbers);
    }

    public static void printsAndCalculatesMultiplicationOfEvenAndOddNumbers(int [] numbers){
        int totalSumEvenNumbers = 0;
        int totalSumOddNumbers = 0;
        int totalResult = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                totalSumEvenNumbers += numbers[i];
            } else {
                totalSumOddNumbers += numbers[i];
            }
        }

        totalResult = Math.multiplyExact(totalSumEvenNumbers, totalSumOddNumbers);
        System.out.printf("%d", totalResult);
    }
}
