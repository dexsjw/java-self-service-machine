import java.util.ArrayList;

public class VendingMachine extends SelfServiceKiosk implements PaymentEnabled {
    private double earnings;
    private double balance;
    private ArrayList<String> transactions;

    VendingMachine(String location) {
        this.location = location;
        this.earnings = 0;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    @Override
    public void pay(double amt) {
        transactions.add(String.format("User inserted $%,.2f", amt));
        this.balance += amt;
    }

    public void selectDrink(Drink drink) {
        transactions.add(String.format("User selected %s", drink));
        if (balance >= drink.getPrice()) {
            dispenseDrink(drink);
            System.out.printf("Returning $%,.2f of changes.%n", balance - drink.getPrice());
            balance = 0;
        } else {
            transactions.add(String.format("%s was not dispensed", drink));
            System.err.println("Not enough coins to dispense this drink");
        }
    }

    public void getPrice(Drink drink) {
        System.out.println(drink);
    }

    private void dispenseDrink(Drink drink) {
        transactions.add(String.format("%s was dispensed", drink));
        System.out.println("Dispensing " + drink + " ...");
        earnings += drink.getPrice();
    }

    public void printEarnings() {
        System.out.printf("This Vending Machine located at %s currently has $%,.2f of earnings.%n", location, earnings);
    }

    public void printTransactions() {
        for (String transc : transactions) {
            System.out.println(transc);
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void track() {
        System.out.println("Tracking Vending Machine...");
    }

}
