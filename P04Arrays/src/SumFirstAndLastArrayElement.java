import java.util.Arrays;
import java.util.Scanner;

public class SumFirstAndLastArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arrNumbers = Arrays
                .stream(scanner.nextLine().split(","))
                .mapToInt((e -> Integer.parseInt(e)))
                .toArray();
        int totalSum = 0;
        totalSum = arrNumbers[0] + arrNumbers[arrNumbers.length - 1];
        System.out.println(totalSum);
    }
}
