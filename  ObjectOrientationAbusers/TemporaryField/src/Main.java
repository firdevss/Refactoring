/*
*
* mporary fields are variables that are used only for a short duration within a method. Refactoring them can lead to cleaner and more understandable code.

In this example, we'll start with a class Order that has a temporary field totalPrice, which is used only within the calculateTotalPrice() method. We'll refactor this code to eliminate the temporary field.
*
* In the refactored version, we removed the totalPrice field from the class level and defined it as a local variable within the calculateTotalPrice() method. This eliminates the need for a temporary field, making the code cleaner and easier to understand.
*
*
* */

public class Main {
    public static void main(String[] args) {

        // Create an order with some item prices
        double[] itemPrices = {10.99, 5.49, 8.79};
        Order order = new Order(itemPrices);

        // Calculate and print the total price
        double totalPrice = order.calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);


    }
}