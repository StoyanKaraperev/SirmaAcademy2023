import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfProduct = scanner.nextLine();
        int quantityOfProduct = Integer.parseInt(scanner.nextLine());
        calculateThePriceOfAnyProductInShop(nameOfProduct, quantityOfProduct);
    }

    public static void calculateThePriceOfAnyProductInShop(String product, int quantity){
        double coffeePrice = 1.50;
        double waterPrice = 1.00;
        double cokePrice = 1.40;
        double snacksPrice = 2.00;
        double totalPrice = 0;
        String errorMessage = "Invalid product!";
        if (product.equals("coffee")){
            totalPrice = coffeePrice * quantity;
        } else if (product.equals("water")){
            totalPrice = waterPrice * quantity;
        } else if (product.equals("coke")){
            totalPrice = cokePrice * quantity;
        } else if (product.equals("snacks")){
            totalPrice = snacksPrice * quantity;
        } else {
            System.out.printf("%s ", errorMessage);
        }

        System.out.printf("%.2f ", totalPrice);
    }
}
