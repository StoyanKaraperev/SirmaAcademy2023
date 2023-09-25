import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] inputCommands = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int inputRotation = inputCommands[0];
        int removeRotation = inputCommands[1];
        int searchElement = inputCommands[2];
        int [] inputElements = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> numbers = new ArrayDeque<Integer>();
        fillTheArrayDeque(numbers, inputRotation, inputElements);
        removeElementFromArrayDeque(numbers, removeRotation);
        printFinalResult(numbers, searchElement);
    }

    public static void fillTheArrayDeque(ArrayDeque<Integer> numbers, int inputRotation, int [] inputElements){
        for (int i = 0; i < inputRotation; i++) {
            numbers.offer(inputElements[i]);
        }
    }

    public static void removeElementFromArrayDeque(ArrayDeque<Integer> numbers, int removeRotation){
        for (int i = 0; i < removeRotation; i++) {
            numbers.poll();
        }
    }

    public static void printFinalResult(ArrayDeque<Integer> numbers, int searchElement){
        if (numbers.contains(searchElement)){
            System.out.println("True");
        } else if (numbers.isEmpty()){
            System.out.println("0");
        } else {
            int minValue = minValue(numbers);
            System.out.printf("%d ", minValue);
        }
    }
    public static int minValue(ArrayDeque<Integer> numbers){
        int minValue = Integer.MAX_VALUE;
        while (numbers.iterator().hasNext()){
            Integer i = numbers.iterator().next();
            minValue = Math.min(i, minValue);
            numbers.poll();
        }
        return minValue;
    }


}
