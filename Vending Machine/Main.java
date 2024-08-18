public class Main {
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("Vending machine");
        System.out.println("====================");

        VendingMachine ntuVendingMachine = new VendingMachine("NTU");
        ntuVendingMachine.pay(0.50); // 💵 Inserted 0.5
        ntuVendingMachine.selectDrink(Drink.COKE); // 🧃 Selected COKE, ❌ Payment insufficient!
        ntuVendingMachine.pay(1.00); // 💵 Inserted 2.0
        ntuVendingMachine.pay(1.00); // 💵 Inserted 2.0
        ntuVendingMachine.selectDrink(Drink.COKE); // 🧃 Selected COKE ✅ Payment sufficient! 🧃 Drink COKE dispensed.
        ntuVendingMachine.printEarnings(); // 🤑 Earnings: 1.5
        ntuVendingMachine.printTransactions(); // 🧾 Transactions: VendingTransaction[drink=COKE, amount=1.5]
        ntuVendingMachine.track(); // Tracking VendingMachine NTU

        System.out.println();
        System.out.println("====================");
        System.out.println("Claw machine");
        System.out.println("====================");

        ClawMachine ntuClawMachine = new ClawMachine("NTU");
        ntuClawMachine.pay(1); // 💵 Inserted 1.0
        ntuClawMachine.pay(1); // 💵 Inserted 1.0
        ntuClawMachine.pay(0.5); // 💵 Inserted 0.5
        ntuClawMachine.play(); // 🎮 Playing game... 🎁 You won a CANDY!
        ntuClawMachine.pay(1); // 💵 Inserted 1.0
        ntuClawMachine.pay(1); // 💵 Inserted 1.0
        ntuClawMachine.pay(1); // 💵 Inserted 1.0
        ntuClawMachine.play();
        ntuClawMachine.printEarnings(); // Earnings: 18.0
        ntuClawMachine.track(); // Tracking ClawMachine NTU

        System.out.println();
        System.out.println("====================");
        System.out.println("Info kiosk");
        System.out.println("====================");

        InfoKiosk ntuInfoKiosk = new InfoKiosk("NTU");
        ntuInfoKiosk.printInfo(); // 📰 Printing info...
        ntuInfoKiosk.track(); // Tracking InfoKiosk NTU
    }
}
