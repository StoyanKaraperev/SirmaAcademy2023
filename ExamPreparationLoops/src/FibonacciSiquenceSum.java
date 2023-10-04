import java.util.Scanner;

public class FibonacciSiquenceSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rotation = Integer.parseInt(scanner.nextLine());
        int fib = 0;

        for (int i = 2; i < rotation; i++) {
            fib += fib - (i - 1) + (fib - (i - 2));
        }



    }
}
