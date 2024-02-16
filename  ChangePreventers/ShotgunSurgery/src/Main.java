/*Shotgun Surgery is a code smell where a single change to the codebase requires modifications to multiple classes or modules. It often indicates that the responsibilities within the system are not well encapsulated and may lead to maintenance challenges. Refactoring to eliminate Shotgun Surgery typically involves restructuring the code to improve cohesion and reduce coupling.
In this example, every time a withdrawal is made from the Account class, a transaction log is recorded using the TransactionLogger class. This creates Shotgun Surgery because any change in transaction logging behavior requires modifications to both Account and TransactionLogger.

To refactor and remove Shotgun Surgery, we can use the Observer design pattern.

This refactoring eliminates Shotgun Surgery by decoupling the Account class from the TransactionLogger class, making the code more maintainable and flexible
 */

public class Main {
    public static void main(String[] args) {
        AccountRefactored account = new AccountRefactored("12345", 1000);
        TransactionLogger logger = new TransactionLogger();
        account.addObserver(logger);

        account.withdraw(500);

        System.out.println("Hello world!");
    }
}