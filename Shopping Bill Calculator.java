public class Main {
    public static void main(String[] args) {
        final double GST_RATE = 0.18;
        String item = "Laptop";
        double price = 50000;   // item price
        int quantity = 2;       // number of items

        double totalPrice = price * quantity;
        double tax = totalPrice * GST_RATE;
        double finalAmount = totalPrice + tax;

        System.out.println("Item: " + item);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("GST (18%): " + tax);
        System.out.println("Final Amount to Pay: " + finalAmount);
    }
}
