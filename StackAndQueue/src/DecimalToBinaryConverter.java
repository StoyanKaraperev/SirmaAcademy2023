import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stackNumbers = new ArrayDeque<Integer>();

        fillBinariStack(stackNumbers, input);
        printStack(stackNumbers);
    }
    public static void fillBinariStack (ArrayDeque<Integer> stackNumbers, int input){
        while (input != 0){
            int reminder = input % 2;
            stackNumbers.push(reminder);
            input /= 2;
        }
    }
    public static void printStack (ArrayDeque<Integer> stackNumbers){
        int originalSize = stackNumbers.size();
        for (int i = 0; i < originalSize; i++) {
            System.out.print(stackNumbers.poll());
        }
    }
}

