import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumberStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] inputNumbers = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        printReverseInputArray(inputNumbers);
    }

    public static void printReverseInputArray(int [] numbers){
        ArrayDeque<Integer> stackOfNumbers = new ArrayDeque<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            stackOfNumbers.push(numbers[i]);
        }

        int originalSizeOfStack = stackOfNumbers.size();
        for (int i = 0; i < originalSizeOfStack; i++) {
            int popNumber = stackOfNumbers.pop();
            System.out.printf("%d ", popNumber);
        }
    }
}
