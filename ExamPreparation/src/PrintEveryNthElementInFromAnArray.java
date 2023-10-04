import java.util.Scanner;

public class PrintEveryNthElementInFromAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine()
                .trim()
                .split("[,]");
        int step = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input.length; i += step) {
            String currentElement = input[i];
            System.out.printf("%s ", currentElement);
        }
    }
}
