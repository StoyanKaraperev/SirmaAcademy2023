import java.util.Scanner;

public class P10Grocery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (city.equals("Sofia")){
            switch (product) {
                case "coffee" -> price = quantity * 0.50;
                case "water" -> price = quantity * 0.80;
                case "juice" -> price = quantity * 1.20;
                case "sweets" -> price = quantity * 1.45;
                case "chips" -> price = quantity * 1.60;
                default -> System.out.println("Invalid product");
            }
        } else if (city.equals("Plovdiv")) {
            switch (product) {
                case "coffee" -> price = quantity * 0.40;
                case "water" -> price = quantity * 0.70;
                case "juice" -> price = quantity * 1.15;
                case "sweets" -> price = quantity * 1.30;
                case "chips" -> price = quantity * 1.50;
                default -> System.out.println("Invalid product");
            }
        } else if (city.equals("Varna")){
            switch (product) {
                case "coffee" -> price = quantity * 0.45;
                case "water" -> price = quantity * 0.70;
                case "juice" -> price = quantity * 1.10;
                case "sweets" -> price = quantity * 1.35;
                case "chips" -> price = quantity * 1.55;
                default -> System.out.println("Invalid product");
            }
        } else {
            System.out.println("Invalid city");
            return;
        }

        System.out.printf("The product price is: %.2f",price);
    }
}
