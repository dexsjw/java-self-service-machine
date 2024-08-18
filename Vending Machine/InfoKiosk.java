public class InfoKiosk extends SelfServiceKiosk {

    public InfoKiosk(String location) {
        this.location = location;
    }

    public void printInfo() {
        System.out.println("You are currently here --> " + location);
    }

    @Override
    public void track() {
        System.out.println("Tracking Info Kiosk");
    }

}
