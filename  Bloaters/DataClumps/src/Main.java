/*
Refactoring Data Clumps involves identifying groups of related data that are frequently passed around together and encapsulating them into their own class. This can improve code clarity, reduce duplication, and make the code more maintainable. Let's refactor a simple example in Java:

Suppose we have a class representing a shopping cart item, and it has several attributes related to shipping address:

In this class, shippingAddress, shippingCity, shippingState, and shippingZipCode form a data clump.

We can refactor this by creating a new class to represent the shipping address:
Now, let's update the ShoppingCartItem class to use the Address class:
With this refactoring, we've grouped together the related shipping address data into the Address class. Now, ShoppingCartItem class no longer needs to manage individual address components directly.

We can now create instances of ShoppingCartItem and Address:

This refactoring simplifies the ShoppingCartItem class and makes the code more modular and maintainable. It also improves readability by clearly indicating the relationship between an item and its shipping address. Additionally, it reduces redundancy by avoiding the repetition of shipping address-related fields across multiple classes or methods.
 */




public class Main {
    public static void main(String[] args) {

        RefactoredAddress shippingAddress = new RefactoredAddress("1234234", "Cankaya", "Ankara", "12345");
        ShoppingCartItem item = new ShoppingCartItem("Product 1", 50.0, shippingAddress);

        System.out.println("Item: " + item.getItemName());
        System.out.println("Price: $" + item.getPrice());
        System.out.println("Shipping Address: " + item.getShippingAddress().getAddress());
        System.out.println("Shipping City: " + item.getShippingAddress().getCity());
        System.out.println("Shipping State: " + item.getShippingAddress().getState());
        System.out.println("Shipping Zip Code: " + item.getShippingAddress().getZipCode());
    }



    }
}