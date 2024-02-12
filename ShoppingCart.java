import java.util.List;

public class ShoppingCart {
    public double calculateTotalPrice(List<Item> items) {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        applyDiscount(totalPrice);
        applyTax(totalPrice);
        return totalPrice;
    }

    private void applyDiscount(double totalPrice) {
        // logic for applying discount
    }

    private void applyTax(double totalPrice) {
        // logic for applying tax
    }
}
