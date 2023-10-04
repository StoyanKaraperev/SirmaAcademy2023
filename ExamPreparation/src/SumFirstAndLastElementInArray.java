import java.util.Arrays;
import java.util.Scanner;

public class SumFirstAndLastElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine()
                .trim()
                .split("[,]");
        int firstElement = Integer.parseInt(input[0]);
        int lastElement = Integer.parseInt(input[input.length - 1]);
        int totalSum = firstElement + lastElement;
        System.out.printf("%d", totalSum);
    }
}
