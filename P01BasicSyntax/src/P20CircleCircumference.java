import java.util.Scanner;

public class P20CircleCircumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());
        double circumference = 2 * Math.PI * radius;
        System.out.printf("The result is: %.2f", circumference);
    }
}
