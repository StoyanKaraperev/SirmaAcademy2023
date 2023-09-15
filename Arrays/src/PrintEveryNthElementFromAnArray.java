import java.util.Scanner;

public class PrintEveryNthElementFromAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] inputArray = scanner.nextLine()
                .trim()
                .split(",");
        int step = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < inputArray.length; i += step) {
            System.out.printf("%s ", inputArray[i]);
        }

    }
}
