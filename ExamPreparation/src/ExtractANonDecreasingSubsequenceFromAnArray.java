import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExtractANonDecreasingSubsequenceFromAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split(", "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int biggestNumber = Integer.MIN_VALUE;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];
            if (biggestNumber < currentNum) {
                biggestNumber = currentNum;
                result.add(biggestNumber);
            }
        }

        for (int num : result) {
            System.out.printf("%d ", num);
        }

    }
}
