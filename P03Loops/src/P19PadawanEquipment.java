import java.util.Scanner;

public class P19PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightSaber = Double.parseDouble(scanner.nextLine());
        double priceOfRobe = Double.parseDouble(scanner.nextLine());
        double priceOfBelt = Double.parseDouble(scanner.nextLine());
        double totalLightSaberPrice = priceLightSaber * Math.ceil(students + (students * 0.1));
        double totalRobePrice = priceOfRobe * students;
        int freeBelts = students / 6;
        double totalBeltPrice = priceOfBelt * (students - freeBelts);
        double totalPriceOfItems = totalLightSaberPrice + totalRobePrice + totalBeltPrice;
        double priceLeft = totalPriceOfItems - budget;
        if (budget > totalPriceOfItems){
            System.out.printf("The money is enough - it would cost %.2f lv.", totalPriceOfItems);
        } else {
            System.out.printf("George Lucas will need %.2f lv more.", priceLeft);
        }
    }
}
