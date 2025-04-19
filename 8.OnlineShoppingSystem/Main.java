import javax.xml.transform.Source;
import java.lang.invoke.CallSite;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        System.out.println("welcome to our shop <3\nMay i ask your name sir/mam?");
        String CustomerName = scanner.nextLine();
        while(CustomerName.equals("")) {
            System.out.println("please enter your name:");
            CustomerName = scanner.nextLine();
        }
        System.out.println("how many products do you want to add?");
        int count = Integer.parseInt(scanner.nextLine());
        while (count < 0) {
            System.out.println("Please enter a number greater than 0:");
            count = Integer.parseInt(scanner.nextLine());
        }
        Store store = new Store();        System.out.println("which items are you looking for " + CustomerName +"?:"+ "\n1.Phone \n2.Laptop \n3.Smart watch \n4.Headphone \n5.Gaming devices");

        Customer customer = new Customer(CustomerName);
        for (int i = 1; i <= count; i++) {
            if(i==2) {
                System.out.println("What is next?");
            }
            int choice = Integer.parseInt(scanner.nextLine());
            while (choice <= 0 || choice > 5) {
                System.out.println("Invalid choice please try again:");
                choice = Integer.parseInt(scanner.nextLine());
            }
            switch (choice) {
                case 1: {
                    Product phone = new Product("Smartphone", 499.99);
                    store.addProduct(phone);
                    customer.addToCart(phone);
                    break;
                }
                case 2: {
                    Product laptop = new Product("Laptop", 999.99);
                    store.addProduct(laptop);
                    customer.addToCart(laptop);
                    break;
                }
                case 3: {
                    Product smart = new Product("Smart Watch", 199.99);
                    store.addProduct(smart);
                    customer.addToCart(smart);
                    break;
                }
                case 4: {
                    Product headphone = new Product("Headphone", 399.99);
                    store.addProduct(headphone);
                    customer.addToCart(headphone);
                    break;
                }
                case 5: {
                    Product gaming = new Product("Gaming Devices", 1999.99);
                    store.addProduct(gaming);
                    customer.addToCart(gaming);
                    break;
                }
            }
        }
        System.out.println("would you like to add an item to your cart? (y/n)");
        String answer1 = scanner.nextLine();
        while (answer1 == null || !answer1.equalsIgnoreCase("y") && !answer1.equalsIgnoreCase("n")) {
            System.out.println("Please enter 'y' or 'n':");
            answer1 = scanner.nextLine();
        }
        if (answer1.equalsIgnoreCase("y")) {
            System.out.println("how many products do you want to add?");
            int count2 = Integer.parseInt(scanner.nextLine());
            while (count2 <= 0) {
                System.out.println("Please enter a number greater than 0:");
                count2 = Integer.parseInt(scanner.nextLine());
            }
            count+=count2;
            System.out.println("what do you want to add?\n1.Phone \n2.Laptop \n3.Smart watch \n4.Headphone \n5.Gaming devices");
            int choice1 = Integer.parseInt(scanner.nextLine());
            while (choice1 <= 0 || choice1 > 5) {
                System.out.println("Invalid choice please try again:");
                choice1 = Integer.parseInt(scanner.nextLine());
            }
            for (int i = 0; i < count2; i++) {
                switch (choice1) {
                    case 1: {
                        Product phone = new Product("Smartphone", 499.99);
                        store.addProduct(phone);
                        customer.addToCart(phone);
                        break;
                    }
                    case 2: {
                        Product laptop = new Product("Laptop", 999.99);
                        store.addProduct(laptop);
                        customer.addToCart(laptop);
                        break;
                    }
                    case 3: {
                        Product smart = new Product("Smart Watch", 199.99);
                        store.addProduct(smart);
                        customer.addToCart(smart);
                        break;
                    }
                    case 4: {
                        Product headphone = new Product("Headphone", 399.99);
                        store.addProduct(headphone);
                        customer.addToCart(headphone);
                        break;
                    }
                    case 5: {
                        Product gaming = new Product("Gaming Devices", 1999.99);
                        store.addProduct(gaming);
                        customer.addToCart(gaming);
                        break;
                    }
                }
            }
        }
            System.out.println("would you like to remove an item in your cart? (y/n)");
        String answer = scanner.nextLine();
        while (answer == null || !answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
            System.out.println("Please enter 'y' or 'n':");
            answer = scanner.nextLine();
        }
        {}
        if (answer.equals("y")) {
            customer.displayItems(store.getProducts());
            System.out.println("how many products do you want to remove?");
            int count1 = Integer.parseInt(scanner.nextLine());
            System.out.println("which items do you want to remove?");
            for (int i = 1; i <= count1; i++) {
                if(i>=2) {
                    System.out.println("What is next?");
                }
                    int itemsToRemove = Integer.parseInt(scanner.nextLine());
                    while(itemsToRemove <= 0 || itemsToRemove > count) {
                        System.out.println("Invalid choice please try again:");
                        itemsToRemove = Integer.parseInt(scanner.nextLine());
                    }
                customer.removeFromCart(ShoppingCart.items.get(itemsToRemove-i));
            }

        }
            if(customer.cart.isCartEmpty(ShoppingCart.items)){
                System.out.println("thank you for using our shop!");
            }
            else {
                customer.placeOrder();
            }
    }

}
