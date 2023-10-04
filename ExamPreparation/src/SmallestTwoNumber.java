import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SmallestTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine()
                .trim()
                .split(", ");
        ArrayList<Integer> smallestNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int currentNum = Integer.parseInt(numbers[i]);
            smallestNumbers.add(currentNum);
        }

        Collections.sort(smallestNumbers);
        for (int i = 0; i < 2; i++) {
            System.out.printf("%d ", smallestNumbers.get(i));
        }
    }

}
