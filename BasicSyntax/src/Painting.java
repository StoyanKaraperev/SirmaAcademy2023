import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double paint = Integer.parseInt(scanner.nextLine());
        double redPaint = paint / 13;
        double yellowPaint = redPaint * 4;
        double whitePaint = redPaint * 8;
        System.out.printf("Red paint: %.4f%n", redPaint);
        System.out.printf("Yellow paint: %.4f%n", yellowPaint);
        System.out.printf("White paint: %.4f%n", whitePaint);
    }
}
