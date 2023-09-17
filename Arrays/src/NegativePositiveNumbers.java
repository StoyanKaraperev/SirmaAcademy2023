import java.util.*;

public class NegativePositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] inputArray = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split(", "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        List<Integer> outputArray = new ArrayList<Integer>();
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < 0){
                outputArray.add(0, inputArray[i]);
            } else {
                outputArray.add(inputArray[i]);
            }

        }

        for (int num : outputArray) {
            System.out.printf("%d %n", num);
        }
    }
}
