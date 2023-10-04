import java.util.ArrayList;
import java.util.Scanner;

public class NegativePositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine()
                .trim()
                .split(", ");
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            int currentNum = Integer.parseInt(input[i]);
            if (currentNum >= 0){
                output.add(currentNum);
            } else {
                output.add(0, currentNum);
            }
        }

        for (int num : output) {
            System.out.printf("%d%n", num);
        }
    }
}
