import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] firstArray = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split(","))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int [] secondArray = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split(","))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int totalSum = 0;
        int differentIndex = 0;
        int count = 0;
        if (firstArray.length != secondArray.length){
            System.out.println("Length is different!");
        } else {
            for (int i = 0; i < firstArray.length; i++){
                if (firstArray[i] == secondArray[i]){
                    totalSum += firstArray[i];
                    } else {
                    differentIndex = i;
                    count++;
                }
            }

        }

        if (count > 0){
            System.out.printf("Arrays are not identical. Found differences in %d index.", differentIndex);
        } else {
            System.out.printf("Arrays are identical. Sum is: %d", totalSum);
        }

    }
}
