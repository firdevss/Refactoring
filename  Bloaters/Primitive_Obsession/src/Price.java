public class Price {

    private double amount;

    public Price(double amount) {
        this.amount = amount;
    }

    public double getValue() {
        return amount;
    }

    public String toString() {
        return String.format("$%.2f", amount);
    }
}
