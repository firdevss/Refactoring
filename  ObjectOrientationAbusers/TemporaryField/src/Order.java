public class Order {
    private double[] itemsPrices;
    private double totalPrice;

    public Order(double[] itemsPrices) {
        this.itemsPrices = itemsPrices;
    }
// Constructor and other methods...

    // Method to calculate total price
    public double calculateTotalPrice() {
        // Some logic to calculate total price based on itemsPrices array
        for (double price : itemsPrices) {
            totalPrice += price;
        }
        return totalPrice;
    }
}
