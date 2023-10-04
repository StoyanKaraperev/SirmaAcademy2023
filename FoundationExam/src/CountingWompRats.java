import java.util.Scanner;

public class CountingWompRats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialCount = Integer.parseInt(scanner.nextLine());
        int increaseCount = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        int totalResult = 0;
        int totalTemp = 0;
        int temp = initialCount;
        for (int i = 1; i < hours; i++) {
            totalTemp = temp + increaseCount ;
            totalResult += totalTemp;
            temp = totalTemp;
        }
        totalResult += initialCount;
        System.out.println(totalResult);
    }
}
