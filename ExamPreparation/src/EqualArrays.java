import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] firstArray = scanner.nextLine()
                .trim()
                .split("[,]");
        String [] secondArray = scanner.nextLine()
                .trim()
                .split("[,]");
        int totalSum = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i].equals(secondArray[i])){
                int currElement = Integer.parseInt(firstArray[i]);
                totalSum += currElement;
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index", i);
                return;
            }
        }

        System.out.printf("Arrays are equal. Sum is: %d", totalSum);
    }
}
