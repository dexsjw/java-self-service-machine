import java.util.Random;

public class ClawMachine extends SelfServiceMachine implements PaymentEnabled {

    private double earnings;
    private double balance;
    private static final double AMOUNT_TO_PLAY = 0.5;
    private static final String[] PRIZES = {"Candy", "Plushie", "iPhone", "Switch", "Mouse"};

    public ClawMachine(String location) {
        this.machineName = "Claw Machine";
        this.location = location;
        this.earnings = 0;
        this.balance = 0;
    }

    @Override
    public void pay(double payment) {
        System.out.println("An amount of $" + payment + " has been inserted.");
        this.balance += payment;
    }

    public void play() {
        if (balance >= AMOUNT_TO_PLAY) {
            playGame();
            returnChange();
        } else {
            System.out.println("Insufficient funds to play.");
        }
    }

    private void playGame() {
        this.balance -= AMOUNT_TO_PLAY;
        this.earnings += AMOUNT_TO_PLAY;
        Random rand = new Random();
        String prize = PRIZES[rand.nextInt(PRIZES.length)];
        System.out.println("Congratulations! You've won a " + prize);
    }

    private void returnChange() {
        System.out.println("Returning change of: " + this.balance);
        this.balance = 0;
    }

    @Override
    public void track() {
        System.out.println("Tracking Claw Machine...");
        System.out.println("Location: " + location);
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
}
