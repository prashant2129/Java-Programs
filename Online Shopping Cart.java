import java.util.ArrayList;

class Product {
    String name;
    double price;
    
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Cart {
    ArrayList<Product> items = new ArrayList<>();

    void addProduct(Product p) {
        items.add(p);
        System.out.println(p.name + " added to cart.");
    }

    void checkout() {
        double total = 0;
        for (Product p : items) {
            total += p.price;
        }
        System.out.println("Total Bill: $" + total);
    }
}

public class Shopping {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 800);

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);

        cart.checkout();
    }
}
