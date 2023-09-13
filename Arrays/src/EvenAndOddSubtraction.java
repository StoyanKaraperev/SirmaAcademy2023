import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split(","))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int difference = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                sumEvenNumbers += numbers[i];
            } else {
                sumOddNumbers += numbers[i];
            }
        }
        difference = sumEvenNumbers - sumOddNumbers;
        System.out.printf("%d", difference);
    }
}
