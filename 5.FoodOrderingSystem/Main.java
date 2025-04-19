import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        String orderStatus;
        MenuItem burger = new MenuItem("Burger", 5.99);
        MenuItem pizza = new MenuItem("Pizza", 8.99);
        MenuItem salad = new MenuItem("salad", 2.99);
        MenuItem pasta = new MenuItem("pasta", 1.99);
        MenuItem drinks = new MenuItem("drinks", 2.99);
        MenuItem steak = new MenuItem("steak", 1.99);
        String name = input.nextLine();
        StringBuilder orderStatus1 = new StringBuilder();


        System.out.println("Hello what kind of meal are you looking for?\n1. Burger\n2. Pizza\n3. Salad\n4. Pasta\n5. Drinks\n6. Steak" );
        orderStatus = input.nextLine();
        for (char c : orderStatus.toCharArray()){
            if(c != ' '){
                orderStatus1.append(c);
            }
        }

        for(int i = 0; i < orderStatus1.length(); i++) {
            while (orderStatus1.charAt(i) < '1' || orderStatus1.charAt(i) > '6') {
            System.out.println("Invalid order status");
                orderStatus1.charAt(i)
            }
            switch (orderStatus) {
                case "1": {
                    customer.placeOrder(burger);
                    Order order = customer.placeOrder(burger);
                    restaurant.receiveOrder(order);
                    break;
                }
                case "2": {
                    customer.placeOrder(pizza);
                    Order order = customer.placeOrder(pizza);
                    restaurant.receiveOrder(order);
                    break;
                }
                case "3": {
                    customer.placeOrder(salad);
                    Order order = customer.placeOrder(salad);
                    restaurant.receiveOrder(order);
                    break;
                }
                case "4": {
                    customer.placeOrder(pasta);
                    Order order = customer.placeOrder(pasta);
                    restaurant.receiveOrder(order);
                    break;
                }
                case "5": {
                    customer.placeOrder(drinks);
                    Order order = customer.placeOrder(drinks);
                    restaurant.receiveOrder(order);
                    break;
                }
                case "6": {
                    customer.placeOrder(steak);
                    Order order = customer.placeOrder(steak);
                    restaurant.receiveOrder(order);
                    break;
                }
            }
        }

        Order order = customer.placeOrder(burger, pizza);
        restaurant.receiveOrder(order);

        restaurant.updateOrderStatus(order, "In Progress");
    }
}