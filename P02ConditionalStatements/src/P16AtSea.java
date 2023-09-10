import java.util.Scanner;

public class P16AtSea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayToStay = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String assessment = scanner.nextLine();
        double totalPrice = 0.0;
        if (!(dayToStay >= 0 && dayToStay < 365)){
            System.out.println("The days to stay must be between 0 to 365");
            return;
        }
        switch (typeOfRoom){
            case "single room":
                totalPrice = (dayToStay - 1) * 25.00;
                break;
            case "apartment":
                totalPrice = (dayToStay -1) * 50.00;
                if (dayToStay < 10){
                    totalPrice -= totalPrice * 0.3;
                } else if (dayToStay <= 15){
                    totalPrice -= totalPrice * 0.35;
                } else {
                    totalPrice -= totalPrice * 0.5;
                }
                break;
            case "presidential":
                totalPrice = (dayToStay -1) * 100.00;
                if (dayToStay < 10){
                    totalPrice -= totalPrice * 0.1;
                } else if (dayToStay <= 15){
                    totalPrice -= totalPrice * 0.15;
                } else {
                    totalPrice -= totalPrice * 0.2;
                }
                break;
            default:
                System.out.println("Invalid type of room");
                return;
        }

        if (assessment.equals("positive")){
            totalPrice += totalPrice * 0.25;
        } else if (assessment.equals("negative")){
            totalPrice -= totalPrice * 0.1;
        } else {
            System.out.println("Invalid assessment!");
            return;
        }

        System.out.printf("The price for the stay at the hotel is: %.2f", totalPrice);
    }
}
