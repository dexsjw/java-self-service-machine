public class InfoKiosk extends SelfServiceMachine {

    public InfoKiosk(String location) {
        this.machineName = "Info Kiosk";
        this.location = location;
    }

    public void printInfo() {
        System.out.println("This is an " + machineName + " located in " + location + ".");
    }

    @Override
    public void track() {
        System.out.println("Tracking Info Kiosk...");
        System.out.println("Location: " + location);
    }

    
}
