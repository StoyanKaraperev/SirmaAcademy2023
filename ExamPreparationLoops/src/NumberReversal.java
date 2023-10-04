import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] number = scanner.nextLine()
                .trim()
                .split("");
        for (int i = number.length - 1; i >= 0 ; i--) {
            System.out.printf("%s", number[i]);
        }
    }
}
