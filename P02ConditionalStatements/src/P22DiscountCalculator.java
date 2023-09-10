import java.util.Scanner;

public class P22DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String haveAMembershipCard = scanner.nextLine();
        String discout = "";
        if (age < 18){
            discout = "10% discount";
        } else if (age <= 64){
            if (haveAMembershipCard.equals("Yes")){
                discout = "20% discount";
            } else {
                discout = "10% discount";
            }
        } else {
            discout = "30% discount";
        }

        System.out.printf("%s", discout);
    }
}
