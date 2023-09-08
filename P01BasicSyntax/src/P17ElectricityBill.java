import java.util.Scanner;

public class P17ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unitConsumed = Integer.parseInt(scanner.nextLine());
        double ratePerUnit = Double.parseDouble(scanner.nextLine());
        int fixedCharge = 10;
        double totalBill = (unitConsumed * ratePerUnit) + fixedCharge;
        System.out.printf("Total bill is: %.2f", totalBill);
    }
}
