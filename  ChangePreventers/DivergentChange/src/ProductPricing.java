public class ProductPricing {
    private double price;
    private int quantityInStock;

    public ProductPricing(double price, int quantityInStock) {
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public void displayProductPricing() {
        System.out.println("Price: $" + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
    }

}
