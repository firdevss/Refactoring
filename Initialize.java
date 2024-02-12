import java.util.List;

/*Refactoring a long method is a common problem in software development,
 as long methods can be difficult to understand, maintain, and test.
  They often violate the Single Responsibility Principle (SRP) and make the code less readable and more error-prone.
   Let's take an example in Java and refactor it to address this problem.

 Problem: Long Method
Consider the following Java method, which calculates the total price of items in a shopping cart:

By refactoring the long method into smaller, more focused methods, we've made the code more readable, maintainable, and testable. Additionally, adhering to the Single Responsibility Principle improves the overall design and flexibility of the codebase.
*/

public static void main(String[] args) {
    // Create a list of items
    List<Item> items = List.of(new Item(10.0,"Jean1"),   new Item(20.0,"Jean2"), new Item(30.0,"Jean3"));
    // Create a shopping cart
    ShoppingCart cart = new ShoppingCart();
    ShoppingCartRefactored refactored=new ShoppingCartRefactored();


    // Calculate and print the total price
    System.out.println("Total price: $" + cart.calculateTotalPrice(items));
    System.out.println("Total price: $" + refactored.calculateTotalPrice(items));

}