import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExtractANonDecreasingSubsequenceFromAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] inputArray = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split(", "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int theLargestNumber = inputArray[0];
        int count = 0;
        List<Integer> increasingSubsequence = new ArrayList<Integer>();
        for (int i = 0; i < inputArray.length; i++) {
            if (count == 0){
                increasingSubsequence.add(theLargestNumber);
            } else {
                count = 0;
            }
            for (int j = i + 1; j < inputArray.length ; j++) {
                if ( theLargestNumber < inputArray[j]){
                    theLargestNumber = inputArray[j];
                    break;
                } else {
                    count++;
                    break;
                }
            }

        }
        for (int num : increasingSubsequence) {
            System.out.printf("%d ", num);
        }
    }
}
