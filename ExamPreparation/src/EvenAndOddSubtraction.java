import java.util.Iterator;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine()
                .trim()
                .split("[,]");
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int totalResult = 0;
        for (int i = 0; i < input.length; i++) {
            int currNumber = Integer.parseInt(input[i]);
            if (currNumber % 2 == 0){
                sumOfEven += currNumber;
            } else {
                sumOfOdd += currNumber;
            }
        }

        totalResult = sumOfEven - sumOfOdd;
        System.out.println(totalResult);
    }
}
