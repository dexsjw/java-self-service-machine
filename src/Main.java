public class Main {
    public static void main(String[] args) {
        String location = "NTU";
        VendingMachine ntuVendingMachine = new VendingMachine(location);
        ClawMachine ntuClawMachine = new ClawMachine(location);
        InfoKiosk ntuInfoKiosk = new InfoKiosk(location);

        System.out.println("====================");
        System.out.println("  " + ntuVendingMachine.getMachineName() + "   ");
        System.out.println("====================");
        ntuVendingMachine.pay(0.50); // 💵 Inserted 0.5
        ntuVendingMachine.selectDrink(Drink.COKE); // 🧃 Selected COKE, ❌ Payment insufficient!
        ntuVendingMachine.pay(1.00); // 💵 Inserted 2.0
        ntuVendingMachine.pay(1.00); // 💵 Inserted 2.0
        ntuVendingMachine.selectDrink(Drink.COKE); // 🧃 Selected COKE ✅ Payment sufficient! 🧃 Drink COKE dispensed.
        ntuVendingMachine.printEarnings(); // 🤑 Earnings: 1.5
        ntuVendingMachine.printTransactions(); // 🧾 Transactions: VendingTransaction[drink=COKE, amount=1.5]
        ntuVendingMachine.track(); // Tracking VendingMachine NTU

        System.out.println("====================");
        System.out.println("    " + ntuClawMachine.getMachineName() + "    ");
        System.out.println("====================");
        ntuClawMachine.pay(1); // 💵 Inserted 1.0
        ntuClawMachine.pay(1); // 💵 Inserted 1.0
        ntuClawMachine.pay(0.5); // 💵 Inserted 0.5
        ntuClawMachine.play(); // 🎮 Playing game... 🎁 You won a CANDY!
        ntuClawMachine.pay(1); // 💵 Inserted 1.0
        ntuClawMachine.pay(1); // 💵 Inserted 1.0
        ntuClawMachine.pay(1); // 💵 Inserted 1.0
        ntuClawMachine.play();
        ntuClawMachine.getEarnings(); // Earnings: 18.0
        ntuClawMachine.track(); // Tracking ClawMachine NTU

        System.out.println("====================");
        System.out.println("     " + ntuInfoKiosk.getMachineName() + "     ");
        System.out.println("====================");
        ntuInfoKiosk.printInfo(); // 📰 Printing info...
        ntuInfoKiosk.track(); // Tracking InfoKiosk NTU
    }
}
