import java.util.Scanner;

public class P14Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstCarSpeed = Integer.parseInt(scanner.nextLine());
        int secondCarSpeed = Integer.parseInt(scanner.nextLine());
        int firstCarKilometers = firstCarSpeed * 5;
        int secondCarKilometers = secondCarSpeed * 3;
        int difference = Math.abs(firstCarKilometers - secondCarKilometers);
        System.out.printf("Difference between the two cars is: %d", difference);
    }
}
