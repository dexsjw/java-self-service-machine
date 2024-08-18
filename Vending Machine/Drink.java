public enum Drink {
    COKE(1.5),
    PEPSI(1.5),
    FUNTA(2),
    WATER(0.8),
    INVALID(0);

    private double price;

    Drink(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("%s: $%,.2f", this.name(), this.price);
    }

    public static Drink getDrink(String name) {
        for (Drink drink : Drink.values()) {
            if (drink.name().equals(name.toUpperCase())) {
                return drink;
            }
        }
        return Drink.INVALID;
    }
}
