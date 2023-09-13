import java.util.Scanner;

public class DaysInAMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = Integer.parseInt(scanner.nextLine());
        int result = 0;
        String errorMessage = "Invalid month number!";
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                result = 31;
                break;
            case 2:
                result = 28;
                break;
            case 4, 6, 9, 11:
                result = 30;
                break;
            default:
                System.out.printf("%s", errorMessage);
                return;
        }

        System.out.printf("The days of month are: %d", result);
    }
}
