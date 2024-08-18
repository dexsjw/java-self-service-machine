import java.util.Random;

public class ClawMachine extends SelfServiceKiosk implements PaymentEnabled {

    private static final double GAMEPRICE = 2.5;
    private static final String[] PRIZES = { "Candy", "Bear", "iPhone", "Kidney" };
    private double earnings;
    private double balance;

    public ClawMachine(String location) {
        this.location = location;
        this.earnings = 0;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printEarnings() {
        System.out.printf("This Claw Machine located at %s currently has $%,.2f of earnings.%n", location, earnings);
    }

    public void play() {
        if (balance >= GAMEPRICE) {
            playGame();
            System.out.printf("Returning $%,.2f of changes.%n", balance - GAMEPRICE);
            balance = 0;
        } else {
            System.err.println("Not enough coins to play a game");
        }
    }

    private void playGame() {
        Random rand = new Random();
        int rand_int = rand.nextInt(PRIZES.length);
        System.out.println("Playing game...");
        String prize = PRIZES[rand_int];
        System.out.println("Congratulations!! You've won a " + prize);
    }

    @Override
    public void pay(double amt) {
        this.balance += amt;
    }

    @Override
    public void track() {
        System.out.println("Tracking Claw Machine...");
    }

}
