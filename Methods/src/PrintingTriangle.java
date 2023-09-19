import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        printingTriangle(inputNumber);
    }

    public static void printingTriangle(int count){
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }

        for (int i = count; i > 1; i--) {
            for (int j = i ; j > 1; j--) {
                int start = i - j + 1;
                System.out.printf("%d ", start);
            }

            System.out.println();
        }
    }
}
