import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static List<Product> items;
    int i = 0;
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
        System.out.println(product.getName() + " added to cart.");
    }
    public void removeItem(Product product) {
        items.remove(product);
        System.out.println(product.getName() + " removed from cart.");
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
    public boolean isCartEmpty(List<Product> cart) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty!");
            return true;
        }
        return false;
    }
    public void checkout() {
        for (Product product : items) {
            i++;
            System.out.println( i +"- "+ product.getName() + " : $" + product.getPrice());
        }
        System.out.println("Total amount: $" + calculateTotal());
        System.out.println("Order placed successfully!");
        System.out.println("<<thank you for shopping!>>\nhope to see you soon! :D");
        items.clear();
    }
}