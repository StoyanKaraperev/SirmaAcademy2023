import java.util.*;

public class ProcessOddNumbers {
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
            if (!(i % 2 == 0)) {
                int doubled = inputArray[i] * 2;
                outputArray.add(doubled);
            }
        }

        Collections.reverse(outputArray);
        for (Integer number : outputArray) {
            System.out.printf("%d ", number);
        }
    }

}
