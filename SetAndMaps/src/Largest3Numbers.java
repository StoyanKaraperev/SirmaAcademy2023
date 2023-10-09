import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] inputNumbers = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        TreeSet<Integer> numbersSet = new TreeSet<>();
        for (int i = 0; i < inputNumbers.length; i++) {
            numbersSet.add(inputNumbers[i]);
        }

        int originalSize = numbersSet.size();
        if (originalSize >= 3){
            for (int i = 0; i < 3; i++) {
                System.out.printf("%d ", numbersSet.pollLast());
            }
        } else {
            for (int i = 0; i < originalSize; i++) {
                System.out.printf("%d ", numbersSet.pollLast());
            }
        }

    }
}
