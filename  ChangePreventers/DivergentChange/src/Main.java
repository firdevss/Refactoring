/*
efactor a class that handles both product details and product pricing into separate classes. We'll create a ProductDetails class for managing product information and a ProductPricing class for managing pricing-related tasks.
In this refactored code, we separated the responsibilities of the Product class into two separate classes: ProductDetails for managing product information and ProductPricing for managing pricing-related tasks. Each class now focuses on a specific aspect of the product entity, adhering to the Single Responsibility Principle. This makes the code easier to maintain and extend.



 */

public class Main {
    public static void main(String[] args) {

        ProductDetails productDetails = new ProductDetails("Laptop", "High-performance laptop", "Electronics");
        ProductPricing productPricing = new ProductPricing(999.99, 10);

        // Display product details
        System.out.println("Product Details:");
        productDetails.displayProductDetails();

        // Display product pricing information
        System.out.println("\nProduct Pricing:");
        productPricing.displayProductPricing();

        System.out.println("Hello world!");
    }
}