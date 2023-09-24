import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine()
                .trim()
                .split("\\s+");
        ArrayDeque<String> calculator = new ArrayDeque<String>();
        for (int i = 0; i < input.length; i++) {
            calculator.offer(input[i]);
        }
        int totalSum = 0;
        while (calculator.size() > 1){
            int firstNumber = Integer.parseInt(calculator.pollFirst());
            String operation = calculator.pollFirst();
            int secondNumber = Integer.parseInt(calculator.pollFirst());

            switch (operation){
                case "+":
                    totalSum = firstNumber + secondNumber;
                    String firstElement = Integer.toString(totalSum);
                    calculator.offerFirst(firstElement);
                    break;
                case "-":
                    totalSum = firstNumber - secondNumber;
                    firstElement = Integer.toString(totalSum);
                    calculator.offerFirst(firstElement);
            }
        }

        String finalSum = calculator.pop();
        System.out.printf("%s ", finalSum);

    }
}
