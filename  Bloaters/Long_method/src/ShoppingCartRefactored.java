import java.util.List;
public class ShoppingCartRefactored {

    public double calculateTotalPrice(List<Item> items) {
        double totalPrice = calculateSubtotal(items);
        totalPrice = applyDiscount(totalPrice);
        totalPrice = applyTax(totalPrice);
        return totalPrice;
    }

    private double calculateSubtotal(List<Item> items) {
        double subtotal = 0;
        for (Item item : items) {
            subtotal += item.getPrice();
        }
        return subtotal;
    }

    private double applyDiscount(double totalPrice) {
        // logic for applying discount
        double discountAmount = 0.10;
        return totalPrice - discountAmount;
    }

    private double applyTax(double totalPrice) {
        // logic for applying tax
        double taxAmount = 0.8;
        return totalPrice + taxAmount;
    }

}
