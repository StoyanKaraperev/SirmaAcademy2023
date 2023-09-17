import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SmallestTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] inputArray = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split(", "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        ArrayList<Integer> outputArray = new ArrayList<Integer>();
        for (int i = 0; i < inputArray.length; i++) {
            outputArray.add(inputArray[i]);
        }

        Collections.sort(outputArray);
        for (int i = 0; i < 2; i++) {
            System.out.printf("%d ", outputArray.get(i));
        }
    }
}
