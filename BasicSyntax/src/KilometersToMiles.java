import java.util.Scanner;

public class KilometersToMiles {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int kilometers = Integer.parseInt(scanner.nextLine());
            double oneMile = 0.621371192;
            double converter = kilometers * oneMile;
            System.out.printf("%f", converter);
        }
}
