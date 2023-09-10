import java.util.Scanner;

public class P14Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String budgetErrorMessage = "The budget should be between 10.00 and 5000.00";
        String seasonErrorMessage = "The season must be summer or winter";
        String destination = "";
        String typeOfHoliday = "";
        double amountSpent = 0.0;
        if (!(10.00 <= budget && budget <= 5000.00)){
            System.out.printf("%s", budgetErrorMessage);
            return;
        } else if (!(season.equals("summer") || season.equals("winter"))){
            System.out.printf("%s", seasonErrorMessage);
            return;
        } else if (budget <= 100){
            destination = "Bulgaria";
            if (season.equals("summer")){
                typeOfHoliday = "Camp";
                amountSpent = budget * 0.3;
            } else {
                typeOfHoliday = "Hotel";
                amountSpent = budget * 0.7;
            }
        } else if (budget <= 1000){
            destination = "Europe";
            if (season.equals("summer")){
                typeOfHoliday = "Camp";
                amountSpent = budget * 0.4;
            } else {
                typeOfHoliday = "Hotel";
                amountSpent = budget * 0.8;
            }
        } else {
                destination = "Asia";
                typeOfHoliday = "Hotel";
                amountSpent = budget * 0.9;
        }

        System.out.printf("Somewhere in %s %n", destination);
        System.out.printf("%s - %.2f", typeOfHoliday, amountSpent);
    }
}
