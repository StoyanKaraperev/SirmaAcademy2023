import java.util.ArrayList;
import java.util.Scanner;

public class StartUp {
    public static void main(String[] args) {
        Product productOne = new Product("cucumber", 1.50,  15);
        Product productTwo = new Product("tomato", 0.90,25);
        Product productThree = new Product("bred", 1.10, 8);
        Storage storage1 = new Storage(50);
        storage1.addProduct(productOne);
        storage1.addProduct(productTwo);
        storage1.addProduct(productThree);
        storage1.getProducts();
        System.out.println(storage1.getCapacity());
        System.out.println(storage1.totalCoast());

    }
}
