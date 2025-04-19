import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<Product> inventory;

    public Store() {
        this.inventory = new ArrayList<>();
    }

    public void addProduct(Product product) {
        inventory.add(product);
    }

    public List<Product> getProducts() {
        return inventory;
    }
}