import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arrayNumbers = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split(","))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        while (arrayNumbers.length > 1){
            int [] condensedArray = new int [arrayNumbers.length - 1];
            for (int i = 0; i < arrayNumbers.length - 1; i++) {
                condensedArray[i] = arrayNumbers[i] + arrayNumbers[i + 1];
            }
            arrayNumbers = condensedArray;
        }

        for (int number : arrayNumbers) {
            System.out.print(number);
        }

    }
}
