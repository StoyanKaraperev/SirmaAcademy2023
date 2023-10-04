import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String errorMessage = "Invalid input!";
        String dayOfWeek = "";
        if (!(0 < input && input <= 7)){
            System.out.printf("%s", errorMessage);
            return;
        } else if (input == 1){
            dayOfWeek = "Monday";
        } else if (input == 2){
            dayOfWeek = "Tuesday";
        } else if (input == 3){
            dayOfWeek = "Wednesday";
        } else if (input == 4){
            dayOfWeek = "Thursday";
        } else if (input == 5){
            dayOfWeek = "Friday";
        } else if (input == 6){
            dayOfWeek = "Saturday";
        } else {
            dayOfWeek = "Sunday";
        }

        System.out.printf("%s", dayOfWeek);
    }
}
