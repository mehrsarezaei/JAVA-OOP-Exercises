import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String accountNumber = new String("");
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Bank bank = new Bank();
        Scanner input = new Scanner(System.in);
        System.out.println("please Enter your name:");
        String name = input.nextLine();
        while(name.length() == 0) {
            System.out.println("please Enter your name:");
            name = input.nextLine();
        }
        System.out.println("please Enter your account number:");
        accountNumber = input.nextLine();
        Matcher matcher = pattern.matcher(accountNumber);
        while(accountNumber.length() != 6 || matcher.find() ) {
            System.out.println("Invalid account number (must be 6 digits):");
            accountNumber = input.nextLine();
        }

        Customer customer1 = new Customer(name, accountNumber);
        bank.addCustomer(customer1);
        System.out.println("welcome to Nooshirvani bank " + name +"\nwould you like to deposit (1) or withdraw (2) your money ? " );
        System.out.println("your current balance is $0.0");
        int answer = input.nextInt();
        while(answer != 1 && answer != 2) {
            System.out.println("Please enter 1 or 2:");
            answer = input.nextInt();
        }
        if (answer == 1) {
            System.out.println("how much would you like to deposit?");
            double amount = input.nextDouble();
            while (amount <= 0) {
                System.out.println("Please enter a positive number");
                amount = input.nextDouble();
            }
            customer1.depositMoney(amount);
            System.out.println("would you like to withdraw too? (Y/N)");
            String withdraw = input.nextLine();
            while(!withdraw.equalsIgnoreCase("y") && !withdraw.equalsIgnoreCase("n")) {
                System.out.println("Please enter Y or N:");
                withdraw = input.nextLine();
            }
            if (withdraw.equalsIgnoreCase("Y")) {
                System.out.println("how much would you like to withdraw?");
                double amount1 = input.nextDouble();
                while (amount1 <= 0) {
                    System.out.println("Please enter a positive number");
                    amount1 = input.nextDouble();
                }
                customer1.withdrawMoney(amount1);
            }
        }
        else if (answer == 2) {
            System.out.println("how much would you like to withdraw?");
            double amount = input.nextDouble();
            while (amount <= 0) {
                System.out.println("Please enter a positive number");
                amount = input.nextDouble();
            }
            customer1.withdrawMoney(amount);
            System.out.println("would you like to deposit too? (Y/N)");
            String deposit = input.nextLine();
            while(!deposit.equalsIgnoreCase("y") && !deposit.equalsIgnoreCase("n") || deposit == null) {
                System.out.println("Please enter Y or N:");
                deposit = input.nextLine();
            }
            System.out.println("how much would you like to deposit?");
            double amount2 = input.nextDouble();
            while (amount2 <= 0) {
                System.out.println("Please enter a positive number");
                amount2 = input.nextDouble();
            }
            customer1.depositMoney(amount2);
        }
        customer1.checkBalance();
        System.out.println("thank you for using Nooshirvani bank <3");
    }
}