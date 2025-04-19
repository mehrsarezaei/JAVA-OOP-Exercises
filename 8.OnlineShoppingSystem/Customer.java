import java.util.List;

public class Customer {
    private String name;
    public ShoppingCart cart;
    int i = 0;
    public Customer(String name) {
        this.name = name;
        this.cart = new ShoppingCart();
    }

    public void addToCart(Product product) {
        cart.addItem(product);
    }

    public void removeFromCart(Product product) {
        cart.removeItem(product);
    }
    public void displayItems(List<Product> items) {
        for (Product item : items) {
            i++;
            System.out.println(i+"- " + item.getName() + " : $" + item.getPrice());
        }

    }

    public void placeOrder() {
        cart.checkout();
    }
}