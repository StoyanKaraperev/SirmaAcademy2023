import java.util.Scanner;

public class EvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstRow = Integer.parseInt(scanner.nextLine());
        int secondRow = Integer.parseInt(scanner.nextLine());
        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        int firstRotation = firstRow + firstDigit;
        int secondRotation = secondRow + secondDigit;
        for (int i = firstRow; i <= firstRotation; i++){
            for (int y = secondRow; y <= secondRotation; y++){
                if (i == 2 && y == 2) {
                    System.out.printf("%d%d ", i, y);
                }
//
            }
            System.out.println();

        }
    }
}
