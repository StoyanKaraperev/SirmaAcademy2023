import java.util.Scanner;

public class P15MakeupShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOfTheRenovation = Double.parseDouble(scanner.nextLine());
        int numberOfPowders = Integer.parseInt(scanner.nextLine());
        int numberOfLipsticks = Integer.parseInt(scanner.nextLine());
        int numberOfSpirals = Integer.parseInt(scanner.nextLine());
        int numberOfShadows = Integer.parseInt(scanner.nextLine());
        int numberOfCorrectors = Integer.parseInt(scanner.nextLine());
        int numberOfMakeUp = 50;
        int orderedMakeUp = numberOfCorrectors + numberOfLipsticks + numberOfShadows + numberOfSpirals + numberOfPowders;
        double totalPriceOfPowders = numberOfPowders * 2.60;
        double totalPriceOfLipsticks = numberOfLipsticks * 3.00;
        double totalPriceOfSpirals = numberOfSpirals * 4.10;
        double totalPriceOfShadows = numberOfShadows * 8.20;
        double totalNumberOfCorrectors = numberOfCorrectors * 2.00;
        double amount = totalPriceOfPowders + totalPriceOfLipsticks + totalPriceOfSpirals + totalPriceOfShadows + totalNumberOfCorrectors;
        double discount = 0.25;
        double finalPrice = 0.0;
        double rent = 0.1;
        double profit = 0.0;
        double remainingMoney = 0.0;
        if (orderedMakeUp >= numberOfMakeUp){
            finalPrice = amount - (amount * discount);
            profit = finalPrice - (finalPrice * rent);
            if (profit > priceOfTheRenovation){
                remainingMoney = profit - priceOfTheRenovation;
                System.out.printf("Yes! %.2f lv left.", remainingMoney);
            } else {
                remainingMoney = Math.abs(profit - priceOfTheRenovation);
                System.out.printf("Not enough money! %.2f lv needed.", remainingMoney);
            }
        } else {
            profit = amount - (amount * rent);
            if (profit > priceOfTheRenovation){
                remainingMoney = profit - priceOfTheRenovation;
                System.out.printf("Yes! %.2f lv left.", remainingMoney);
            } else {
                remainingMoney = Math.abs(profit - priceOfTheRenovation);
                System.out.printf("Not enough money! %.2f lv needed.", remainingMoney);
            }
        }

    }
}
