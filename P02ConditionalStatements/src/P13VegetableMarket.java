import java.util.Scanner;

public class P13VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vegetable = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;
        String errorMessage = "Error";
        if (dayOfWeek.equals("Monday")
                || dayOfWeek.equals("Tuesday")
                || dayOfWeek.equals("Wednesday")
                || dayOfWeek.equals("Thursday")
                || dayOfWeek.equals("Friday")){
            if (vegetable.equals("tomato")){
                totalPrice = quantity * 2.50;
            } else if (vegetable.equals("onion")){
                totalPrice = quantity * 1.20;
            } else if (vegetable.equals("lettuce")){
                totalPrice = quantity * 0.85;
            } else if (vegetable.equals("cucumber")){
                totalPrice = quantity * 1.45;
            } else if (vegetable.equals("pepper")){
                totalPrice = quantity* 5.50;
            } else {
                System.out.printf("%s", errorMessage);
                return;
            }
        } else if (dayOfWeek.equals("Saturday")
                || dayOfWeek.equals("Sunday")){
            if (vegetable.equals("tomato")){
                totalPrice = quantity * 2.80;
            } else if (vegetable.equals("onion")){
                totalPrice = quantity * 1.30;
            } else if (vegetable.equals("lettuce")){
                totalPrice = quantity * 0.85;
            } else if (vegetable.equals("cucumber")){
                totalPrice = quantity * 1.75;
            } else if (vegetable.equals("pepper")){
                totalPrice = quantity* 3.50;
            } else {
                System.out.printf("%s", errorMessage);
                return;
            }
        } else {
            System.out.printf("%s", errorMessage);
            return;
        }

        System.out.printf("The final price is: %.2f", totalPrice);
    }
}
