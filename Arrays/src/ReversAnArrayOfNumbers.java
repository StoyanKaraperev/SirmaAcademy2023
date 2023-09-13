import java.util.Arrays;
import java.util.Scanner;

public class ReversAnArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElement = Integer.parseInt(scanner.nextLine());
        int [] numbers = Arrays
                .stream(scanner.nextLine()
                        .split(","))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int [] reversArray = new int[numberOfElement];

        for (int i = 0; i < reversArray.length; i++){
            reversArray[i] = numbers[i];
        }

        for (int i = 0; i < reversArray.length / 2; i++){
            int revers = reversArray[i];
            reversArray[i] = reversArray[reversArray.length - i - 1];
            reversArray[reversArray.length - i - 1] = revers;
        }

        for (int i = 0; i < reversArray.length; i++){
            System.out.print(reversArray[i] + " ");
        }
     }
}
