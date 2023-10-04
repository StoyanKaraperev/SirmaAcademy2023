import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class ProcessOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] numbers = scanner.nextLine()
                .trim()
                .split(", ");
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int currNumber = Integer.parseInt(numbers[i]);
            if (i % 2 != 0){
                currNumber = Math.multiplyExact(currNumber, 2);
                output.add(currNumber);
            }
        }

        Collections.reverse(output);
        for (int num : output) {
            System.out.printf("%d ", num);
        }
    }
}
