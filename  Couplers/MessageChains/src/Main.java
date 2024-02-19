/*
* Message chains occur when one object retrieves another object, which in turn retrieves yet another object, leading to a series of method calls. Refactoring message chains involves breaking these chains by introducing intermediate methods or objects to improve code readability and maintainability. Let's consider an example and refactor it using Java, utilizing the Runnable interface.
In this example, Order accesses Customer, which in turn accesses Address, resulting in a message chain.*
* n the refactored code:

The getCustomerAddress method in the Order class is replaced with getCustomerFullAddress, which directly calls getFullAddress on the Customer object.
The getAddress method in the Customer class is removed, and getFullAddress is directly called on the Address object.
This removes the message chain and makes the code more readable and maintainable by reducing unnecessary indirection.
*
* */

public class Main {
    public static void main(String[] args) {
        // Create an Address instance
        Address address = new Address("123 Main St, City, Country");

        // Create a Customer instance with the Address
        CustomerRefactored customerRefactored = new CustomerRefactored(address);

        // Create an Order instance with the Customer
        Order order = new Order(customerRefactored);

        // Get and print the customer's full address
        String customerFullAddress = OrderRefactored.getCustomerFullAddress();
        System.out.println("Customer's Full Address: " + customerFullAddress);


    }
}