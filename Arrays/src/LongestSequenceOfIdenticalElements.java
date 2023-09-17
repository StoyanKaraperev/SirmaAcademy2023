import java.util.Arrays;
import java.util.Scanner;

public class LongestSequenceOfIdenticalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] inputArray = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int count = 1;
        int maxSequences = 0;
        int element = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] == inputArray[i + 1]){
                count++;
            } else {
                count = 1;
            }

            if (count >= maxSequences){
                maxSequences = count;
                element = inputArray[i];
            }
        }

        for (int i = 0; i < maxSequences; i++) {
            System.out.printf("%d ", element);
        }
    }
}
