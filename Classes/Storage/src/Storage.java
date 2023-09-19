import java.util.ArrayList;

public class Storage {
    private int capacity;
    private ArrayList<Product> products;

    public Storage(int capacity){
        this.capacity = capacity;

        this.products = new ArrayList<Product>();
    }

    public int getCapacity(){
        for (int i = 0; i < this.products.size(); i++) {
            this.capacity -= this.products.get(i).getQuantity();
        }

        return this.capacity;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public double totalCoast(){
        double totalPrice = 0;
        double pricePerProduct = 0;
        for (int i = 0; i < this.products.size(); i++) {
            double priceForOneProduct = products.get(i).getPrice();
            double quantity = products.get(i).getQuantity();
            pricePerProduct = priceForOneProduct * quantity;
            totalPrice += pricePerProduct;
        }

        return totalPrice;
    }

    public void getProducts(){
        for (var product :
             products) {
            System.out.printf("%s, %.2f, %.2f %n", product.getName(), product.getPrice(), product.getQuantity());
        }
    }
}
