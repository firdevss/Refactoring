/*
Refactoring the Middle Man anti-pattern involves removing unnecessary delegation through intermediary objects or methods. Let's consider a scenario where a middleman class unnecessarily delegates method calls to another class, and then refactor it to remove the middleman.
In this example, MiddleMan merely delegates method calls to FinalDestination, which serves as the ultimate receiver of the call.

To refactor and remove the middleman:
he MiddleMan class is removed entirely.
The method call is made directly to the doSomething() method of FinalDestination in the Main class.
This refactoring simplifies the code by eliminating unnecessary indirection, making it cleaner and easier to understand.


 */

public class Main {
    public static void main(String[] args) {

        // Create an instance of FinalDestination
        FinalDestination finalDestination = new FinalDestination();

        // Call the method directly on FinalDestination
        finalDestination.doSomething();

    }
}