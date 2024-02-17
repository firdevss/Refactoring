/*To refactor a lazy class, we can either enrich it by adding more functionality or remove it if its functionality is redundant. Let's consider a simple example of a lazy class Person that only holds basic information:
In this example, the Person class only holds basic information about a person and doesn't provide much functionality beyond getters and setters. To refactor this class, we can either add more behavior to justify its existence or remove it if it doesn't serve a meaningful purpose.
n this refactoring, we've added two new methods isAdult() and greet() to provide additional behavior to the Person class. Now, the class is more than just a data holder and offers meaningful functionality, justifying its existence as a separate class. This makes the class more useful and eliminates its "lazy" status.

 */

public class Main {
    public static void main(String[] args) {

            PersonRefactored person = new PersonRefactored("Alice", 30);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

            // Using new behavior
            System.out.println("Is adult? " + person.isAdult());
            person.greet();




    }
}