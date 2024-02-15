
/*Refactoring a long method is a common problem in software development,
 as long methods can be difficult to understand, maintain, and test.
  They often violate the Single Responsibility Principle (SRP) and make the code less readable and more error-prone.
   Let's take an example in Java and refactor it to address this problem.

 Problem: Long Method
Consider the following Java method, which calculates the total price of items in a shopping cart:

By refactoring the long method into smaller, more focused methods, we've made the code more readable, maintainable, and testable. Additionally, adhering to the Single Responsibility Principle improves the overall design and flexibility of the codebase.



To reduce the length of a method body, use Extract Method.

If local variables and parameters interfere with extracting a method, use Replace Temp with Query, Introduce Parameter Object or Preserve Whole Object.

If none of the previous recipes help, try moving the entire method to a separate object via Replace Method with Method Object.

Conditional operators and loops are a good clue that code can be moved to a separate method. For conditionals, use Decompose Conditional. If loops are in the way, try Extract Method.

Payoff

*/


import java.util.List;

public class Main {
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
}