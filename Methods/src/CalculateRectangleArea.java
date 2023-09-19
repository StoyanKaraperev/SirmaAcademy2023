import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sideA = Double.parseDouble(scanner.nextLine());
        double sideB = Double.parseDouble(scanner.nextLine());
        returnsTheAreaOfARectangle(sideA, sideB);
    }

    public static void returnsTheAreaOfARectangle(double firstDigit, double secondDigit){
        double area = 0;
        area = firstDigit * secondDigit;
        System.out.printf("%.2f", area);
    }
}
