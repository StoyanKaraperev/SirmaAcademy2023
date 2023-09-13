import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String errorMessage = "Age greater then -1";
        double ticketPrice = 0.0;
        if (!(age >= 0)){
            System.out.printf("%s", errorMessage);
        } else if (age <= 12){
            ticketPrice = 5;
        } else if (age <= 19){
            ticketPrice = 8;
        } else {
            ticketPrice = 10;
        }

        System.out.printf("The ticket price is: $%.2f", ticketPrice);
    }
}
