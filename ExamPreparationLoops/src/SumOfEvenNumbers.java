import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i % 2 == 0 && j % 2 == 0){
                    totalSum += i + j;
                }
            }
        }

        System.out.println(totalSum);
    }
}
