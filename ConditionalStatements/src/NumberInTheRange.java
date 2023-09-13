import java.util.Scanner;

public class NumberInTheRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comparedNumber = Integer.parseInt(scanner.nextLine());
        if (comparedNumber >= -100 && comparedNumber <= 100 && comparedNumber != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
