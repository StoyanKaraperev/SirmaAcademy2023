import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine()
                .trim()
                .split("[,]");
        int totalSum = 0;
        for (int i = 0; i < input.length; i++) {
            int evenNumber = Integer.parseInt(input[i]);
            if (evenNumber % 2 == 0){
                totalSum += evenNumber;
            }
        }

        System.out.println(totalSum);
    }
}
