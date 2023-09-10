import java.util.Scanner;

public class P22DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String haveAMembershipCard = scanner.nextLine();
        String output = "";
        String errorMessageAge = "Invalid age!";
        String errorMessageCard = "Value must be Yes or No!";
        if (age < 0){
            output = errorMessageAge;
        } else if (age < 18){
            output = "10% discount";
        } else if (age <= 64){
            if (haveAMembershipCard.equals("Yes")){
                output = "20% discount";
            } else if (haveAMembershipCard.equals("No")){
                output = "10% discount";
            } else {
                output = errorMessageCard;
            }
        } else {
            output = "30% discount";
        }

        System.out.printf("%s", output);
    }
}
