import java.util.ArrayList;
import java.util.List;

public class VendingMachine extends SelfServiceMachine implements PaymentEnabled {
    
    private double earnings;
    private double balance;
    private List<Drink> transactionHistory;
    
    public VendingMachine(String location) {
        this.machineName = "Vending Machine";
        this.location = location;
        this.earnings = 0;
        this.balance = 0;
        this.transactionHistory = new ArrayList<>();
    }

    @Override
    public void pay(double payment) {
        System.out.println("An amount of $" + payment + " has been inserted.");
        this.balance += payment;
    }

    public void selectDrink(Drink drink) {
        if (this.balance >= drink.getPrice()) {
            dispenseDrink(drink);
            returnChange();
        } else {
            System.out.println("Insufficient funds to purchase this drink! Please insert more coins.");
            System.out.println("Current amount: " + balance);
        }
    }

    private void dispenseDrink(Drink drink) {
        this.balance -= drink.getPrice();
        this.earnings += drink.getPrice();
        transactionHistory.add(drink);
        System.out.println("Dispensing " + drink.getName());
    }

    private void returnChange() {
        System.out.println("Returning change of: " + this.balance);
        this.balance = 0;
    }

    public void printEarnings() {
        System.out.printf("Total earnings are $%,.2f.%n", earnings);
        System.out.println(transactionHistory);
    }

    @Override
    public void track() {
        System.out.println("Tracking Vending Machine...");
        System.out.println("Location: " + location);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Drink> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<Drink> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }
}

enum Drink {
    COKE("Coke", 1.5),
    PEPSI("Pepsi", 1.5),
    FANTA("Fanta", 2),
    WATER("Water", 0.8);

    String name;
    double price;

    Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}