import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());
        String result = "";
        if (year % 100 == 0){
            if (year % 400 == 0){
                result = "It`s a leap year!";
            } else {
                result = "It`s not a leap year!";
            }
        } else if (year % 4 == 0){
            result = "It`s a leap year!";
        } else {
            result = "It`s not a leap year!";
        }

        System.out.printf("%s", result);
    }
}
